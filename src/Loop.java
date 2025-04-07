import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaNota = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme:");
            nota = scanner.nextDouble();
            mediaNota += nota;
        }
        mediaNota = mediaNota/3;
        System.out.println("A média de avaliação é: " + mediaNota);

        scanner.close();
    }
}
