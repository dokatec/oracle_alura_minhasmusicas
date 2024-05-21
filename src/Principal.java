import Models.Musica;
import Models.Podcast;
import Models.MinhasPreferidas;

public class Principal {
    public static void main(String[] args) throws Exception {

        Musica minhasMusica = new Musica();
        minhasMusica.setTitulo("Forever");
        minhasMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhasMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhasMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhasMusica);

    }
}
