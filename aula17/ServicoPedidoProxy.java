public class ServicoPedidoProxy implements ServicoPedido {
    private ServicoPedidoConcreto servicoPedidoConcreto;
    private boolean usuarioAutorizado;

    public ServicoPedidoProxy(boolean usuarioAutorizado) {
        this.servicoPedidoConcreto = new ServicoPedidoConcreto();
        this.usuarioAutorizado = usuarioAutorizado;
    }

    @Override
    public void processarPedido(Pedido pedido) {
        if (usuarioAutorizado) {
            servicoPedidoConcreto.processarPedido(pedido);
        } else {
            System.out.println("Usuário não autorizado para processar pedidos.");
        }
    }
}
