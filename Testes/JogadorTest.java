import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JogadorTest {
    public JogadorTest()
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
    public void testgetConquistas () {
      Jogador ele = new Jogador("Arthur");
      Jogo ragnarok = new Jogo("God of War Ragnarok", "Atreus e Kratos enfrentam um novo desafio",(float)30);
      ragnarok.setConquista("Loki", "Você tem um nome composto", 30);
      ele.comprarJogo(ragnarok);
      ragnarok.Jogar("40");
      List <Produto> prod = new ArrayList<Produto>();
      prod.add(ragnarok);
      ele.setConquistas(prod); 
      assertEquals(1, ele.getConquistas());
    }

    @Test
    public void testgetSaldoTotal (){
      Jogador ele = new Jogador("Arthur");
      Jogo ragnarok = new Jogo("God of War Ragnarok", "Atreus e Kratos enfrentam um novo desafio",(float)30);
      ele.comprarJogo(ragnarok);
      List <Produto> prod = new ArrayList<Produto>();
      prod.add(ragnarok);
      assertEquals(20, ele.getSaldoTotal(),0.0001);
    }
}

