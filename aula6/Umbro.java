public class Umbro implements ICamisa {

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaTime("Fluminense", "Umbro");
    }
    
}
