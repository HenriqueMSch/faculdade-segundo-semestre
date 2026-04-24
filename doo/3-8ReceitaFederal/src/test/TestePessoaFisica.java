package test;

import model.PessoaFisica;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestePessoaFisica {

    private PessoaFisica pessoaTeste;

    @BeforeEach
    public void setUp(){
        String nome = "Henrique";
        String endereco = "Rua Fernando";
        int rg = 12345678;
        String cpf = "109.876.543-21";
        double salarioMensal = 1000.0;
        int dependentes = 0;

        pessoaTeste = new PessoaFisica(nome, endereco, rg, cpf, salarioMensal, dependentes);
    }


    @ParameterizedTest
    @CsvSource({"1000.01,70.0007", "7500.0,525", "1000000,70000"})
    public void testeImpostoAcimaDeMil(double salario, double valorEsperado){
        //Neste teste se espera que o resultado seja 7% do salario mensal

        //Arrange
        pessoaTeste.setSalarioMensal(salario);

        //act
        double valorRecebido = pessoaTeste.calcularImposto();

        //Assert
        assertEquals(valorEsperado, valorRecebido, 0.001);
    }

    @ParameterizedTest
    @CsvSource({"1000.0,50.0", "750.0,37.5", "500.01,25.0005"})
    public void testeImpostoEntreQuinhentosEMil(double salario, double valorEsperado){
        //Neste teste se espera que o resultado seja 5% do salario mensal(1000 >= valor > 500)

        //Arrange
        pessoaTeste.setSalarioMensal(salario);

        //act
        double valorRecebido = pessoaTeste.calcularImposto();

        //Assert
        assertEquals(valorEsperado, valorRecebido, 0.001);
    }

    @ParameterizedTest
    @CsvSource({"500.0,0.0", "250.0,0.0", "1.0,0.0"})
    public void testeImpostoAbaixoDeQuinhentos(double salario, double valorEsperado) {
        //Neste teste se espera que o resultado seja 0% do salario mensal, ou seja, retornar 0

        //Arrange
        pessoaTeste.setSalarioMensal(salario);

        //act
        double valorRecebido = pessoaTeste.calcularImposto();

        //Assert
        assertEquals(valorEsperado, valorRecebido,0.001);
    }


    @ParameterizedTest
    @CsvSource({"1,90.0", "2,40.0", "3,0.0"})
    public void testeImpostoDependentes(int dependentes, double valorEsperado){
        //Neste teste se espera que o resultado seja o valor do imposto com uma dedução de 50 reais para cada dependente

        //Arrange
        pessoaTeste.setSalarioMensal(2000.0);
        pessoaTeste.setDependentes(dependentes);

        //act
        double valorRecebido = pessoaTeste.calcularImposto();

        //Assert
        assertEquals(valorEsperado, valorRecebido, 0.001);
    }
}
