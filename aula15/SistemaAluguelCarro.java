public class SistemaAluguelCarro {
    private static final int PRECO_CARRO_ECONOMICO = 150;
    private static final int PRECO_CARRO_EXECUTIVO = PRECO_CARRO_ECONOMICO * 2;
    private static final int PRECO_CARRO_LUXO = PRECO_CARRO_EXECUTIVO * 2;

    public int obterPrecoCarro(String tipoCarro) {
        switch (tipoCarro.toLowerCase()) {
            case "economico":
                return PRECO_CARRO_ECONOMICO;
            case "executivo":
                return PRECO_CARRO_EXECUTIVO;
            case "luxo":
                return PRECO_CARRO_LUXO;
            default:
                throw new IllegalArgumentException("Tipo de carro desconhecido.");
        }
    }
}

