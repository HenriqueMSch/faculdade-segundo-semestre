package modelo;

public class Categoria {

    private int codigo;
    private String nome;
    
    public Categoria(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String toString(){
        return this.codigo+" - "+this.nome;
    }

}
