public class FabricaTropical implements IFabricaSorvete{

    @Override
    public ISorveteFruta fruta() {
        return new Uva();
    }

    @Override
    public ISorveteLeite leite() {
        return new Chocolate();
    }

    public ISorveteFruta sorvetePremium(){
        return new Limao();
    }
    
}
