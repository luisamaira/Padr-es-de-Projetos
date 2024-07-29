public class Main {
    public static void main(String[] args) {
        
        VerificadorDeAutenticacao verificadorLogin = new VerificadorLogin();
        VerificadorDeAutenticacao verificadorMaiusculo = new VerificadorMaiusculo();
        VerificadorDeAutenticacao verificadorMinusculo = new VerificadorMinusculo();
        VerificadorDeAutenticacao verificadorCaracterEspecial = new VerificadorCaracterEspecial();
        VerificadorDeAutenticacao verificadorNumero = new VerificadorNumero();
        VerificadorDeAutenticacao verificadorNumerosConsecutivos = new VerificadorNumerosConsecutivos();
        VerificadorDeAutenticacao verificadorComprimentoSenha = new VerificadorComprimentoSenha();

        verificadorLogin.definirProximoVerificador(verificadorMaiusculo);
        verificadorMaiusculo.definirProximoVerificador(verificadorMinusculo);
        verificadorMinusculo.definirProximoVerificador(verificadorCaracterEspecial);
        verificadorCaracterEspecial.definirProximoVerificador(verificadorNumero);
        verificadorNumero.definirProximoVerificador(verificadorNumerosConsecutivos);
        verificadorNumerosConsecutivos.definirProximoVerificador(verificadorComprimentoSenha);

        LoginSenha loginSenha1 = new LoginSenha("usuario1", "Abc@123");
        LoginSenha loginSenha2 = new LoginSenha("usuario1", "Abc123456");
        LoginSenha loginSenha3 = new LoginSenha("usuario1", "abcdefg");
        LoginSenha loginSenha4 = new LoginSenha("usuario1", "ABCD1234!");
        LoginSenha loginSenha5 = new LoginSenha("usuario1", "Ab1@1234567890123456");
        LoginSenha loginSenha6 = new LoginSenha("usuario1", "Ab1@12");

        System.out.println("Verificação do login e senha 1: " + verificadorLogin.verificar(loginSenha1));
        System.out.println("Verificação do login e senha 2: " + verificadorLogin.verificar(loginSenha2));
        System.out.println("Verificação do login e senha 3: " + verificadorLogin.verificar(loginSenha3));
        System.out.println("Verificação do login e senha 4: " + verificadorLogin.verificar(loginSenha4));
        System.out.println("Verificação do login e senha 5: " + verificadorLogin.verificar(loginSenha5));
        System.out.println("Verificação do login e senha 6: " + verificadorLogin.verificar(loginSenha6));
    }
}
