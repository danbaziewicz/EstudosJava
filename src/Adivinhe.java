import java.util.Scanner;
import java.util.Random;

public class Adivinhe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int palpite;

        while(tentativas < 5) {
            System.out.println("Tente adivinhar o número secreto!");
            palpite = scan.nextInt();
            tentativas++;
            if(palpite == numAleatorio) {
                System.out.println("Parabés! Você acertou em "+tentativas+" tentativas!");
                break;
            } else if (palpite < numAleatorio) {
                System.out.println("Mais!");
            } else {
                System.out.println("Menos!");
            }
            if(tentativas == 5) {
                System.out.println("O número secreto era: " + numAleatorio);
                break;
            }
        }
    }
}
