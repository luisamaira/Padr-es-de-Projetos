public class Main {
    public static void main(String[] args) {
        
        IFabricaSorvete fabricaMoranguinho = new FabricaMoranguinho();
        ISorveteLeite morangoLeite = fabricaMoranguinho.leite();
        ISorveteFruta groselhaFruta = fabricaMoranguinho.fruta();

        morangoLeite.exibirInfo();
        groselhaFruta.exibirInfo();

        IFabricaSorvete fabricaTropical = new FabricaTropical();
        ISorveteLeite chocolaLeite = fabricaTropical.leite();
        ISorveteFruta uvaFruta = fabricaTropical.fruta();

        chocolaLeite.exibirInfo();
        uvaFruta.exibirInfo();

        ISorveteFruta limaoFruta = ((FabricaTropical)fabricaTropical).sorvetePremium();
        ISorveteLeite cremeLeite = ((FabricaMoranguinho)fabricaMoranguinho).sorvetePremium();
    
        limaoFruta.exibirInfo();
        cremeLeite.exibirInfo();
    
    }
}
