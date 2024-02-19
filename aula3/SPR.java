/**
 * SPR
 */
public class SPR {

    // Classe Funcionario, apenas com a representação dos dados
    public class Funcionario {
    private String nome;
    private double salario;
    private double desconto;

    public Funcionario(String nome, double salario, double desconto) {
        this.nome = nome;
        this.salario = salario;
        this.desconto = desconto;
    }

    // Classe CalcularSalarioBase, responsável por calcular o salario
    public class calcularSalarioBase {
        public double calcularSalario() {
            return salario - desconto;
        }

    }

    // Classe AumentoSalarial, responsável pela atualização do salário
    public class AumentoSalarial {
            public void AumentoSalario(double percentagem) {
                salario = salario + (salario * percentagem) / 100;
    
            }
            
        }
    }
}

// O código é menor.
−// É mais fácil de Ler, Entender e Manter.
−// O Código é mais fácil de testar.
−// Alterações são mais fáceis de gerenciar.
−// O código é mais fácil de substituir.
−// A contenção de código por múltiplos desenvolvedores é reduzida.
−// Implantação pode ser reduzida.