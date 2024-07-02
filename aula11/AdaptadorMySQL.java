public class AdaptadorMySQL implements BancoDeDados {
    
    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados MySQL");
    }

    @Override
    public void executarConsulta(String consulta) {
        System.out.println("Executando consulta no MySQL: " + consulta);
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco de dados MySQL");
    }
    
}
