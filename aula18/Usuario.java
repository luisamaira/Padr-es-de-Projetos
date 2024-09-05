import java.util.Set;

class Usuario implements Observer {
    private String nome;
    private Set<String> generos;

    public Usuario(String nome, Set<String> generos) {
        this.nome = nome;
        this.generos = generos;
    }

    @Override
    public void update(String genre, String title) {
        if (generos.contains(genre)) {
            System.out.println(nome + " recebeu notificação: " + title + " no gênero " + genre);
        }
    }
}
