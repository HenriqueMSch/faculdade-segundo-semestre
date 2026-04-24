package test;

import model.Autor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutorTeste
{
    @Test
    public void TesteInicial(){
        Autor aut1 = new Autor("Roberto");
        
        assertEquals("Roberto", aut1.getNome());
        
        assertEquals(true, aut1.setPseudonimo("Rob"));
        assertEquals(false, aut1.setPseudonimo(""));
        
        assertEquals("Rob", aut1.getPseudonimo());
    }
}