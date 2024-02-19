/**
 * NoISP
 */
public class NoISP {

    // Interface que viola o ISP
    public interface Trabalhador {
        void trabalhar();

        void descansar();

        void gerenciar(); // Violação: Nem todos os trabalhadores precisam implementar esse método
    }

    // Implementação para TrabalhadorComum
    public class TrabalhadorComum implements Trabalhador {
        private String nome;

        public TrabalhadorComum(String nome) {
            this.nome = nome;
        }

        @Override
        public void trabalhar() {
            System.out.println(nome + " está trabalhando.");
        }

        @Override
        public void descansar() {
            System.out.println(nome + " está descansando.");
        }

        @Override
        public void gerenciar() {
            System.out.println(nome + " está gerenciando. (Violação do ISP)");
        }
    }
}

// Na versão incorreta, a interface Trabalhador possui um método gerenciar(),
// forçando todas as classes que a implementam a fornecer uma implementação
// desnecessária.