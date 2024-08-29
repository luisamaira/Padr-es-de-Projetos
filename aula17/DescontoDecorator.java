public class DescontoDecorator extends PedidoDecorator {
    private double percentualDesconto;

    public DescontoDecorator(ServicoPedido servicoPedido, double percentualDesconto) {
        super(servicoPedido);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public void processarPedido(Pedido pedido) {
        double valorComDesconto = pedido.getValor() - (pedido.getValor() * percentualDesconto);
        pedido.setValor(valorComDesconto);
        System.out.println("Desconto aplicado: " + (percentualDesconto * 100) + "%");
        super.processarPedido(pedido);
    }
}
