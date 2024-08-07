import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Assinatura {

    private Caixa caixa;
    
    private static final List<ItemIndividual> ITENS_DISPONIVEIS = Arrays.asList(
        new ItemIndividual("Quadrinho", 15.00),
        new ItemIndividual("Chaveiro", 5.00),
        new ItemIndividual("Busto", 10.00),
        new ItemIndividual("Adesivo", 1.00),
        new ItemIndividual("Poster", 25.00),
        new ItemIndividual("Camiseta", 25.00),
        new ItemIndividual("Caneta", 3.00),
        new ItemIndividual("Miniatura", 20.00)
    );

    public Assinatura(String nivel) {
        caixa = new Caixa();
        int numeroItens = switch (nivel) {
            case "Bronze" -> 3;
            case "Prata" -> 5;
            case "Ouro" -> 7;
            case "Platina" -> 10;
            default -> throw new IllegalArgumentException("Nível de assinatura inválido.");
        };
        gerarCaixa(numeroItens);
    }

    private void gerarCaixa(int numeroItens) {
        Random rand = new Random();
        for (int i = 0; i < numeroItens; i++) {
            ItemIndividual item = ITENS_DISPONIVEIS.get(rand.nextInt(ITENS_DISPONIVEIS.size()));
            caixa.adicionar(item);
        }
    }

    public void exibirCaixa() {
        caixa.exibirItens();
    }
}
