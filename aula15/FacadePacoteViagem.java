public class FacadePacoteViagem {
    private SistemaVendaPassagens sistemaPassagens = new SistemaVendaPassagens();
    private SistemaReservaHotel sistemaHotel = new SistemaReservaHotel();
    private SistemaAluguelCarro sistemaCarro = new SistemaAluguelCarro();
    private SistemaPagamento sistemaPagamento = new SistemaPagamento();

    public void reservarPacoteViagem(String nome, String cpf, int fileiraPassagem, char assentoPassagem, String tipoQuarto, String tipoCarro, String metodoPagamento, int parcelas) {
        int precoPassagem = sistemaPassagens.obterPrecoAssento(fileiraPassagem);
        int precoQuarto = sistemaHotel.obterPrecoQuarto(tipoQuarto);
        int precoCarro = sistemaCarro.obterPrecoCarro(tipoCarro);

        int precoTotal = precoPassagem + precoQuarto + precoCarro;
        double precoFinal = sistemaPagamento.aplicarDescontoOuJuros(metodoPagamento, precoTotal, parcelas);

        System.out.println("Dados do Comprador: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Assento de Avião: " + fileiraPassagem + assentoPassagem);
        System.out.println("Tipo de Quarto: " + tipoQuarto);
        System.out.println("Tipo de Carro: " + tipoCarro);
        System.out.println("Método de Pagamento: " + metodoPagamento);
        System.out.println("Valor Total: R$ " + precoTotal);
        System.out.println("Valor Final após ajuste: R$ " + precoFinal);
    }

    
}
