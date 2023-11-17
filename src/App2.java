import java.util.Scanner;
public class App2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o Segundo Numero:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println ("O primeiro numero é maior que o segundo");
        }else{
            System.out.println ("O segundo numero é maior que o prmeiro");
        }
    }
    
}
