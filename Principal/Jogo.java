import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Jogo extends Produto {

    private int HorasJogadas;

    private List<Conquista> conquistas = new ArrayList<Conquista>();

    public Jogo(String nome, String descricao, float preco) {

        super(nome, descricao, preco);
        HorasJogadas = 0;
    }
    
    public void Jogar(String horasJogadas){
        int horasJogadasInt;
        try {
            horasJogadasInt = Integer.parseInt(horasJogadas);
            this.HorasJogadas += horasJogadasInt;
            for (Conquista conquista : conquistas) {
                if (conquista.isObtida() == false && conquista.getProgressoAObter() <= HorasJogadas) {
                    conquista.setObtida(true);
                    conquista.exibirConquista();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira um número inteiro!", "Solar",JOptionPane.ERROR_MESSAGE);
        }
        
    }

    public void exibirJogo(){
        JOptionPane.showMessageDialog(null, "Descrição: " + descricao + "\nHoras jogadas: " + HorasJogadas, "Solar",JOptionPane.PLAIN_MESSAGE);
    }

    public List<Conquista> getConquistas() {
        return conquistas;
    }

    public void setConquista(String nome, String descricao, int progressoAObter){
        Conquista novaConquista = new Conquista(nome, descricao, progressoAObter);
        conquistas.add(novaConquista);
    }

    public int getHorasJogadas() {
        return HorasJogadas;
    }

    
}
