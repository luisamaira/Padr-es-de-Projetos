public interface Item {
    
    String getNome();
    double getPreco();
    void adicionar(Item item);
    void remover(Item item);
    Item getFilho(int index);
}
