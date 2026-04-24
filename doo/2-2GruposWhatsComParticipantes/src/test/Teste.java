package test;

import model.Grupo;
import model.Participante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
 
public class Teste
{
    private Participante part1 = new Participante("Paulo","12345678");
    private Participante part2 = new Participante("Mauro","90123456");
    private Participante part3 = new Participante("Luisa","78901234");
    private Participante part4 = new Participante("Maria","56789012");
    private Participante part5 = new Participante("Julia","23456789");
    private Grupo grp1 = new Grupo("Iceberg");
    private Grupo grp2 = new Grupo("Arabes");
    
    @Test
    public void testePart1(){
        Assertions.assertEquals(false,part1.setNome(""));
        Assertions.assertEquals(true,part1.setNome("ze"));
        part1.setNome("Paulo");
        Assertions.assertEquals("Paulo", part1.getNome());
        
        Assertions.assertEquals(true,part1.setTelefone("12345"));
        part1.setTelefone("12345678");
        Assertions.assertEquals("12345678", part1.getTelefone());
        
        Assertions.assertEquals("Nome: Paulo, Telefone: 12345678",part1.toString());
    }
}