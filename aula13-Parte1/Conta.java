public class Conta {
    
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}

