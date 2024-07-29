public class VerificadorNumero implements VerificadorDeAutenticacao {

    private VerificadorDeAutenticacao proximoVerificador;

    @Override
    public void definirProximoVerificador(VerificadorDeAutenticacao proximoVerificador) {
        this.proximoVerificador = proximoVerificador;
    }

    @Override
    public boolean verificar(LoginSenha loginSenha) {
        String senha = loginSenha.getSenha();
        if (senha.chars().anyMatch(Character::isDigit)) {
            return proximoVerificador == null || proximoVerificador.verificar(loginSenha);
        } else {
            System.out.println("A senha deve conter pelo menos um número.");
            return false;
        }
    }
}
