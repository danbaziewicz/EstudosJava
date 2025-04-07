import java.util.Scanner;
import java.util.function.Function;

public class HoraDaPratica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double raio, lado;

        do {
            opcao = menu(scanner);

            if(opcao == 1){
                System.out.println("Digite o lado do quadrado");
                lado = scanner.nextDouble();
                System.out.println("A área do quadrado é: " + lado*lado);
            } else if (opcao == 2) {
                System.out.println("Digite o raio do círculo");
                raio = scanner.nextDouble();
                System.out.println("A área do círculo é: " + Math.PI*raio*raio);
            } else {
                System.out.println("Digite um número válido");
            }

        } while (opcao !=1 && opcao !=2);

        scanner.close();
    }
    public static int menu(Scanner scanner){
        System.out.println("""
                    1 - Calcular a área do quadrado.
                    2 - Calcular a área do círculo.
                    """);
        return scanner.nextInt();
    }
}
