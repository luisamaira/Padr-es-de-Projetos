public class FabricaDrogaria implements IFabricaFarmacia {

    @Override
    public IAntibiotico antibiotico() {
        return new Doxiciclina();
    }

    @Override
    public IAnalgesico analgesico() {
        return new Naproxeno();
    }

    
}