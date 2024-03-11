import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um time (Brasil, Flamengo, Botafogo, Fluminense, Vasco): ");
        String timeEscolhido = sc.nextLine();

        ICamisa factory = escolherFabrica(timeEscolhido);
        ICamisaEsportiva camisa = factory.criarCamisa();

        camisa.mostrarInfo();

        sc.close();
    }

    private static ICamisa escolherFabrica(String time) {
        switch (time) {
            case "Brasil":
                return new Nike();
            case "Flamengo":
                return new Adidas();
            case "Botafogo":
                return new Puma();
            case "Fluminense":
                return new Umbro();
            case "Vasco":
                return new Kappa();
            default:
                System.out.println("Time não reconhecido: " + time);
        }
        return null;
    }
}
