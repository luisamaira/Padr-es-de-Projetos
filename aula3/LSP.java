/**
 * LSP
 */
public class LSP {

    // Interface para formas geométricas
    public interface FormaGeometrica {
        int calcularArea();
    }

    // Implementação para retângulo
    public class Retangulo implements FormaGeometrica {
        protected int largura;
        protected int altura;

        public void setLargura(int largura) {
            this.largura = largura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        @Override
        public int calcularArea() {
            return largura * altura;
        }
    }

    // Implementação para quadrado
    public class Quadrado implements FormaGeometrica {
        private int lado;

        public void setLado(int lado) {
            this.lado = lado;
        }

        @Override
        public int calcularArea() {
            return lado * lado;
        }
    }
}

// O código correto utiliza uma interface FormaGeometrica
// para garantir que todas as implementações possam ser substituídas umas pelas
// outras.