import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaNota = 0;
        double nota = 0;
        int contadorNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para ecerrar.");
            nota = scanner.nextDouble();

            if (nota != -1) {
                mediaNota += nota;
                contadorNotas++;
            }
        }
        mediaNota = mediaNota/contadorNotas;
        System.out.println("A média de avaliação é: " + mediaNota);

        scanner.close();
    }
}
