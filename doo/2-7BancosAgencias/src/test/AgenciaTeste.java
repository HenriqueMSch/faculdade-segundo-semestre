package test;

import model.Agencia;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AgenciaTeste
{
   @Test
   public void testeInicial(){
       Agencia age1 = new Agencia(34024, "Agronomica", 1973);
       
       assertEquals(34024, age1.getNumero());
       assertEquals("Agronomica", age1.getCidade());
       assertEquals(1973, age1.getAnoAbertura());
   }
}