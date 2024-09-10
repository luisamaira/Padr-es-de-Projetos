package dao;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements ProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void inserirProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto inserido: " + produto.getNome());
    }

    @Override
    public Produto obterProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public List<Produto> listarTodosProdutos() {
        return produtos;
    }

    @Override
    public void atualizarProduto(Produto produto) {
        Produto existente = obterProduto(produto.getId());
        if (existente != null) {
            existente.setNome(produto.getNome());
            existente.setPreco(produto.getPreco());
            System.out.println("Produto atualizado: " + produto.getNome());
        }
    }

    @Override
    public void deletarProduto(int id) {
        Produto produto = obterProduto(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto deletado: " + produto.getNome());
        }
    }
}
