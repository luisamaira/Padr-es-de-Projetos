public class VerificadorLogin implements VerificadorDeAutenticacao {

    private VerificadorDeAutenticacao proximoVerificador;
    private static final String[] LOGINS_CADASTRADOS = {"usuario1", "usuario2", "usuario3"};

    @Override
    public void definirProximoVerificador(VerificadorDeAutenticacao proximoVerificador) {
        this.proximoVerificador = proximoVerificador;
    }

    @Override
    public boolean verificar(LoginSenha loginSenha) {
        for (String loginCadastrado : LOGINS_CADASTRADOS) {
            if (loginCadastrado.equals(loginSenha.getLogin())) {
                return proximoVerificador == null || proximoVerificador.verificar(loginSenha);
            }
        }
        System.out.println("Login não cadastrado.");
        return false;
    }
}
