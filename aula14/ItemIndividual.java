public class ItemIndividual implements Item {
    
    private String nome;
    private double preco;

    public ItemIndividual(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void adicionar(Item item) {
        throw new UnsupportedOperationException("Operação não suportada para itens individuais.");
    }

    @Override
    public void remover(Item item) {
        throw new UnsupportedOperationException("Operação não suportada para itens individuais.");
    }

    @Override
    public Item getFilho(int index) {
        throw new UnsupportedOperationException("Operação não suportada para itens individuais.");
    }
}
