public class Puma implements ICamisa {

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaTime("Botafogo", "Puma");
    }
    
}
