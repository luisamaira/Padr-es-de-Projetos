public class GarotoFabrica implements IFabricaOvoPascoa{

    @Override
    public IOvoPascoa OvoPequeno() {
        return new GarotoBatom();
    }

    @Override
    public IOvoPascoa OvoMedio() {
        return new GarotoCrocante();
    }

    @Override
    public IOvoPascoa OvoGrande() {
        return new GarotoTalento();
    }

    public IOvoPascoa OvoPremium() {
        return new GarotoCaribe();
    }
    
}
