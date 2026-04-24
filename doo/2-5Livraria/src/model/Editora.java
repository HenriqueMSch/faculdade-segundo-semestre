package model;

public class Editora
{
    private String nome;
    private String cidade;
    
    public Editora(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCidade(){
        return this.cidade;
    }
}