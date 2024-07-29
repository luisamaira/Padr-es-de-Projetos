public class Main {
    public static void main(String[] args) {
    
        Conta conta1 = new Conta(1000);
        Conta conta2 = new Conta(500);

        ManipuladorDeTransacao manipuladorDeposito = new ManipuladorDeDeposito();
        ManipuladorDeTransacao manipuladorSaque = new ManipuladorDeSaque();
        ManipuladorDeTransacao manipuladorTransferencia = new ManipuladorDeTransferencia();

        manipuladorDeposito.definirProximoManipulador(manipuladorSaque);
        manipuladorSaque.definirProximoManipulador(manipuladorTransferencia);

        Transacao transacaoDeposito = new Transacao("deposito", 200, conta1, null);
        Transacao transacaoSaque = new Transacao("saque", 150, conta1, null);
        Transacao transacaoTransferencia = new Transacao("transferencia", 100, conta1, conta2);
        Transacao transacaoInvalida = new Transacao("invalida", 0, null, null);

        manipuladorDeposito.processarTransacao(transacaoDeposito);
        manipuladorDeposito.processarTransacao(transacaoSaque);
        manipuladorDeposito.processarTransacao(transacaoTransferencia);
        manipuladorDeposito.processarTransacao(transacaoInvalida);
    }
}

