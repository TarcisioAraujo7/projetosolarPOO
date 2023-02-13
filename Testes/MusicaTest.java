import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MusicaTest {
    
    public MusicaTest()
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
    public void testtoString (){
        Musica musicanier = new Musica("Song of ancients");
        assertEquals("Musica: Song of ancients", musicanier.toString());
    }

}
