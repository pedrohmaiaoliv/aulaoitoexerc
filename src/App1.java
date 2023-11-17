import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = input.nextInt();

        if (numero >0) {
            System.out.println ("O número é opsitivo.");

        }else if (numero <0) {
            System.out.println ("o numero é negativo.");
        }else {
            System.out.println ("O número é zero.");
        }
    }
    
}
