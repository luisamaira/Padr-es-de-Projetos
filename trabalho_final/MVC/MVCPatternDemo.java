
import model.User;
import view.UserView;
import controller.UserController;

public class MVCPatternDemo {
    public static void main(String[] args) {

        User model = new User("Aguinaldo", "aguinaldo@example.com");

        UserView view = new UserView();

        UserController controller = new UserController(model, view);

        controller.updateView();

        controller.setUserName("Luisa");
        controller.setUserEmail("luisa.maira@example.com");

        controller.updateView();
    }
}
