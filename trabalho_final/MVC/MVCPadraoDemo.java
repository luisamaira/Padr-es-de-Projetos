
import model.Usuario;
import view.UsuarioView;
import controller.UsuarioController;

public class MVCPadraoDemo {
    public static void main(String[] args) {

        Usuario model = new Usuario("Fernando", "fernando@exemplo.com");

        UsuarioView view = new UsuarioView();

        UsuarioController controller = new UsuarioController(model, view);

        controller.atualizarView();

        controller.setNomeUsuario("Maria");
        controller.setEmailUsuario("maria@exemplo.com");

        controller.atualizarView();
    }
}
