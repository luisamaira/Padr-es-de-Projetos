public class ConexaoBancoDadosSingleton {
    private static ConexaoBancoDadosSingleton instancia;

    private ConexaoBancoDadosSingleton() {
        System.out.println("Conexão ao banco de dados.");
    }

    public static ConexaoBancoDadosSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoBancoDadosSingleton();
        }
        return instancia;
    }

    public void executarQuery(String query) {
        System.out.println("Executando query: " + query);
    }
}
