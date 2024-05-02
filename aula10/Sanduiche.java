public class Sanduiche {
    private String pao;
    private String recheio;
    private String vegetais;
    private String molho;

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setVegetais(String vegetais) {
        this.vegetais = vegetais;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "pao='" + pao + '\'' +
                ", recheio='" + recheio + '\'' +
                ", vegetais='" + vegetais + '\'' +
                ", molho='" + molho + '\'' +
                '}';
    }
}