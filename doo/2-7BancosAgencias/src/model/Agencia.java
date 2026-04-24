package model;

public class Agencia
{
    private int numero;
    private String cidade;
    private int anoAbertura;
    
    public Agencia(int numero,String cidade,int anoAbertura){
        this.numero = numero;
        this.cidade = cidade;
        this.anoAbertura = anoAbertura;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public int getAnoAbertura(){
        return this.anoAbertura;
    }
}