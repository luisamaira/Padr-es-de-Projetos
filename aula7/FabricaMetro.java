public class FabricaMetro implements IFabricaTransporte {

    @Override
    public ITransporte criarTransporte() {
        return new Metro();
    }

}
