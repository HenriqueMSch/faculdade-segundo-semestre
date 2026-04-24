package test;

import model.Agencia;
import model.Banco;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class BancoTeste
{
   @Test
   public void testeInicial(){
       Agencia age1 = new Agencia(12345, "Zurique", 1973);
       Agencia age2 = new Agencia(67890, "Budapeste", 1945);
       Agencia age3 = new Agencia(23456, "Budapeste", 1973);
       Agencia age4 = new Agencia(78901, "Córdoba", 1988);
       Agencia age5 = new Agencia(34567, "Bruxelas", 1988);
       
       Banco bc1 = new Banco(98765);
       Banco bc2 = new Banco(54321);
       
       //teste get e set
       
       //set
       assertEquals(false, bc1.setNome(""));
       assertEquals(true, bc1.setNome("Wish"));
       assertEquals(false, bc2.setNome(""));
       assertEquals(true, bc2.setNome("Magic"));
       
       //get
       assertEquals("Wish", bc1.getNome());
       assertEquals("Magic", bc2.getNome());
       
       //teste array
       
       bc1.addAgencia(age1);
       bc1.addAgencia(age2);
       bc1.addAgencia(age3);
       bc2.addAgencia(age4);
       bc2.addAgencia(age5);
       
       //bc1
       ArrayList<Agencia> ageBc1 = new ArrayList<Agencia>();
       ageBc1 = bc1.getAgencias();
       
       assertEquals(3, ageBc1.size());
       assertEquals(age1, ageBc1.get(0));
       assertEquals(age2, ageBc1.get(1));
       assertEquals(age3, ageBc1.get(2));
       
       ArrayList<Agencia> ageBc1String = new ArrayList<Agencia>();
       ageBc1String = bc1.getAgencias("Budapeste");
       
       assertEquals(2, ageBc1String.size());
       assertEquals(age2, ageBc1String.get(0));
       assertEquals(age3, ageBc1String.get(1));
       
       ArrayList<Agencia> ageBc1Int = new ArrayList<Agencia>();
       ageBc1Int = bc1.getAgencias(1973);
       
       assertEquals(2, ageBc1Int.size());
       assertEquals(age1, ageBc1Int.get(0));
       assertEquals(age3, ageBc1Int.get(1));
       
       assertEquals("12345\n67890\n23456\n", bc1.imprimeAgencias());
       assertEquals("12345\n23456\n", bc1.imprimeAgencias(1973));
       assertEquals("67890\n23456\n", bc1.imprimeAgencias("Budapeste"));
       
       //bc2
       ArrayList<Agencia> ageBc2 = new ArrayList<Agencia>();
       ageBc2 = bc2.getAgencias();
       
       assertEquals(2, ageBc2.size());
       assertEquals(age4, ageBc2.get(0));
       assertEquals(age5, ageBc2.get(1));
       
       ArrayList<Agencia> ageBc2String = new ArrayList<Agencia>();
       ageBc2String = bc2.getAgencias("Bruxelas");
       
       assertEquals(1, ageBc2String.size());
       assertEquals(age5, ageBc2String.get(0));
       
       ArrayList<Agencia> ageBc2Int = new ArrayList<Agencia>();
       ageBc2Int = bc2.getAgencias(1988);
       
       assertEquals(2, ageBc2Int.size());
       assertEquals(age4, ageBc1Int.get(0));
       assertEquals(age5, ageBc1Int.get(1));
       
       assertEquals("78901\n34567\n", bc2.imprimeAgencias());
       assertEquals("78901\n34567\n", bc2.imprimeAgencias(1988));
       assertEquals("34567\n", bc2.imprimeAgencias("Bruxelas"));
       
   }
}