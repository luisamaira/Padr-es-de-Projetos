public class ManipuladorDeDeposito implements ManipuladorDeTransacao {
    
    private ManipuladorDeTransacao proximoManipulador;

    @Override
    public void definirProximoManipulador(ManipuladorDeTransacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public void processarTransacao(Transacao transacao) {
        if ("deposito".equalsIgnoreCase(transacao.getTipo())) {
            if (transacao.getValor() > 0) {
                transacao.getContaOrigem().depositar(transacao.getValor());
                System.out.println("Depósito realizado com sucesso. Novo saldo: " + transacao.getContaOrigem().getSaldo());
            } else {
                System.out.println("O valor do depósito deve ser positivo.");
            }
        } else if (proximoManipulador != null) {
            proximoManipulador.processarTransacao(transacao);
        }
    }
}

