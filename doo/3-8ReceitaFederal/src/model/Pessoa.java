package model;

public abstract class Pessoa
{
    protected String nome;
    protected String endereco;
    
    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public boolean setNome(String nome){
        if(nome.length() >= 2){
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setEndereco(String endereco){
        if(endereco.length() >= 2){
            this.endereco = endereco;
            return true;
        } else {
            return false;
        }
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public String getEndereco (){
        return this.endereco;
    }
    
    public abstract double calcularImposto();
    
    @Override
    public String toString(){
        String texto = "Nome: " + this.nome;
        texto += ", Endereço: " + this.endereco;
        
        return texto;
    }
}