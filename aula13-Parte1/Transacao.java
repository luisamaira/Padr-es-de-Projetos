public class Transacao {

    private String tipo;
    private double valor;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao(String tipo, double valor, Conta contaOrigem, Conta contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }
}

