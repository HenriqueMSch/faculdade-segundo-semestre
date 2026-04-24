package model;

import java.util.ArrayList;

public class Banco
{
    private int codigo;
    private String nome;
    private ArrayList<Agencia> agencias;
    
    public Banco(int codigo){
        this.codigo = codigo;
        this.agencias = new ArrayList<Agencia>();
    }
    
    public void addAgencia(Agencia age){
        this.agencias.add(age);
    }
    
    public boolean setNome(String nome){
        if(!nome.equals("")){
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public ArrayList<Agencia> getAgencias(){
        return this.agencias;
    }
    
    public ArrayList<Agencia> getAgencias(String cidade){
        ArrayList<Agencia> aux = new ArrayList<Agencia>();
        for(Agencia age : this.agencias){
            if(age.getCidade().equals(cidade)){
                aux.add(age);
            } 
        }
        return aux;
    }
    
    public ArrayList<Agencia> getAgencias(int anoAbertura){
        ArrayList<Agencia> aux = new ArrayList<Agencia>();
        for(Agencia age : this.agencias){
            if(age.getAnoAbertura() == anoAbertura){
                aux.add(age);
            } 
        }
        return aux;
    }
    
    public String imprimeAgencias(){
        String texto = "";
        for(Agencia age : this.agencias){
            texto += age.getNumero() + "\n";
        }
        return texto;
    }
    
    public String imprimeAgencias(String cidade){
        String texto = "";
        for(Agencia age : this.agencias){
            if(age.getCidade().equals(cidade)){
                texto += age.getNumero() + "\n";
            }
        }
        return texto;
    }
    
    public String imprimeAgencias(int anoAbertura){
        String texto = "";
        for(Agencia age : this.agencias){
            if(age.getAnoAbertura() == anoAbertura){
                texto += age.getNumero() + "\n";
            }
        }
        return texto;
    }
    
    public Agencia getAgencia(int numero){
        for(Agencia age : this.agencias){
            if(age.getNumero() == numero){
                return age;
            } 
        }
        return null;
    }
}