public class ManipuladorDeTransferencia implements ManipuladorDeTransacao {
    
    private ManipuladorDeTransacao proximoManipulador;

    @Override
    public void definirProximoManipulador(ManipuladorDeTransacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public void processarTransacao(Transacao transacao) {
        if ("transferencia".equalsIgnoreCase(transacao.getTipo())) {
            if (transacao.getContaOrigem().transferir(transacao.getValor(), transacao.getContaDestino())) {
                System.out.println("Transferência realizada com sucesso. Novo saldo da conta de origem: " +
                        transacao.getContaOrigem().getSaldo());
                System.out.println("Novo saldo da conta de destino: " +
                        transacao.getContaDestino().getSaldo());
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        } else if (proximoManipulador != null) {
            proximoManipulador.processarTransacao(transacao);
        } else {
            System.out.println("Tipo de transação não suportado.");
        }
    }
}
