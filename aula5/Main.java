public class Main {
    public static void main(String[] args) {
        
        IFabricaOvoPascoa fabricaGaroto = new GarotoFabrica();
        IOvoPascoa garotoBatom = fabricaGaroto.OvoPequeno();
        IOvoPascoa garotoCrocante = fabricaGaroto.OvoMedio();
        IOvoPascoa garotoTalento = fabricaGaroto.OvoGrande();

        garotoBatom.exibirInfo();
        garotoCrocante.exibirInfo();
        garotoTalento.exibirInfo();

        System.out.println();

        IFabricaOvoPascoa fabricaNestle = new NestleFabrica();
        IOvoPascoa nestleClassic = fabricaNestle.OvoPequeno();
        IOvoPascoa nestleKitKat = fabricaNestle.OvoMedio();
        IOvoPascoa nestleAlpino = fabricaNestle.OvoGrande();

        nestleClassic.exibirInfo();
        nestleKitKat.exibirInfo();
        nestleAlpino.exibirInfo();

        System.out.println();

        IFabricaOvoPascoa fabricaLacta = new LactaFabrica();
        IOvoPascoa lactaLeite = fabricaLacta.OvoPequeno();
        IOvoPascoa lactaOreo = fabricaLacta.OvoMedio();
        IOvoPascoa lactaSonho = fabricaLacta.OvoGrande();

        lactaLeite.exibirInfo();
        lactaOreo.exibirInfo();
        lactaSonho.exibirInfo();

        System.out.println();

        IOvoPascoa garotoCaribe = ((GarotoFabrica)fabricaGaroto).OvoPremium();
        IOvoPascoa nestleBis = ((NestleFabrica)fabricaNestle).OvoPremium();
        IOvoPascoa lactaOuro = ((LactaFabrica)fabricaLacta).OvoPremium();

        garotoCaribe.exibirInfo();
        nestleBis.exibirInfo();
        lactaOuro.exibirInfo();

        IFabricaOvoPascoa fabricaFerreiro = new FabricaFerreiro();
        IOvoPascoa ferreiro1 =  fabricaFerreiro.OvoPequeno();
        IOvoPascoa ferreiro2 = fabricaFerreiro.OvoMedio();
        IOvoPascoa ferreiro3 = fabricaFerreiro.OvoGrande();

        ferreiro1.exibirInfo();
        ferreiro2.exibirInfo();
        ferreiro3.exibirInfo();

        IFabricaOvoPascoa fabricaHershey = new FabricaHershey();
        IOvoPascoa hershey1 = fabricaHershey.OvoPequeno();
        IOvoPascoa hershey2 = fabricaHershey.OvoMedio();
        IOvoPascoa hershey3 = fabricaHershey.OvoGrande();

        hershey1.exibirInfo();
        hershey2.exibirInfo();
        hershey3.exibirInfo();


    }
}
