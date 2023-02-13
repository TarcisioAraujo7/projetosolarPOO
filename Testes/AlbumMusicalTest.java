import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AlbumMusicalTest {
    public AlbumMusicalTest ()
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
    public void testgetMusicas (){
        AlbumMusical nier = new AlbumMusical("Nier Soundtrack", "Álbum Musical do Nier", 30, null);
        nier.setMusica("ShadowLord");
        nier.setMusica("Emil");
        Musica shadow = nier.getMusicas().get(0);
        Musica emil = nier.getMusicas().get(1);
        List <Musica> ms = new ArrayList<Musica>();
        ms.add(shadow);
        ms.add(emil);
        assertEquals(ms, nier.getMusicas());

    }

}
