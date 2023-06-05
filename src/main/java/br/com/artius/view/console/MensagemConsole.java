package br.com.artius.view.console;

public class MensagemConsole {

    public void menuPrincipal() {
        System.out.println("|==================================|");
        System.out.println("| Calculadora Artius               |");
        System.out.println("|==================================|");
        System.out.println("| 1. Somar                         |");
        System.out.println("| 2. Subtrair                      |");
        System.out.println("| 3. Multiplicar                   |");
        System.out.println("| 4. Dividir                       |");
        System.out.println("| 5. Potência                      |");
        System.out.println("| 6. Raiz                          |");
        System.out.println("| 7. Raiz Quadrada                 |");
        System.out.println("| 8. Fatorial                      |");
        System.out.println("| 9. Sair                          |");
        System.out.println("|==================================|");
    }

    public void perguntarNumero(final int contador) {
        System.out.println("|==================================|");
        System.out.println("| Informe o número " + contador + "               |");
        System.out.println("|==================================|");
    }

    public void perguntarExpressao() {
        System.out.println("|==================================|");
        System.out.println("| Informe a expressao              |");
        System.out.println("|==================================|");

    }

    public void mostrarResultado(final int resultado) {
        System.out.println("|==================================|");
        System.out.println("| Resposta: " + resultado);
        System.out.println("|==================================|");
    }
    public void mostrarResultado(final Double resultado) {
        System.out.println("|==================================|");
        System.out.println("| Resposta: " + resultado);
        System.out.println("|==================================|");
    }

    public void mostrarMensagemSaida() {
        System.out.println("|==================================|");
        System.out.println("| Obrigado por utilizar!           |");
        System.out.println("|==================================|");
    }

    public void erroOperacaoNaoEncontrada() {
        System.out.println("|==================================|");
        System.out.println("| Operação não encontrada!         |");
        System.out.println("|==================================|");
    }

}
