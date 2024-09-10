
package view;

public class ProdutoView {
    public void exibirDetalhesProduto(String nomeProduto, double precoProduto) {
        System.out.println("Detalhes do Produto: ");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Preço: R$ " + precoProduto);
    }
}
