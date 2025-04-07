import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = scanner.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = scanner.nextInt();
        System.out.println("De uma avaliação de 0 a 10 para o filme.");
        double notaFilme = scanner.nextDouble();

        System.out.printf("""
        Seu filme favorito é: %s.
        O filme foi lançado em: %d.
        A nota que você deu para o filme foi: %.2f.%n
        """,filme ,anoDeLancamento, notaFilme);

        scanner.close();
    }
}
