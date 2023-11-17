
import java.util.Scanner;
 public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = input.nextInt ();

        if (numero %2 == 0) {
            System.out.println("O número é par.");
        }else{
            System.out.println("o número é impar.");
        
        }
    }
 }