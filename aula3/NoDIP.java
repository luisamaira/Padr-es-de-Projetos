/**
 * NoDIP
 */
public class NoDIP {

    // Classe de alto nível que depende de uma implementação concreta de baixo nível
    public class Carro {
        private Motor motor;

        public Carro() {
            this.motor = new Motor();
        }

        public void ligar() {
            motor.iniciar();
            System.out.println("Carro ligado.");
        }
    }

    // Implementação concreta de baixo nível
    public class Motor {
        public void iniciar() {
            System.out.println("Motor iniciado.");
        }
    }


        }
          // Classe principal para demonstrar o uso
    public class Main {
        public static void main(String[] args) {
            Carro meuCarro = new Carro();
            meuCarro.ligar();
    }
}
