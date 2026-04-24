package model;

public class Autor
{
    private String nome;
    private String pseudonimo;
    
    public Autor(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public boolean setPseudonimo(String pseudonimo){
        if(!pseudonimo.equals("")){
            this.pseudonimo = pseudonimo;
            return true;
        } else {
            return false;
        }
    }
    
    public String getPseudonimo(){
        return this.pseudonimo;
    }
}