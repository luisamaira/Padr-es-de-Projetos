public class FabricaMoranguinho implements IFabricaSorvete{

    @Override
    public ISorveteFruta fruta() {
        return new Groselha();
    }

    @Override
    public ISorveteLeite leite() {
        return new Morango();
    }

    public ISorveteLeite sorvetePremium(){
        return new Creme();
    }
    
}
