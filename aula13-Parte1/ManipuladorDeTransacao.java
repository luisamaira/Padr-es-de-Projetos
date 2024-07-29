public interface ManipuladorDeTransacao {
    
    void definirProximoManipulador(ManipuladorDeTransacao proximoManipulador);
    void processarTransacao(Transacao transacao);
}
