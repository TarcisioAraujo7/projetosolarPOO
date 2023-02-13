import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class ProdutoTest {
    public ProdutoTest()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testgetNomeP (){
        Produto ragnarok = new Produto("God of War Ragnarok", "Atreus e Kratos enfrentam um novo desafio",(float)30);
        assertEquals("God of War Ragnarok",ragnarok.getNome());
    }

    @Test
    public void testgetDescricaoP (){
        Produto ragnarok = new Produto("God of War Ragnarok", "Atreus e Kratos enfrentam um novo desafio",(float)30);
        assertEquals("Atreus e Kratos enfrentam um novo desafio",ragnarok.getDescricao());
    }

    @Test
    public void testgetPreco () {
        Produto ragnarok = new Produto("God of War Ragnarok", "Atreus e Kratos enfrentam um novo desafio",(float)30);
        assertEquals(30, ragnarok.getPreco(),0.0001);  
    }

    @Test
    public void testNomPre () {
        Produto ragnarok = new Produto("God of War Ragnarok", "Atreus e Kratos enfrentam um novo desafio",(float)30);
        assertEquals("God of War Ragnarok, R$30.0",ragnarok.toString());
    }

    @Test
    public void testisPossuiP (){
        Produto ragnarok = new Produto("God of War Ragnarok", "Atreus e Kratos enfrentam um novo desafio",(float)30);
        ragnarok.setPossui(true);
        assertEquals(true, ragnarok.getPossui());
    }
}