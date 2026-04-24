package model;

import java.util.ArrayList;

public class Grupo
{
    private String nome;
    private ArrayList<Participante> participantes;
    
    public Grupo(String nome){
        this.nome = nome;
        this.participantes = new ArrayList<Participante>();
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
    
    public void addParticipante(Participante part){
        this.participantes.add(part);
    }
    
    public ArrayList<Participante> getParticipantes(){
        return this.participantes;
    }
    
    public void imprimirParticipantes(){
        for(Participante part : this.participantes){
            part.toString();
        }
    }
}