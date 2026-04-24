package model;

public class Deputado
{
    private int matricula;
    private String nome;
    private int partido;
    private String estado;
    
    public Deputado(int matricula, String nome, int partido, String estado){
        this.matricula = matricula;
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
    }
    
    public boolean setPartido(int partido){
        if(partido >= 10 && partido < 100){
            this.partido = partido;
            return true;
        } else {
            return false;
        }
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getPartido(){
        return this.partido;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public String toString(){
        return "Matricula: " + this.matricula + ", Nome: " + this.nome + ", Partido: " + this.partido + ", Estado: " + this.estado;
    }
}