package dao;

import model.Produto;
import java.util.List;

public interface ProdutoDAO {
    void inserirProduto(Produto produto);
    Produto obterProduto(int id);
    List<Produto> listarTodosProdutos();
    void atualizarProduto(Produto produto);
    void deletarProduto(int id);
}
