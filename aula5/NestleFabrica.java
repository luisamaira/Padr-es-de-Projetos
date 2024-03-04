public class NestleFabrica implements IFabricaOvoPascoa{

    @Override
    public IOvoPascoa OvoPequeno() {
        return new NestleClassic();
    }

    @Override
    public IOvoPascoa OvoMedio() {
        return new NestleKitKat();
    }

    @Override
    public IOvoPascoa OvoGrande() {
        return new NestleAlpino();
    }

    public IOvoPascoa OvoPremium() {
        return new NestleBis();
    }
    
}
