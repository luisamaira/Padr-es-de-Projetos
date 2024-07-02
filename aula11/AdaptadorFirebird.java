public class AdaptadorFirebird implements BancoDeDados {

    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados Firebird");
    }

    @Override
    public void executarConsulta(String consulta) {
        System.out.println("Executando consulta no Firebird: " + consulta);
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco de dados Firebird");
    }
}
