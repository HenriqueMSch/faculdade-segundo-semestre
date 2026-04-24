package test;

import model.PessoaFisica;
import model.PessoaJuridica;
import model.ReceitaFederal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteReceitaFederal {

    private ReceitaFederal pessoas;
    private String endereco;
    private String nomePessoa;
    private int rg;
    private String cpf;
    private double salario;
    private int dependentes;
    private String nomeEmpresa;
    private String cnpj;
    private double faturamento;
    private int enquadramento;

    @BeforeEach
    public void setUp(){
        //Inicialização da variavel pessoas
        pessoas = new ReceitaFederal();

        //Parametros para pessoas físicas/Jurídicas
        endereco = "Rua Fernando";

        //Parametros para pessoas físicas
        nomePessoa = "Henrique";
        rg = 12345678;
        cpf = "109.876.543-21";
        salario = 1100.0;
        dependentes = 0;

        //Parametros para pessoas Jurídicas

        nomeEmpresa = "ZeroUm";
        cnpj = "57.937.325/0001-12";
        faturamento = 10000.0;
        enquadramento = 1;

        //Adicionando pessoas físicas a lista
        pessoas.addPessoa(new PessoaFisica(nomePessoa, endereco, rg, cpf, salario, dependentes));


        //Adicionando pessoas Jurídicas a lista
        pessoas.addPessoa(new PessoaJuridica(nomeEmpresa, endereco, cnpj, faturamento, enquadramento));

    }

    @Test
    public void testeImpressaoSimples(){

        //Arrange
        String textoEsperado = String.format("Nome: %s, Endereço: %s, RG: %d, CPF: %s, Salario Mensal: " + salario +", Número de dependentes: %d\n",nomePessoa, endereco, rg, cpf, dependentes);
        textoEsperado += String.format("Nome: %s, Endereço: %s, CNPJ: %s, Faturamento: "+ faturamento +", Enquadramento: %d\n", nomeEmpresa, endereco, cnpj, enquadramento);

        //act
        String textoResultado = pessoas.imprimirContribuintesDadosBasicos();

        //Assert
        assertEquals(textoEsperado, textoResultado);

    }

    @Test
    public void testeImpressaoCompleto(){

        //Arrange
        double impostoPessoa = 1100.0 * 0.07;
        double impostoEmpresa = 10000.0 * 0.02;

        String textoEsperado = String.format("Nome: %s, Endereço: %s, RG: %d, CPF: %s, Salario Mensal: " + salario +
                ", Número de dependentes: %d, Imposto: " + impostoPessoa + "\n"
                ,nomePessoa
                , endereco
                , rg
                , dependentes
        );
        textoEsperado += String.format("Nome: %s, Endereço: %s, CNPJ: %s, Faturamento: "+ faturamento +
                ", Enquadramento: %d, Imposto: " + impostoEmpresa +"\n"
                , nomeEmpresa
                , endereco
                , cnpj
                , enquadramento
        );

        //act
        String textoResultado = pessoas.imprimirContribuintesDadosCompletos();

        //Assert
        assertEquals(textoEsperado, textoResultado);

    }

}
