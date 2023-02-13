import java.net.URI;
import java.awt.Desktop;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AlbumMusical extends Produto {

    private List<Musica> musicas = new ArrayList<Musica>();
    private String link;

    public AlbumMusical(String nome, String descricao, float preco, String link) {
        super(nome, descricao, preco);
        this.link = link;
    }

    public void setMusica(String nome){
        Musica musica = new Musica(nome);
        musicas.add(musica);
    }
    public List<Musica> getMusicas() {
        return musicas;
    }

    public void ouvirAlbum(){
        try {
            URI link = new URI(this.link);
            Desktop.getDesktop().browse(link);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado!", "Solar",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void exibirAlbum(){

        String exibir = nome + "\nDescrição: " + descricao + "\n" ;
        int contador = 1;
        for (Musica musica : musicas) {
            exibir += "\n - " + contador + ". " + musica.toString();
            contador ++;
        }

        JOptionPane.showMessageDialog(null, exibir, "Solar",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
