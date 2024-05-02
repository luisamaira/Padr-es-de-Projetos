public class DirectorSanduichePadrao implements SanduicheBuilder {
    private Sanduiche sanduiche;

    public DirectorSanduichePadrao() {
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void buildPao() {
        sanduiche.setPao("Pão de Forma");
    }

    @Override
    public void buildRecheio() {
        sanduiche.setRecheio("Presunto e Queijo");
    }

    @Override
    public void buildVegetais() {
        sanduiche.setVegetais("Alface e Tomate");
    }

    @Override
    public void buildMolho() {
        sanduiche.setMolho("Maionese");
    }

    @Override
    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}
