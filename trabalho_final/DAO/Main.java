import model.Produto;
import dao.ProdutoDAO;
import dao.ProdutoDAOImpl;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAOImpl();

        Produto produto1 = new Produto(1, "Notebook", 3500.00);
        Produto produto2 = new Produto(2, "Smartphone", 1200.00);

        produtoDAO.inserirProduto(produto1);
        produtoDAO.inserirProduto(produto2);

        System.out.println("Lista de todos os produtos:");
        for (Produto produto : produtoDAO.listarTodosProdutos()) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }

        Produto produtoAtualizado = new Produto(1, "Notebook Gamer", 5000.00);
        produtoDAO.atualizarProduto(produtoAtualizado);

        System.out.println("Produto atualizado: " + produtoDAO.obterProduto(1).getNome());

        produtoDAO.deletarProduto(2);
    }
}
