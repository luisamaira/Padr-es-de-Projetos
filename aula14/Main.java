public class Main {
    public static void main(String[] args) {
        Assinatura assinaturaBronze = new Assinatura("Bronze");
        assinaturaBronze.exibirCaixa();

        System.out.println();

        Assinatura assinaturaPrata = new Assinatura("Prata");
        assinaturaPrata.exibirCaixa();

        System.out.println();

        Assinatura assinaturaOuro = new Assinatura("Ouro");
        assinaturaOuro.exibirCaixa();

        System.out.println();

        Assinatura assinaturaPlatina = new Assinatura("Platina");
        assinaturaPlatina.exibirCaixa();
    }
}
