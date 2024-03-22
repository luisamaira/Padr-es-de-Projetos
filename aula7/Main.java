public class Main {

    public static void main(String[] args) {
        IFabricaTransporte fabricaOnibus = new FabricaOnibus();
        IFabricaTransporte fabricaMetro = new FabricaMetro();

        SistemaTransporte sistemaOnibus = new SistemaTransporte(fabricaOnibus);
        ITransporte onibus = sistemaOnibus.criarTransporte();
        System.out.println("Ônibus - Capacidade: " + onibus.capacidade() + ", Método de pagamento: " + onibus.metodoPagamento() + ", Rota: " + onibus.rota());

        SistemaTransporte sistemaMetro = new SistemaTransporte(fabricaMetro);
        ITransporte metro = sistemaMetro.criarTransporte();
        System.out.println("Metrô - Capacidade: " + metro.capacidade() + ", Método de pagamento: " + metro.metodoPagamento() + ", Rota: " + metro.rota());
    }
    
}
