package model;

import java.util.ArrayList;

public class Livro
{
    private String titulo;
    private int ano;
    private int paginas;
    private Editora editora;
    private ArrayList<Autor> autores;
    
    public Livro(String titulo, int ano, int paginas){
        this.titulo = titulo;
        this.ano = ano;
        this.paginas = paginas;
        autores = new ArrayList<Autor>();
    }
    
    public void addAutor(Autor aut){
        this.autores.add(aut);
    }
    
    public ArrayList<Autor> getAutores(){
        return this.autores;
    }
    
    public void setEditora(Editora editora){
        this.editora = editora;
    }
    
    public Editora getEditora(){
        return this.editora;
    }
    
    public String toString(){
        String aux = "";
        for(Autor aut : this.autores){
            aux += aut.getNome() + " (" + aut.getPseudonimo() + ")\n";
        }
        String texto = "Titulo: " + this.titulo + ", Ano: " + this.ano + ", Páginas: " + this.paginas;
        texto += "\nmodel.Autor(es):\n" + aux;
        texto += "model.Editora:\n" + this.editora;
        return texto;
    }
}