public class Exercicio1 {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 7.4;
        int mediaNota;

        mediaNota = (int) (nota1 + nota2);

        System.out.printf("A media é : %d%n",mediaNota);

        char letra = 'A';
        String palavra = "Letra";

        System.out.printf("%s %s%n",palavra, letra);


        double precoProd = 15.50;
        int quantidade = 10;
        double total = precoProd + quantidade;
        System.out.printf("Você vai pagar R$ %.2f por %d produtos%n", total, quantidade);

        double valorEmDolar = 200;
        double valorReal = 5.62;
        double convertido = valorEmDolar * valorReal;
        System.out.printf("$ %.2f é igual a: R$ %.2f%n",valorEmDolar, convertido);
        System.out.printf("Cotação atual do Dolar: R$ %.2f%n", valorReal);

        double precoOriginal = 100;
        double percentualDesconto = (double) 10 / 100;
        double precoComDesconto = precoOriginal - (precoOriginal * percentualDesconto);

        System.out.printf("O preço com desconto é: R$ %.2f", precoComDesconto);

    }
}
