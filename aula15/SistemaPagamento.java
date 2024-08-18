public class SistemaPagamento {
    private static final double DESCONTO_PIX = 0.10;
    private static final double DESCONTO_BOLETO = 0.05;
    private static final double JUROS_CREDITO = 0.0399;

    public double aplicarDescontoOuJuros(String metodoPagamento, double valor, int parcelas) {
        switch (metodoPagamento.toLowerCase()) {
            case "pix":
                return valor * (1 - DESCONTO_PIX);
            case "boleto":
                return valor * (1 - DESCONTO_BOLETO);
            case "debito":
                return valor;
            case "credito":
                if (parcelas > 1) {
                    return valor * (1 + JUROS_CREDITO * (parcelas - 1));
                }
                return valor;
            default:
                throw new IllegalArgumentException("Método de pagamento desconhecido.");
        }
    }
}
