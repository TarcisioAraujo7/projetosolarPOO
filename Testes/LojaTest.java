import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LojaTest {
    public LojaTest (){
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
    public void testgetProdutosDisponiveis() {
        AlbumMusical nier = new AlbumMusical("Nier Soundtrack", "Álbum Musical do Nier", 30, null);
        Jogo vermelho = new Jogo("Vermelho", "tuts", 40);
        Loja store = new Loja();
        store.addProduto(vermelho);
        store.addProduto(nier);
        List <Produto> prd = new ArrayList<Produto>();
        prd.add(vermelho);
        prd.add(nier);
        assertEquals(prd,store.getProdutoDisponiveis());
    }
}
