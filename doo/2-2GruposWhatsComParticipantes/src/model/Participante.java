package model;

import java.util.ArrayList;

public class Participante
{
    private String nome;
    private String telefone;
    private ArrayList<Grupo> grupos;
    
    public Participante(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.grupos = new ArrayList<Grupo>();
    }
    
    public boolean setNome(String nome){
        if(!nome.equals("")){
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public boolean setTelefone(String telefone){
        if(true){
            this.telefone = telefone;
            return true;
        } else {
            return false;
        }
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void addGrupo(Grupo grp){
        this.grupos.add(grp);
    }
    
    public ArrayList<Grupo> getGrupos(){
        return this.grupos;
    }
    
    public String toString(){
        return "Nome: " + this.nome + ", Telefone: " + this.telefone;
    }
}