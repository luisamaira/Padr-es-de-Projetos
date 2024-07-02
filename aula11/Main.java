public class Main {
    
    public static void main(String[] args) {
        
        PerfilUsuario perfilUsuario = new PerfilUsuario(TipoConta.BASICO);
        BancoDeDados sgbd = perfilUsuario.selecionarSGBD();

        sgbd.conectar();
        sgbd.executarConsulta("SELECT * FROM tabela");
        sgbd.desconectar();
    }
}
