public class Metro implements ITransporte {

    @Override
    public int capacidade() {
        return 300;
    }

    @Override
    public String metodoPagamento() {
        return "Cartão";
    }

    @Override
    public String rota() {
        return "Estações de partida e destino do metrô";
    }
}
