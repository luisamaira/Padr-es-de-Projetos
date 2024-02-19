/**
 * OCP
 */
public class OCP {

    // Interface para estratégias de desconto
    public interface EstrategiaDesconto {
        double aplicarDesconto(double preco);
    }

    // Implementações específicas de estratégias de desconto
    public class Desconto10 implements EstrategiaDesconto {
        @Override
        public double aplicarDesconto(double preco) {
            return preco * 0.9;
        }
    }

    public class Desconto20 implements EstrategiaDesconto {
        @Override
        public double aplicarDesconto(double preco) {
            return preco * 0.8;
        }
    }

    // Classe que utiliza estratégias de desconto
    public class CalculadoraDesconto {
        private EstrategiaDesconto estrategiaDesconto;

        public CalculadoraDesconto(EstrategiaDesconto estrategiaDesconto) {
            this.estrategiaDesconto = estrategiaDesconto;
        }

        public double calcularDesconto(double preco) {
            return estrategiaDesconto.aplicarDesconto(preco);
        }
    }

}
// Cada classes, módulos, funções (etc.) está aberta para extensões, e fechada
// para alterações.
