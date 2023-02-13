public class Produto {
    
    protected String nome;
    protected String descricao;
    private Boolean possui;
    final private float preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return nome + ", R$" + preco ;
    }

    public void setPossui(Boolean possui) {
        this.possui = possui;
    }

    public Produto(String nome, String descricao, Float preco) {
        this.nome = nome;
        this.descricao = descricao;

        if(preco < 20){
            this.preco = 20;
        } else {
            this.preco = preco;
        }

        this.possui = false;
        
    }
    
    public float getPreco() {
        return preco;
    }

    public Boolean getPossui() {
        return possui;
    }
    
}