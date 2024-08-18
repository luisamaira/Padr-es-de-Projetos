public class SistemaReservaHotel {
    private static final int PRECO_QUARTO_SIMPLES = 200;
    private static final int PRECO_QUARTO_EXECUTIVO = (int) (PRECO_QUARTO_SIMPLES * 2.5);
    private static final int PRECO_SUITE_PRESIDENCIAL = (int) (PRECO_QUARTO_EXECUTIVO * 3);

    public int obterPrecoQuarto(String tipoQuarto) {
        switch (tipoQuarto.toLowerCase()) {
            case "simples":
                return PRECO_QUARTO_SIMPLES;
            case "executivo":
                return PRECO_QUARTO_EXECUTIVO;
            case "suite presidencial":
                return PRECO_SUITE_PRESIDENCIAL;
            default:
                throw new IllegalArgumentException("Tipo de quarto desconhecido.");
        }
    }
}
