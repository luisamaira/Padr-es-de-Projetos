interface BancoDeDados {
    void conectar();
    void executarConsulta(String consulta);
    void desconectar();
}