public class SistemaVendaPassagens {
    private static final int PRECO_CLASSE_ECONOMICA = 500;
    private static final int PRECO_CLASSE_EXECUTIVA = (int) (PRECO_CLASSE_ECONOMICA * 2.5);
    private static final int PRECO_PRIMEIRA_CLASSE = (int) (PRECO_CLASSE_EXECUTIVA * 2.5);
    
    public int obterPrecoAssento(int fileira) {
        if (fileira >= 1 && fileira <= 3) {
            return PRECO_PRIMEIRA_CLASSE;
        } else if (fileira >= 4 && fileira <= 8) {
            return PRECO_CLASSE_EXECUTIVA;
        } else {
            return PRECO_CLASSE_ECONOMICA;
        }
    }

    public String reservarAssento(int fileira, char assento) {
        return "Assento " + fileira + assento + " reservado.";
    }
}
