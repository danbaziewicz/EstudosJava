import java.util.Scanner;

public class HoraDaPratica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro número");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("O número "+num1+" é maior que "+num2+".");
        } else if (num1 < num2) {
            System.out.println("O número "+num2+" é maior que "+num1+".");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
