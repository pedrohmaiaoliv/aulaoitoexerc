import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String diaDaSemana = scanner.next();
        
        switch (diaDaSemana) {
            case "segunda":
            case "terça":
            case "quarta":
            case "quinta":
            case "sexta":
                System.out.println("hoje é dia de semana");
                break;
            case "sabado":
            case "domingo":
                System.out.println("hoje é fim de semana");
                break;
            default:
                System.out.println("Dia de semana Inválido");

        }
    }    
}
