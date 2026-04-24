import java.util.ArrayList;

public class Portal
{
    private String nome;
    private String url;
    private ArrayList<Anuncio> anuncios;
    
    public Portal(String nome, String url){
        this.nome = nome;
        this.url = url;
        this.anuncios = new ArrayList<Anuncio>();
    }
    
    public void addAnuncio(Anuncio anu){
        anuncios.add(anu);
    }
    
    public ArrayList<Anuncio> getAnuncios(){
        return anuncios;
    }
    
    public String toString(){
        String texto = "Nome: " + this.nome;
        texto += "URL: " + this.url + "\n";
        
        for(Anuncio anu : anuncios){
            texto += anu.toString() + "\n";
        }
        
        return texto;
    }
}