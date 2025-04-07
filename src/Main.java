//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.println("Bem vindo ao Screen");
        //System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        //System.out.println("Ano de lançamento: " + ano);

        boolean incluidoNoPlano = true;

        double notaDoFilme = (6.1 + 8.4 + 9.3)/3;
        System.out.println("Nota IMDB: %.2f".formatted(notaDoFilme));

        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento:
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao= (int) (notaDoFilme/2);
        System.out.println(classificacao);
    }
}