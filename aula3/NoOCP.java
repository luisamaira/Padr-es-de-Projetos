/**
 * NoOCP
 */
public class NoOCP {

    // Classe que viola o OCP
    public class Desconto {
        public double aplicarDesconto(double preco, String tipoDesconto) {
            if (tipoDesconto.equals("Desconto10")) {
                return preco * 0.9;
            } else if (tipoDesconto.equals("Desconto20")) {
                return preco * 0.8;
            } else {
                return preco;
            }
        }
    }
}

// Deve-se abstrair o contexto em uma interface.
// O código incorreto não é extensível para novos tipos de desconto sem
// modificar a classe existente.
