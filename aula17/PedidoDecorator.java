public abstract class PedidoDecorator implements ServicoPedido {
    protected ServicoPedido servicoPedido;

    public PedidoDecorator(ServicoPedido servicoPedido) {
        this.servicoPedido = servicoPedido;
    }

    @Override
    public void processarPedido(Pedido pedido) {
        servicoPedido.processarPedido(pedido);
    }
}
