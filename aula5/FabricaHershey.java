public class FabricaHershey implements IFabricaOvoPascoa{

    @Override
    public IOvoPascoa OvoPequeno() {
        return new Hershey1(); 
    }

    @Override
    public IOvoPascoa OvoMedio() {
        return new Hershey2();
    }

    @Override
    public IOvoPascoa OvoGrande() {
        return new Hershey3();
    }

    
}