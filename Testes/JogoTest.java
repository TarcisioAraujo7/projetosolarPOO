import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JogoTest {
    public JogoTest()
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
    public void testgetHorasJogadas (){
        Jogo verde = new Jogo("Verde", "ble", 40);
        verde.Jogar("40");
        assertEquals(40,verde.getHorasJogadas());

    }

    @Test
    public void testgetConquistas(){
        Jogo vermelho = new Jogo("Vermelho", "tuts", 40);
        vermelho.setConquista("brilha", "Parabens! Você derrotou o primeiro BOSS.", 15);
        Conquista tre = vermelho.getConquistas().get(0);
        vermelho.Jogar("20");
        List <Conquista> tra = new ArrayList<Conquista>();
        tra.add(tre);
        assertEquals(tra, vermelho.getConquistas());

    }
}
