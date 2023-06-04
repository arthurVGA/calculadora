package br.com.artius.view.console;

public class MensagemConsole {

    public void nomeCalculadora() {
        System.out.println("|==================================|");
        System.out.println("| Calculadora Artius               |");
        System.out.println("|==================================|");
    }
    public void operacoesPossiveis() {
        System.out.println("|==================================|");
        System.out.println("| Digite a operação (+, -, * ou /) |");
        System.out.println("|==================================|");
        System.out.println("| Para sair digite !q              |");
        System.out.println("|==================================|");
    }

    public void numero(final int contador) {
        System.out.println("|==================================|");
        System.out.println("| Numero " + contador + ":                        |");
        System.out.println("|==================================|");
    }

    public void showResultado(final Double resultado) {
        System.out.println("|==================================|");
        System.out.println("| Resposta: " + resultado);
        System.out.println("|==================================|");
    }

    public void mensagemSaida() {
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
