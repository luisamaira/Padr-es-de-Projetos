import java.util.ArrayList;
import java.util.List;

public class Caixa implements Item {
    
    private List<Item> itens = new ArrayList<>();
    
    @Override
    public String getNome() {
        return "Caixa de Assinatura";
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public void adicionar(Item item) {
        itens.add(item);
    }

    @Override
    public void remover(Item item) {
        itens.remove(item);
    }

    @Override
    public Item getFilho(int index) {
        return itens.get(index);
    }
    
    public void exibirItens() {
        System.out.println(getNome() + ":");
        for (Item item : itens) {
            System.out.println("- " + item.getNome() + ": R$ " + item.getPreco());
        }
        System.out.println("Total: R$ " + getPreco());
    }
}

