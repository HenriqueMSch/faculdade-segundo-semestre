package test;

import model.Deputado;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeputadoTeste
{
    Deputado dep1 = new Deputado(1234,"Joao",99,"SC");    
    Deputado dep2 = new Deputado(5678,"Maria",98,"RS");
    Deputado dep3 = new Deputado(9012,"Jose",99,"SP");
    Deputado dep4 = new Deputado(3456,"Pedro",91,"RS");
    Deputado dep5 = new Deputado(7890,"Ana",91,"SC");
    
    @Test
    public void testeDep1(){
        assertEquals(false,dep1.setPartido(3));
        assertEquals(false,dep1.setPartido(103));
        assertEquals(true,dep1.setPartido(10));
        dep1.setPartido(99);
        assertEquals(99,dep1.getPartido());
        
        assertEquals(1234,dep1.getMatricula());
        assertEquals("Joao",dep1.getNome());
        assertEquals("SC",dep1.getEstado());
        
        assertEquals("Matricula: 1234, Nome: Joao, Partido: 99, Estado: SC",dep1.toString());
    }
    
    @Test
    public void testeDep2(){
        assertEquals(false,dep2.setPartido(3));
        assertEquals(false,dep2.setPartido(103));
        assertEquals(true,dep2.setPartido(10));
        dep2.setPartido(98);
        assertEquals(98,dep2.getPartido());
        
        assertEquals(5678,dep2.getMatricula());
        assertEquals("Maria",dep2.getNome());
        assertEquals("RS",dep2.getEstado());
        
        assertEquals("Matricula: 5678, Nome: Maria, Partido: 98, Estado: RS",dep2.toString());
    }
    
    @Test
    public void testeDep3(){
        assertEquals(false,dep3.setPartido(3));
        assertEquals(false,dep3.setPartido(103));
        assertEquals(true,dep3.setPartido(10));
        dep3.setPartido(99);
        assertEquals(99,dep3.getPartido());
        
        assertEquals(9012,dep3.getMatricula());
        assertEquals("Jose",dep3.getNome());
        assertEquals("SP",dep3.getEstado());
        
        assertEquals("Matricula: 9012, Nome: Jose, Partido: 99, Estado: SP",dep3.toString());
    }
    
    @Test
    public void testeDep4(){
        assertEquals(false,dep4.setPartido(3));
        assertEquals(false,dep4.setPartido(103));
        assertEquals(true,dep4.setPartido(10));
        dep4.setPartido(91);
        assertEquals(91,dep4.getPartido());
        
        assertEquals(3456,dep4.getMatricula());
        assertEquals("Pedro",dep4.getNome());
        assertEquals("RS",dep4.getEstado());
        
        assertEquals("Matricula: 3456, Nome: Pedro, Partido: 91, Estado: RS",dep4.toString());
    }
    
    @Test
    public void testeDep5(){
        assertEquals(false,dep5.setPartido(3));
        assertEquals(false,dep5.setPartido(103));
        assertEquals(true,dep5.setPartido(10));
        dep5.setPartido(91);
        assertEquals(91,dep5.getPartido());
        
        assertEquals(7890,dep5.getMatricula());
        assertEquals("Ana",dep5.getNome());
        assertEquals("SC",dep5.getEstado());
        
        assertEquals("Matricula: 7890, Nome: Ana, Partido: 91, Estado: SC",dep5.toString());
    }
}