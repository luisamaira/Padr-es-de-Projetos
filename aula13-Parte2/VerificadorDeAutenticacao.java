public interface VerificadorDeAutenticacao {
    
    void definirProximoVerificador(VerificadorDeAutenticacao proximoVerificador);
    boolean verificar(LoginSenha loginSenha);
}
