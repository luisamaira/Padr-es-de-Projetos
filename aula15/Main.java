public class Main {
    public static void main(String[] args) {
        FacadePacoteViagem pacoteViagem = new FacadePacoteViagem();
        
        pacoteViagem.reservarPacoteViagem(
            "João Silva", "123.456.789-00", 5, 'C', "executivo", "luxo", "credito", 3);
    
        }
}

