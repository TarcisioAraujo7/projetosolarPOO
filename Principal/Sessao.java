
public class Sessao {

    private Jogador playerLogado;
    private Jogo jogoAtual;


    public Sessao() {
        this.playerLogado = new Jogador("Terra");
    }

    public Jogo getJogoAtual() {
        return jogoAtual;
    }

    public Jogador getPlayerLogado() {
        return playerLogado;
    }

    public void setPlayerLogado(Jogador playerLogado) {
        this.playerLogado = playerLogado;
    }

    public void setJogoAtual(Jogo jogoAtual) {
        this.jogoAtual = jogoAtual;
    }
    

}
