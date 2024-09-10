
package controller;

import model.Usuario;
import view.UsuarioView;

public class UsuarioController {
    private Usuario model;
    private UsuarioView view;

    public UsuarioController(Usuario model, UsuarioView view) {
        this.model = model;
        this.view = view;
    }

    public void setNomeUsuario(String nome) {
        model.setNome(nome);
    }

    public String getNomeUsuario() {
        return model.getNome();
    }

    public void setEmailUsuario(String email) {
        model.setEmail(email);
    }

    public String getEmailUsuario() {
        return model.getEmail();
    }

    public void atualizarView() {
        view.exibirDetalhesUsuario(model.getNome(), model.getEmail());
    }
}
