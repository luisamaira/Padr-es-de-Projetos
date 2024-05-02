public class SanduicheDirector {
    private SanduicheBuilder builder;

    public void setBuilder(SanduicheBuilder builder) {
        this.builder = builder;
    }

    public Sanduiche getSanduiche() {
        return builder.getSanduiche();
    }

    public void construirSanduiche() {
        builder.buildPao();
        builder.buildRecheio();
        builder.buildVegetais();
        builder.buildMolho();
    }
}
