/**
 * ISP
 */
public class ISP {

    // Interfaces segregadas
    public interface Trabalhador {
        void trabalhar();

        void descansar();
    }

    public interface Gerente {
        void gerenciar();
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
    }

    // Implementação para Gerente
    public class Gerente implements Gerente {
        private String nome;

        public Gerente(String nome) {
            this.nome = nome;
        }

        @Override
        public void gerenciar() {
            System.out.println(nome + " está gerenciando.");
        }
    }
}

// Na versão correta, as interfaces foram segregadas em
// Trabalhador e Gerente, permitindo que as classes implementem
// apenas as funcionalidades relevantes para elas. Isso respeita o Princípio da
// Segregação de Interface.