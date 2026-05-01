import java.util.Scanner;

public class Loop02 {
    static void main(String[] args) {
        Scanner Zanga = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        int totalDeNotas = 0;
        while (nota != -1) {
            System.out.println("diga sua avaliação pro filme ai paizão ou -1 para encerrar  ");
            nota = Zanga.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;

            System.out.println("media de avaliação " + mediaAvaliacao / totalDeNotas); {
        }

    }}}}

