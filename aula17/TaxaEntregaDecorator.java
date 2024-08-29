public class TaxaEntregaDecorator extends PedidoDecorator {
    private double valorTaxa;

    public TaxaEntregaDecorator(ServicoPedido servicoPedido, double valorTaxa) {
        super(servicoPedido);
        this.valorTaxa = valorTaxa;
    }

    @Override
    public void processarPedido(Pedido pedido) {
        double valorComTaxa = pedido.getValor() + valorTaxa;
        pedido.setValor(valorComTaxa);
        System.out.println("Taxa de entrega aplicada: R$ " + valorTaxa);
        super.processarPedido(pedido);
    }
}
