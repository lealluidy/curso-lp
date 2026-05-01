import java.awt.*;
import java.util.Scanner;

public class Desafio {
    static void main(String[] args) {

        String nome = "Enoque Felipe";
        String tipoConta = "conta corrente";
        double saldo = 1775.99;
        int opcao = 0;

        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("tipo de conta: " + tipoConta);
        System.out.println("Valor em conta: " + saldo);
        System.out.println("\n*************************");

        String menu = """
                Digite sua opcão a seguir
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            Scanner Zanga = new Scanner(System.in);
            opcao = Zanga.nextInt();
            if (opcao == 1) {
                System.out.println("o saldo em sua conta corrente é:" + saldo + "\n");
            }   else if (opcao == 2) {
                System.out.println("qual o valor desejado a transferir?");
                double valor = Zanga.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo incompativel, adicione saldo para fazer a transferencia.\n");
            } else {
                    saldo -= valor;
                    System.out.println("novo saldo:" + saldo + "\n");
        }

    } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = Zanga.nextDouble();
                saldo +=valor;
                System.out.println("novo saldo:" + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida.");
            }
}}}