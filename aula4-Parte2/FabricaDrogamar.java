public class FabricaDrogamar implements IFabricaFarmacia {

    @Override
    public IAntibiotico antibiotico() {
        return new Amoxilina();
    }

    @Override
    public IAnalgesico analgesico() {
        return new Paracetamol();
    }
    
}
