import java.util.HashSet;
import java.util.Set;

public class Assinatura {
    private AssinaturaBase assinaturaBase;
    private Set<Pacote> pacotes;

    public Assinatura(AssinaturaBase assinaturaBase) {
        this.assinaturaBase = assinaturaBase;
        this.pacotes = new HashSet<>();
    }

    public void adicionarPacote(Pacote pacote) {
        pacotes.add(pacote);
    }

    public double calcularPrecoTotal() {
        double precoTotal = assinaturaBase.obterPreco();
        for (Pacote pacote : pacotes) {
            precoTotal += pacote.obterPreco();
        }
        return precoTotal;
    }

    public void exibirDescricao() {
        System.out.println(assinaturaBase.obterDescricao());
        for (Pacote pacote : pacotes) {
            System.out.println(pacote.obterDescricao());
        }
        System.out.printf("Preço Total: R$ %.2f%n", calcularPrecoTotal());
    }
}
