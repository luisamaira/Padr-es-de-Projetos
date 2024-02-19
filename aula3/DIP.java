/**
 * DIP
 */
public class DIP {

    // Interface para o Motor (Abstração)
    public interface Motor {
        void iniciar();
    }

    // Implementação concreta de baixo nível para o Motor.
    public class MotorPadrao implements Motor {
        @Override
        public void iniciar() {
            System.out.println("Motor padrão iniciado.");
        }
    }

    // Classe de alto nível que depende da abstração do Motor.
    public class Carro {
        private Motor motor;

        public Carro(Motor motor) {
            this.motor = motor;
        }

        public void ligar() {
            motor.iniciar();
            System.out.println("Carro ligado.");
        }
    }
}

// Classe principal para demonstrar o uso
public class Main {
    public static void main(String[] args) {
        // Agora, pode-se injetar qualquer implementação de Motor, respeitando o DIP
        Motor motorPadrao = new MotorPadrao();
        Carro meuCarro = new Carro(motorPadrao);
        meuCarro.ligar();
    }
}

// Foi colocado uma interface Motor e uma implementação concreta MotorPadrao.
// A classe Carro agora depende da abstração (Motor) em vez de uma implementação
// concreta, seguindo o DIP.
// Na classe principal, podemos facilmente trocar a implementação do Motor sem
// modificar
// a classe Carro, demonstrando a flexibilidade proporcionada pelo DIP.