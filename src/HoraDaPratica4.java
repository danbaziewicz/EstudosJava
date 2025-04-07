import java.util.Scanner;

public class HoraDaPratica4 {
    public static void main(String[] args) {
        Scanner scannerr = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número: ");
        numero = scannerr.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        scannerr.close();

    }
}
