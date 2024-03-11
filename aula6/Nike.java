public class Nike implements ICamisa {

    @Override
    public ICamisaEsportiva criarCamisa() {
        return new CamisaTime("Brasil", "Nike");
    }
    
}
