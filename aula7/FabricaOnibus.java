public class FabricaOnibus implements IFabricaTransporte {

    @Override
    public ITransporte criarTransporte() {
        return new Onibus();
    }

}
