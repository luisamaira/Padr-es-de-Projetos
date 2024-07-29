public class VerificadorMinusculo implements VerificadorDeAutenticacao {

    private VerificadorDeAutenticacao proximoVerificador;

    @Override
    public void definirProximoVerificador(VerificadorDeAutenticacao proximoVerificador) {
        this.proximoVerificador = proximoVerificador;
    }

    @Override
    public boolean verificar(LoginSenha loginSenha) {
        String senha = loginSenha.getSenha();
        if (senha.chars().anyMatch(Character::isLowerCase)) {
            return proximoVerificador == null || proximoVerificador.verificar(loginSenha);
        } else {
            System.out.println("A senha deve conter pelo menos um caractere em minúsculo.");
            return false;
        }
    }
}
