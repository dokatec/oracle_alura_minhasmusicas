package Models;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!" + " e prefediro por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está " + "curtindo");
        }
    }

}
