public class Onibus implements ITransporte {

    @Override
    public int capacidade() {
        return 50;
    }

    @Override
    public String metodoPagamento() {
        return "Dinheiro, cartão";
    }

    @Override
    public String rota() {
        return "Pontos de partida e chegada do ônibus";
    }

}
