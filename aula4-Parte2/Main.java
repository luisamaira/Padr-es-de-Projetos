public class Main {
    public static void main(String[] args) {
        
        IFabricaFarmacia fabricaDrogasil = new FabricaDrogasil();
        IAnalgesico analgesicoIbup = fabricaDrogasil.analgesico();
        IAntibiotico antibioticoAzit = fabricaDrogasil.antibiotico();
    
        analgesicoIbup.exibirInfo();
        antibioticoAzit.exibirInfo();

        IFabricaFarmacia fabricaDrogamar = new FabricaDrogamar();
        IAnalgesico analgesicoParac = fabricaDrogamar.analgesico();
        IAntibiotico antibioticoAmox = fabricaDrogamar.antibiotico();

        analgesicoParac.exibirInfo();
        antibioticoAmox.exibirInfo();

        IFabricaFarmacia fabricaDrogaria = new FabricaDrogaria();
        IAnalgesico analgesicoNapro = fabricaDrogaria.analgesico();
        IAntibiotico antibioticoDoxi = fabricaDrogaria.antibiotico();

        analgesicoNapro.exibirInfo();
        antibioticoDoxi.exibirInfo();
    }
}
