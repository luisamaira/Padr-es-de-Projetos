/**
 * NoSPR
 */
public class NoSPR {

    // Classe que viola o SRP
    public class Funcionario {
        private String nome;
        private double salario;
        private double desconto;

        // TODOS OS METODOS UNIDOS EM UMA CLASSE;

        public Funcionario(String nome, double salario, double desconto) {
            this.nome = nome;
            this.salario = salario;
            this.desconto = desconto;
        }

        public double calcularSalarioBase() {
            return salario - desconto;
        }

        public void AumentoSalario(double percentagem) {
            salario = salario + (salario * percentagem) / 100;

        }
    }
}

// Uma unica classe tem a responsabilidade
// Dificuldade de reaproveitamento do codigo
