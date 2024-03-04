public class FabricaDrogasil implements IFabricaFarmacia {

    @Override
    public IAntibiotico antibiotico() {
        return new Azitromicina();
        
    }

    @Override
    public IAnalgesico analgesico() {
        return new Ibuprofeno();
        
    }
    
}
