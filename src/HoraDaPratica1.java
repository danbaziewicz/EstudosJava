import java.util.Scanner;

public class HoraDaPratica1 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        int numEscolhido = 0;
        System.out.println("Digite um número: ");
        numEscolhido = scannner.nextInt();

        if (numEscolhido < 0) {
            System.out.println("O número é negativo");
        } else if (numEscolhido == 0) {
            System.out.println("O número é igual a zero");
        } else {
            System.out.println("O número é positivo");
        }
    }
}
