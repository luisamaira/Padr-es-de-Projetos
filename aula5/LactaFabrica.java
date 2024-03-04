public class LactaFabrica implements IFabricaOvoPascoa{

    @Override
    public IOvoPascoa OvoPequeno() {
        return new LactaALeite();
    }

    @Override
    public IOvoPascoa OvoMedio() {
        return new LactaOreo();
    }

    @Override
    public IOvoPascoa OvoGrande() {
        return new LactaSonho();
    }

    public IOvoPascoa OvoPremium() {
        return new LactaOuro();
    }
    
}
