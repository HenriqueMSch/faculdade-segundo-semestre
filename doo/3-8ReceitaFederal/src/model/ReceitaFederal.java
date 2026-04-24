package model;

import java.util.ArrayList;

public class ReceitaFederal
{
    private ArrayList<Pessoa> pessoas;
    
    public ReceitaFederal(){
        this.pessoas = new ArrayList<Pessoa>();
    }
    
    public void addPessoa(Pessoa pes){
        pessoas.add(pes);
    }
    
    public ArrayList<Pessoa> getPessoas(){
        return this.pessoas;
    }
    
    public String imprimirContribuintesDadosBasicos(){
        String texto = "";
        for(Pessoa pes : pessoas){
            texto += pes.toString() + "\n";
        }
        return texto;
    }
    
    public String imprimirContribuintesDadosCompletos(){
        String texto = "";
        for(Pessoa pes : pessoas){
            texto += pes.toString() + ", Imposto: " +pes.calcularImposto() + "\n";
        }
        return texto;
    }
}