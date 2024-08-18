public class AssinaturaFactory {
    public AssinaturaBase criarAssinaturaBase() {
        return new AssinaturaBase();
    }
    
    public Pacote criarPacote(String tipo) {
        switch (tipo.toLowerCase()) {
            case "assistir em varios dispositivos":
                return new PacoteAssistirEmVariosDispositivos();
            case "frete gratis":
                return new PacoteFreteGratis();
            case "caixa surpresa":
                return new PacoteCaixaSurpresa();
            case "credito platinum":
                return new PacoteCreditoPlatinum();
            case "cash back":
                return new PacoteCashBack();
            default:
                throw new IllegalArgumentException("Pacote desconhecido.");
        }
    }
}
