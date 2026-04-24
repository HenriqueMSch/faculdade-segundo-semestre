package test;

import model.Comissao;
import model.Deputado;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ComissaoTeste
{
    @Test
    public void testeInicial(){
        Deputado dep1 = new Deputado(1234,"Joao",99,"SC");
        Deputado dep2 = new Deputado(5678,"Maria",98,"RS");
        Deputado dep3 = new Deputado(9012,"Jose",99,"SP");
        Deputado dep4 = new Deputado(3456,"Pedro",91,"RS");
        Deputado dep5 = new Deputado(7890,"Ana",91,"SC");
        
        Comissao com1 = new Comissao("Comissao de Educacao");
        com1.addDeputado(dep1);
        com1.addDeputado(dep3);
        com1.addDeputado(dep4);
        
        Comissao com2 = new Comissao("Comissao de Constituicao e Justica");
        com2.addDeputado(dep2);
        com2.addDeputado(dep4);
        com2.addDeputado(dep5);
        
        //com1
        ArrayList<Deputado> DepsCom1 = com1.getDeputados();
        assertEquals(3, DepsCom1.size());
        assertEquals(dep1, DepsCom1.get(0));
        assertEquals(dep3, DepsCom1.get(1));
        assertEquals(dep4, DepsCom1.get(2));
        
        ArrayList<Deputado> DepsCom1Part99 = com1.getDeputados(99);
        assertEquals(2, DepsCom1Part99.size());
        assertEquals(dep1, DepsCom1Part99.get(0));
        assertEquals(dep3, DepsCom1Part99.get(1));
        
        ArrayList<Deputado> DepsCom1Part98 = com1.getDeputados(98);
        assertEquals(0, DepsCom1Part98.size());
        
        ArrayList<Deputado> DepsCom1EstSC = com1.getDeputados("SC");
        assertEquals(1, DepsCom1EstSC.size());
        assertEquals(dep1, DepsCom1EstSC.get(0));
        
        ArrayList<Deputado> DepsCom1EstPR = com1.getDeputados("PR");
        assertEquals(0, DepsCom1EstPR.size());
        
        //com2
        ArrayList<Deputado> DepsCom2 = com2.getDeputados();
        assertEquals(3, DepsCom2.size());
        assertEquals(dep2, DepsCom2.get(0));
        assertEquals(dep4, DepsCom2.get(1));
        assertEquals(dep5, DepsCom2.get(2));
        
        ArrayList<Deputado> DepsCom2Part91 = com2.getDeputados(91);
        assertEquals(2, DepsCom2Part91.size());
        assertEquals(dep4, DepsCom2Part91.get(0));
        assertEquals(dep5, DepsCom2Part91.get(1));
        
        ArrayList<Deputado> DepsCom2Part99 = com2.getDeputados(99);
        assertEquals(0, DepsCom2Part99.size());
        
        ArrayList<Deputado> DepsCom2EstRS = com2.getDeputados("RS");
        assertEquals(2, DepsCom2EstRS.size());
        assertEquals(dep2, DepsCom2EstRS.get(0));
        assertEquals(dep4, DepsCom2EstRS.get(1));
        
        ArrayList<Deputado> DepsCom2EstPR = com2.getDeputados("PR");
        assertEquals(0, DepsCom2EstPR.size());
    }   
}