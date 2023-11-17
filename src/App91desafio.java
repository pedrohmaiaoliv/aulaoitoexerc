import java.util.Scanner;
public class App91desafio {
    public static void main(String[]args) {
        int valor;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o valor da tabuada: ");
        valor = teclado.nextInt();
        int T = 0;
        while (T <=10) {
            System.out.println (valor + " x " + T + " = " + (valor*T));
            T++;
        }
    }
}
