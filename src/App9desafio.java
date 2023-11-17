import java.util.Scanner;
public class App9desafio {
    public static void main(String[]args) {
        int valor;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o valor da tabuada: ");
        valor = teclado.nextInt();
        for (int T = 0; T <= 10; T++) {
            System.out.println (valor + " x " + T + " = " + (valor*T));
        }
    }
}
