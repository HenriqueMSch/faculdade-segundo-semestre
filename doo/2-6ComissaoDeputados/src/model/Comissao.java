package model;

import java.util.ArrayList;

public class Comissao
{
    private String titulo;
    private ArrayList<Deputado> deputados;
    
    public Comissao(String titulo){
        this.titulo = titulo;
        this.deputados = new ArrayList<Deputado>();
    }
    
    public void addDeputado(Deputado dep){
        this.deputados.add(dep);
    }
    
    public ArrayList<Deputado> getDeputados(){
        return this.deputados;
    }
    
    public ArrayList<Deputado> getDeputados(int partido){
        ArrayList<Deputado> depsPartido = new ArrayList<Deputado>();
        for(Deputado dep : this.deputados){
            if(dep.getPartido() == partido){
                depsPartido.add(dep);
            }
        }
        return depsPartido;
    }
    
    public ArrayList<Deputado> getDeputados(String estado){
        ArrayList<Deputado> depsEstado = new ArrayList<Deputado>();
        for(Deputado dep : this.deputados){
            if(dep.getEstado().equals(estado)){
                depsEstado.add(dep);
            }
        }
        return depsEstado;
    }
    
    public void imprimirDeputados(){
        ArrayList<Deputado> deps = getDeputados();
        for(Deputado dep : deps){
            System.out.println(dep.toString());
        }
    }
    
     public void imprimirDeputados(int partido){
        ArrayList<Deputado> deps = getDeputados(partido);
        for(Deputado dep : deps){
            System.out.println(dep.toString());
        }
    }
    
     public void imprimirDeputados(String estado){
        ArrayList<Deputado> deps = getDeputados(estado);
        for(Deputado dep : deps){
            System.out.println(dep.toString());
        }
    }
}