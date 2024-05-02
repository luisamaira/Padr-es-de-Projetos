public class Main {
    public static void main(String[] args) {

        // Construindo um sanduíche padrão
        SanduicheDirector diretorPadrao = new SanduicheDirector();
        diretorPadrao.setBuilder(new DirectorSanduichePadrao());
        diretorPadrao.construirSanduiche();
        Sanduiche sanduichePadrao = diretorPadrao.getSanduiche();
        System.out.println("Sanduíche Padrão:");
        System.out.println(sanduichePadrao);

        // Construindo um sanduíche personalizado
        SanduicheDirector directorPersonalizado = new SanduicheDirector();
        directorPersonalizado.setBuilder(new DirectorSanduichePersonalizado());
        directorPersonalizado.construirSanduiche();
        Sanduiche sanduichePersonalizado = directorPersonalizado.getSanduiche();
        System.out.println("\nSanduíche Personalizado:");
        System.out.println(sanduichePersonalizado);
    }
}
