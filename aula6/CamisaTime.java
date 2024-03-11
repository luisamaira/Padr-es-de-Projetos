public class CamisaTime implements ICamisaEsportiva {
    private String time;
    private String fabrica;

    public CamisaTime(String time, String fabrica) {
        this.time = time;
        this.fabrica = fabrica;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Time: " + time);
        System.out.println("Fabricante: " + fabrica);
    }
    
}
