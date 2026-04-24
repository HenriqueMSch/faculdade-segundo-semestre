package test;

import model.PessoaJuridica;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestePessoaJuridica {

    private PessoaJuridica empresaTeste;

    @BeforeEach
    public void setUp(){
        String nome = "Henrique";
        String endereco = "Rua Fernando";
        String cnpj = "57.937.325/0001-12";
        double faturamento = 1000.0;
        int enquadramento = 0;

        empresaTeste = new PessoaJuridica(nome, endereco, cnpj, faturamento, enquadramento);
    }


    @ParameterizedTest
    @CsvSource({"1,1000.0,20.0", "1,10000.0,200.0", "1,100000.0,2000.0"})
    public void testeEnquadramentoUm(int enquadramento, double faturamento, double valorEsperado){
        //Neste teste se espera que o resultado seja 2% do faturamento da empresa

        //Arrange
        empresaTeste.setEnquadramento(enquadramento);
        empresaTeste.setFaturamento(faturamento);

        //act
        double valorRecebido = empresaTeste.calcularImposto();

        //Assert
        assertEquals(valorEsperado, valorRecebido, 0.001);
    }

    @ParameterizedTest
    @CsvSource({"2,1000.0,50.0", "2,10000.0,500.0", "2,100000.0,5000.0"})
    public void testeEnquadramentoDois(int enquadramento, double faturamento, double valorEsperado){
        //Neste teste se espera que o resultado seja 5% do faturamento da empresa

        //Arrange
        empresaTeste.setEnquadramento(enquadramento);
        empresaTeste.setFaturamento(faturamento);

        //act
        double valorRecebido = empresaTeste.calcularImposto();

        //Assert
        assertEquals(valorEsperado, valorRecebido, 0.001);
    }

    @ParameterizedTest
    @CsvSource({"3,1000.0,150.0", "3,10000.0,1500.0", "3,100000.0,15000.0"})
    public void testeEnquadramentoTres(int enquadramento, double faturamento, double valorEsperado){
        //Neste teste se espera que o resultado seja 15% do faturamento da empresa

        //Arrange
        empresaTeste.setEnquadramento(enquadramento);
        empresaTeste.setFaturamento(faturamento);

        //act
        double valorRecebido = empresaTeste.calcularImposto();

        //Assert
        assertEquals(valorEsperado, valorRecebido, 0.001);
    }

}
