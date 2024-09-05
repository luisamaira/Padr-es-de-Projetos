import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        PlataformaVideo plataforma = new PlataformaVideo();

        Usuario usuario1 = new Usuario("Luisa", new HashSet<>(Arrays.asList("ação", "comédia")));
        Usuario usuario2 = new Usuario("Aguinaldo", new HashSet<>(Collections.singletonList("terror")));
        Usuario usuario3 = new Usuario("Fernando", new HashSet<>(Arrays.asList("anime", "ficção científica")));
        Usuario usuario4 = new Usuario("Nathany", new HashSet<>(Arrays.asList("comédia", "ação")));
        Usuario usuario5 = new Usuario("Bob", new HashSet<>(Collections.singletonList("ação")));

        plataforma.attach(usuario1, "ação");
        plataforma.attach(usuario1, "comédia");
        plataforma.attach(usuario2, "terror");
        plataforma.attach(usuario3, "anime");
        plataforma.attach(usuario3, "ficção científica");
        plataforma.attach(usuario4, "comédia");
        plataforma.attach(usuario4, "ação");
        plataforma.attach(usuario5, "ação");

        plataforma.addMovie("Alerta Vermelho", "ação");
        plataforma.addMovie("O Auto da Compadecida", "comédia");
        plataforma.addMovie("Pânico", "terror");
        plataforma.addMovie("Castelo Animado", "anime");
        plataforma.addMovie("Interestelar", "ficção científica");
    }
}
