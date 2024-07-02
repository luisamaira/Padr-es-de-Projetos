public class PerfilUsuario {

    private TipoConta tipoConta;

    public PerfilUsuario(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public BancoDeDados selecionarSGBD() {
        switch (tipoConta) {
            case GRATUITO:
                return new AdaptadorParadox();
            case BASICO:
                return new AdaptadorFirebird();
            case ULTIMATE:
                return new AdaptadorMySQL();
            default:
                throw new IllegalArgumentException("Tipo de conta inválido");
        }
    }
    
}
