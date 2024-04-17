import java.util.Random;

public class Singleton {

    private static Singleton instancia;

    private final String nomeUsuario = "usuario";
    private final String senha = "123";

    private final String codigoBot = gerarCodigoBot();

    private Singleton() {

    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public boolean fazerLogin(String nomeUsuario, String senha, String codigoBotDigitado) {

        if (!codigoBotDigitado.equals(codigoBot)) {
            System.out.println("Código de verificação incorreto. Acesso negado.");
            return false;
        }

        if (this.nomeUsuario.equals(nomeUsuario) && this.senha.equals(senha)) {
            System.out.println("Login bem-sucedido.");
            return true;
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Acesso negado.");
            return false;
        }
    }

    private String gerarCodigoBot() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int tipo = random.nextInt(3);
            switch (tipo) {
                case 0:
                    codigo.append((char) (random.nextInt(26) + 'A'));
                    break;
                case 1:
                    codigo.append((char) (random.nextInt(26) + 'a'));
                    break;
                case 2:
                    codigo.append(random.nextInt(10));
                    break;
            }
        }
        return codigo.toString();
    }
}
