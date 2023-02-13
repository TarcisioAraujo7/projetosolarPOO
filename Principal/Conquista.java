import javax.swing.JOptionPane;

public class Conquista {

    private String nome;
    private String descricao;
    private int progressoAObter;
    private boolean obtida;

    public Conquista(String nome, String descricao, int progressoAObter){
        this.nome = nome;
        this.descricao = descricao;
        this.progressoAObter = progressoAObter;
        obtida = false;
    }

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
    public int getProgressoAObter() {
        return progressoAObter;
    }
    public void setProgressoAObter(int progressoAObter) {
        this.progressoAObter = progressoAObter;
    }

    public boolean isObtida() {
        return obtida;
    }

    public void setObtida(boolean obtida) {
        this.obtida = obtida;
    }

    public void exibirConquista(){
        JOptionPane.showMessageDialog(null, "Você conseguiu a conquista " + nome + " !\n" + descricao , "Solar",JOptionPane.INFORMATION_MESSAGE);
    }

    

}