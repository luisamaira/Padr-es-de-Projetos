public class Adidas implements ICamisa {

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaTime("Flamengo", "Adidas");
    }
    
}
