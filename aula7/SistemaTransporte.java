public class SistemaTransporte {

    private final IFabricaTransporte fabrica;

    public SistemaTransporte(IFabricaTransporte fabrica) {
        this.fabrica = fabrica;
    }

    public ITransporte criarTransporte() {
        return fabrica.criarTransporte();
    }
}
