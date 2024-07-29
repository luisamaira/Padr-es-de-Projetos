public class ManipuladorDeSaque implements ManipuladorDeTransacao {
    
    private ManipuladorDeTransacao proximoManipulador;

    @Override
    public void definirProximoManipulador(ManipuladorDeTransacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public void processarTransacao(Transacao transacao) {
        if ("saque".equalsIgnoreCase(transacao.getTipo())) {
            if (transacao.getContaOrigem().sacar(transacao.getValor())) {
                System.out.println("Saque realizado com sucesso. Novo saldo: " + transacao.getContaOrigem().getSaldo());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else if (proximoManipulador != null) {
            proximoManipulador.processarTransacao(transacao);
        }
    }
}
