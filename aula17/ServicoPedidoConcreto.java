public class ServicoPedidoConcreto implements ServicoPedido {
    @Override
    public void processarPedido(Pedido pedido) {
        System.out.println("Processando pedido: " + pedido.getDescricao() + " | Valor: R$ " + pedido.getValor());
    }
}
