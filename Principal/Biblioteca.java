import java.util.List;

public class Biblioteca extends viewBiblioteca{


    Sessao sessaoAtual;
    Loja loja;

    // jogo atual

    public Biblioteca(String nome){
        super(nome);
        sessaoAtual = new Sessao();
        loja = new Loja();
        setBiblioteca();
        List<Produto> produtosDisponiveis = loja.getProdutoDisponiveis();

        initialize(produtosDisponiveis, sessaoAtual.getPlayerLogado());
        
    }

    public void setBiblioteca(){
        Jogo doom = new Jogo("Doom", "Jogo de ação e aventura", 40);
        doom.setConquista("Primeiro chefão derrotado!", "Parabens! Você derrotou o primeiro BOSS.", 15);
        doom.setConquista("Metade do jogo concluido!", "Parabens! Você chegou na metade do jogo.", 50);
        doom.setConquista("JOGO FINALIZADO!", "Parabens! Você derrotou o BOSS final e zerou o jogo.", 100);

        loja.addProduto(doom);

        Jogo bloodborne = new Jogo("Bloodborne", "Soulslike e horror", 50);
        bloodborne.setConquista("Father Gascoigne foi derrotado", "Parabens! Você derrotou o primeiro BOSS.", 15);
        bloodborne.setConquista("Você morreu 200 vezes", "Não se preocupe é normal", 30);
        bloodborne.setConquista("Oh! Good Hunter", "Parabens! Você terminou o jogo", 100);

        loja.addProduto(bloodborne);

        Jogo ghost = new Jogo("Ghost Of Tsushima", " A história acompanha Jin Sakai, um samurai que precisa proteger a Ilha de Tsushima durante a primeira invasão mongol do Japão.", 50);
        ghost.setConquista("Fashion", "Obtenha 30 peças de equipamentos cosméticos", 15);
        ghost.setConquista("Estudante", "Aprenda as posturas de combate da Pedra, da Água, do Vento e da Lua", 30);
        ghost.setConquista("Libertação", "Liberte toda a ilha de Tsushima", 100);

        loja.addProduto(ghost);

        
        Jogo undertale = new Jogo("Undertale", " Undertale se passa em Underground (em tradução livre, uma enorme caverna subterrânea para onde monstros, que uma vez viviam harmoniosamente com os humanos na superfície, foram banidos depois de perder uma guerra contra a humanidade.", 50);
        undertale.setConquista("Boa Sorte", "Você chegou no último ponto de salvamento antes do jogo terminar", 100);
        undertale.setConquista("Dutututu", "Você encontrou o SAMS", 80);
        undertale.setConquista("Que piada horrível", "Você ouviu a ideia do papyrus", 50);

        loja.addProduto(undertale);

        Jogo deltarune = new Jogo("Deltarune", " O jogador controla um humano, Kris, em um mundo onde os monstros vivem na superfície da Terra. Kris e uma colega de classe chamada Susie caem da Terra em um lugar chamado Mundo das Trevas", 50);
        deltarune.setConquista("Finalmente", "Você levantou para ir pra escola", 15);
        deltarune.setConquista("Fluffy Boy", "Você conheceu Ralsei", 30);
        deltarune.setConquista("Susie ", "Você fez um trabalho em grupo com susie", 70);

        loja.addProduto(deltarune);
        
        AlbumMusical albumDoom = new AlbumMusical("Álbum Doom", "Album do jogo Doom", 30, "https://www.youtube.com/watch?v=PM9VSVX7dx8&list=PLe0EamRrnC6Rb5F3njbg6eYYy09PNKEOv");
        albumDoom.setMusica("The Only Thing They Fear Is You");
        albumDoom.setMusica("BFG Division");
        albumDoom.setMusica("Metahook");

        loja.addProduto(albumDoom);


        AlbumMusical albumBloodborne = new AlbumMusical("Bloodborne OST", "Album do jogo Bloordborne", 30, "https://www.youtube.com/watch?v=cKk6XqcmB4Q&list=PLKzg0DeoAjD-cGZOEspgvDGpFal8S2aS-");
        albumBloodborne.setMusica("Omen");
        albumBloodborne.setMusica("The Night Unfurls");
        albumBloodborne.setMusica("Hunter's Dream");
        albumBloodborne.setMusica("The Hunter");
        albumBloodborne.setMusica("Cleric Beast");
        albumBloodborne.setMusica("Blood-starved Beast");
        albumBloodborne.setMusica("Watchers");
        albumBloodborne.setMusica("Hail The Nightmare");
        albumBloodborne.setMusica("Darkbeast");
        albumBloodborne.setMusica("The Witch Of Hemwick");
        albumBloodborne.setMusica("Rom, The Vacuous Spider");
        albumBloodborne.setMusica("Moonlit Melody");

        loja.addProduto(albumBloodborne);

        AlbumMusical albumGhost = new AlbumMusical("Ghost of Tsushima OST", "Album do jogo Ghost Of Tsushima", 30, "https://www.youtube.com/watch?v=CIXoEJGZoJw&list=PLPfHaI9XqTnE6AD-dSRfCoDJNjPCIuQ7_");
        albumGhost.setMusica("The Way of the Ghost");
        albumGhost.setMusica("Jin Sakai");
        albumGhost.setMusica("Komoda Beach");
        albumGhost.setMusica("The Way of the Samurai");
        albumGhost.setMusica("Lord Shimura");
        albumGhost.setMusica("No Mercy");

        loja.addProduto(albumGhost);

        AlbumMusical albumUndertale = new AlbumMusical("Undertale OST", "Album do Undertale", 30, "https://www.youtube.com/watch?v=s7RRgF5Ve_E&list=PLpJl5XaLHtLX-pDk4kctGxtF4nq6BIyjg");
        albumUndertale.setMusica("Once Upon a Time");
        albumUndertale.setMusica("Start Menu");
        albumUndertale.setMusica("Your Best Friend");
        albumUndertale.setMusica("Fallen Down");
        albumUndertale.setMusica("Ruins");
        albumUndertale.setMusica("Uwa!! So Temperate");
        albumUndertale.setMusica("Anticipation");
        albumUndertale.setMusica("Unnecessary Tension");
        albumUndertale.setMusica("Enemy Approaching");

        loja.addProduto(albumUndertale);

    }


    
    
}
