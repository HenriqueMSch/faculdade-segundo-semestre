package test;

import model.Autor;
import model.Editora;
import model.Livro;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LivroTeste
{
    @Test
    public void TesteUnitario(){
        Livro lvr1 = new Livro("Tático mira", 1987, 507);
        Editora ed1 = new Editora("Sourdine", "katowice");
        Editora ed2 = new Editora("Four Seasons","Singapura");
        Autor aut1 = new Autor("Martin");
        Autor aut2 = new Autor("Joshua");
        aut1.setPseudonimo("mtn");
        aut2.setPseudonimo("Jsh");
        
        lvr1.addAutor(aut1);
        lvr1.setEditora(ed1);
        
        assertEquals(1,lvr1.getAutores().size());
        assertEquals(aut1,lvr1.getAutores().get(0));
        
        assertEquals("Titulo: Tático mira, Ano: 1987, Páginas: 507\nAutor(es):\nMartin (mtn)\nEditora:\n" + ed1, lvr1.toString());
        
        lvr1.addAutor(aut2);
        lvr1.setEditora(ed2);
        
        assertEquals(2,lvr1.getAutores().size());
        assertEquals(aut1,lvr1.getAutores().get(0));
        assertEquals(aut2,lvr1.getAutores().get(1));
        
        assertEquals("Titulo: Tático mira, Ano: 1987, Páginas: 507\nAutor(es):\nMartin (mtn)\nJoshua (Jsh)\nEditora:\n" + ed2, lvr1.toString());
    }
}