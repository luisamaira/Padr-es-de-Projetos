public class VerificadorNumerosConsecutivos implements VerificadorDeAutenticacao {

    private VerificadorDeAutenticacao proximoVerificador;

    @Override
    public void definirProximoVerificador(VerificadorDeAutenticacao proximoVerificador) {
        this.proximoVerificador = proximoVerificador;
    }

    @Override
    public boolean verificar(LoginSenha loginSenha) {
        String senha = loginSenha.getSenha();
        for (int i = 0; i < senha.length() - 2; i++) {
            if (Character.isDigit(senha.charAt(i)) &&
                Character.isDigit(senha.charAt(i + 1)) &&
                Character.isDigit(senha.charAt(i + 2)) &&
                senha.charAt(i + 1) == senha.charAt(i) + 1 &&
                senha.charAt(i + 2) == senha.charAt(i) + 2) {
                System.out.println("A senha não deve conter três números consecutivos.");
                return false;
            }
        }
        return proximoVerificador == null || proximoVerificador.verificar(loginSenha);
    }
}
