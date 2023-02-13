import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtosDisponiveis;

    public List<Produto> getProdutoDisponiveis() {
        return produtosDisponiveis;
    }

    public Loja(){
        produtosDisponiveis = new ArrayList<Produto>();
    }

    public void addProduto(Produto produto) {
        produtosDisponiveis.add(produto);
    }

    
}
