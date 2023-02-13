import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Jogador {

    private String nome;
    private int conquistas;
    private float saldoTotal;
    

    public Jogador(String nome){
        conquistas = 0;
        saldoTotal = 50;
        this.nome = nome;
    }

    public boolean comprarJogo(Produto produto){
        if (saldoTotal >= produto.getPreco()) {
            produto.setPossui(true);
            saldoTotal -= produto.getPreco();
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente!", "Solar",JOptionPane.ERROR_MESSAGE);
            return false;       
        }
    }

    public void setConquistas(List<Produto> produtoDisponiveis){
        List<Conquista> obtidas = new ArrayList<Conquista>();
        for (Produto produto : produtoDisponiveis) {
            if (produto instanceof Jogo && produto.getPossui()) {
                Jogo jogo = (Jogo) produto;
                for (Conquista conquista : jogo.getConquistas()) {
                    if (conquista.isObtida()) {
                        obtidas.add(conquista);
                    }
                }
            }
        }

        conquistas = obtidas.size();
    }

    public String getNome() {
        return nome;
    }

    public int getConquistas() {
        return conquistas;
    }

    public void setSaldoTotal(float saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }

}