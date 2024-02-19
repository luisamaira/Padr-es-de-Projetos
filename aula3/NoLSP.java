/**
 * NoLSP
 */
public class NoLSP {

    // Classe que viola o LSP
    public class Retangulo {
        protected int largura;
        protected int altura;

        public void setLargura(int largura) {
            this.largura = largura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public int calcularArea() {
            return largura * altura;
        }
    }
}

// O código incorreto viola o LSP porque não é possível substituir corretamente
// um Retangulo por um Quadrado.
