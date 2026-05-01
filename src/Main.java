//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("esse e o scream match"));
    System.out.println("Filme: Top gun: Maverick");
    int anoDeLancamento = 2022;
    System.out.println("ano de lançamento;  " + anoDeLancamento);
    boolean incluidoNoPlano = false;
    double notaDoFilme = 8.1;
    double media = (9.8 + 6.3 + 8.0) /3;
    //Media calculada por fontes da minha cabeça
    System.out.println(media);
    String sinopse;
    sinopse = "Filme de aventura com galã dos anos 80";
    System.out.println(sinopse);
    int clasificacao;
    clasificacao = (int) (media /2);
    System.out.println(clasificacao);

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
