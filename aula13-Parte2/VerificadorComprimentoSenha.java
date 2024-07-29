public class VerificadorComprimentoSenha implements VerificadorDeAutenticacao {

    private VerificadorDeAutenticacao proximoVerificador;

    @Override
    public void definirProximoVerificador(VerificadorDeAutenticacao proximoVerificador) {
        this.proximoVerificador = proximoVerificador;
    }

    @Override
    public boolean verificar(LoginSenha loginSenha) {
        String senha = loginSenha.getSenha();
        if (senha.length() >= 8 && senha.length() <= 16) {
            return proximoVerificador == null || proximoVerificador.verificar(loginSenha);
        } else {
            System.out.println("A senha deve ter entre 8 e 16 caracteres.");
            return false;
        }
    }
}

