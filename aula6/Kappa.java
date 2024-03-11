public class Kappa implements ICamisa {

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaTime("Vasco", "Kappa");
    }
    
}
