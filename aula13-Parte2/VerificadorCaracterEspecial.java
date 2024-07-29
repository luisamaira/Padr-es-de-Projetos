public class VerificadorCaracterEspecial implements VerificadorDeAutenticacao {

    private VerificadorDeAutenticacao proximoVerificador;
    private static final String CARACTERES_ESPECIAIS = "@#$%&*";

    @Override
    public void definirProximoVerificador(VerificadorDeAutenticacao proximoVerificador) {
        this.proximoVerificador = proximoVerificador;
    }

    @Override
    public boolean verificar(LoginSenha loginSenha) {
        String senha = loginSenha.getSenha();
        if (senha.chars().anyMatch(c -> CARACTERES_ESPECIAIS.indexOf(c) >= 0)) {
            return proximoVerificador == null || proximoVerificador.verificar(loginSenha);
        } else {
            System.out.println("A senha deve conter pelo menos um caractere especial.");
            return false;
        }
    }
}
