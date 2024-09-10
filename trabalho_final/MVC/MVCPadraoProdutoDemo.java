
import model.Produto;
import view.ProdutoView;
import controller.ProdutoController;

public class MVCPadraoProdutoDemo {
    public static void main(String[] args) {

        Produto model = new Produto("Notebook", 3500.00);

        ProdutoView view = new ProdutoView();

        ProdutoController controller = new ProdutoController(model, view);

        controller.atualizarView();

        controller.setNomeProduto("Smartphone");
        controller.setPrecoProduto(1200.00);

        controller.atualizarView();
    }
}
