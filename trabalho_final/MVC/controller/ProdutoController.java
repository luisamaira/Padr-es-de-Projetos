
package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
    private Produto model;
    private ProdutoView view;

    public ProdutoController(Produto model, ProdutoView view) {
        this.model = model;
        this.view = view;
    }

    public void setNomeProduto(String nome) {
        model.setNome(nome);
    }

    public String getNomeProduto() {
        return model.getNome();
    }

    public void setPrecoProduto(double preco) {
        model.setPreco(preco);
    }

    public double getPrecoProduto() {
        return model.getPreco();
    }

    public void atualizarView() {
        view.exibirDetalhesProduto(model.getNome(), model.getPreco());
    }
}
