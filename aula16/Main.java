public class Main {
    public static void main(String[] args) {
        AssinaturaFactory factory = new AssinaturaFactory();
        
        AssinaturaBase assinaturaBase = factory.criarAssinaturaBase();
        Assinatura assinatura = new Assinatura(assinaturaBase);
        
        assinatura.adicionarPacote(factory.criarPacote("assistir em varios dispositivos"));
        assinatura.adicionarPacote(factory.criarPacote("frete gratis"));
        assinatura.adicionarPacote(factory.criarPacote("caixa surpresa"));
        
        assinatura.exibirDescricao();
    }
}
