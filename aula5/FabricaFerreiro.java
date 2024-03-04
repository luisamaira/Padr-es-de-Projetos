public class FabricaFerreiro implements IFabricaOvoPascoa {

    @Override
    public IOvoPascoa OvoPequeno() {
        return new Ferreiro1();
    }

    @Override
    public IOvoPascoa OvoMedio() {
        return new Ferreiro2();
    }

    @Override
    public IOvoPascoa OvoGrande() {
        return new Ferreiro3();
    }


}
