import java.util.Scanner;
public class App5 {
 
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite o valor da segunda nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2)/2;
        System.out.println ("A média é = " + media);

        if (media >= 7) {
            if (media >=9) {
                System.out.println ("Excelente: ");
            }
                System.out.println ("Aluno aprovado!");
            }else if (media >= 4) {
                System.out.println ("Aluno em recuperação!");
            } else {
                System.out.println("Aluno não aprovado");
        }
    }
}
