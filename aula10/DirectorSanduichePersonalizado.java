public class DirectorSanduichePersonalizado implements SanduicheBuilder {
    private Sanduiche sanduiche;

    public DirectorSanduichePersonalizado() {
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void buildPao() {
        sanduiche.setPao("Pão Integral");
    }

    @Override
    public void buildRecheio() {
        sanduiche.setRecheio("Frango e Queijo");
    }

    @Override
    public void buildVegetais() {
        sanduiche.setVegetais("Rúcula e Cebola");
    }

    @Override
    public void buildMolho() {
        sanduiche.setMolho("Mostarda e Mel");
    }

    @Override
    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}
