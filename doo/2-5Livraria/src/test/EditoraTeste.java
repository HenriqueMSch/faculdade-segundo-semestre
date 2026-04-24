package test;

import model.Editora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EditoraTeste
{
    @Test
    public void TesteInicial(){
        Editora ed1 = new Editora("La Notte", "Joanesbusgo");
        
        assertEquals("La Notte", ed1.getNome());
        assertEquals("Joanesbusgo", ed1.getCidade());
    }
}