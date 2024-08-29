public class Main {
    public static void main(String[] args) {

        ConexaoBancoDadosSingleton conexao = ConexaoBancoDadosSingleton.getInstancia();
        conexao.executarQuery("SELECT * FROM Pedidos");

        Pedido pedido = new Pedido("Notebook", 3000.00);

        ServicoPedido servicoNaoAutorizado = new ServicoPedidoProxy(false);
        servicoNaoAutorizado.processarPedido(pedido);

        ServicoPedido servicoAutorizado = new ServicoPedidoProxy(true);

        ServicoPedido servicoComDesconto = new DescontoDecorator(servicoAutorizado, 0.10);

        ServicoPedido servicoComTaxa = new TaxaEntregaDecorator(servicoComDesconto, 50.00);

        servicoComTaxa.processarPedido(pedido);
    }
}
