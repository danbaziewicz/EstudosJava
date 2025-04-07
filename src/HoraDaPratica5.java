import java.util.Scanner;

public class HoraDaPratica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int fatorial = 1;

        System.out.println("Digite um número para saber o fatorial dele: ");
        num = scanner.nextInt();

        for (int i = num; i > 1; i--) {
            fatorial *= i;

        }
            System.out.println(fatorial);

    }
}
