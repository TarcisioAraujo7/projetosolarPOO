import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConquistaTest {
    public ConquistaTest()
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
    public void testgetNome (){
        Conquista primeiro = new Conquista("Fashion", "conseguiu todos cosméticos equipáveis", 15);
        assertEquals("Fashion",primeiro.getNome());
    }
    
    @Test
    public void testgetDescricao (){
        Conquista primeiro = new Conquista("Fashion", "conseguiu todos cosméticos equipáveis", 15);
        assertEquals("conseguiu todos cosméticos equipáveis",primeiro.getDescricao());
    }

    @Test
    public void testgetProgressoAObter (){
        Conquista primeiro = new Conquista("Fashion", "conseguiu todos cosméticos equipáveis", 15);
        assertEquals(15,primeiro.getProgressoAObter()); 
    }

    @Test
    public void isObtida (){
        Conquista primeiro = new Conquista("Fashion", "conseguiu todos cosméticos equipáveis", 15);
        primeiro.setObtida(true);
        assertEquals(true,primeiro.isObtida()); 
    }

}
