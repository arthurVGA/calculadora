package br.com.artius.view.console;

import br.com.artius.controller.Calculadora;
import br.com.artius.operacao.Simbolo;

import java.util.Scanner;

public class CalculadoraConsole {
    private final Calculadora calculadora;
    private final Scanner scanner;
    private final MensagemConsole msgConsole;

    public CalculadoraConsole() {
        this.calculadora = new Calculadora();
        this.scanner = new Scanner(System.in);
        this.msgConsole = new MensagemConsole();
        this.msgConsole.nomeCalculadora();
    }

    public void getCalculadora() {
        msgConsole.operacoesPossiveis();
        Simbolo simbolo = getOperacao();
        Double resultado;

        if (simbolo == null)
            return;

        resultado = getResposta(simbolo);
        msgConsole.showResultado(resultado);
    }

    private Simbolo getOperacao() {
        final String op;
        final Simbolo simbolo;

        op = scanner.nextLine();
        simbolo = Simbolo.valueOf(op.charAt(0));

        if (op.equals("!q"))
            fechaCalculadora();

        if (simbolo == null)
            msgConsole.erroOperacaoNaoEncontrada();
        return simbolo;
    }

    private Double getValor(int contador) {
        msgConsole.numero(contador);
        return scanner.nextDouble();
    }

    private Double getResposta(Simbolo simbolo) {
        Double d1, d2;
        d1 = getValor(1);
        d2 = getValor(2);

        return calculadora.getOperacao(simbolo, d1, d2);
    }

    private void fechaCalculadora() {
        msgConsole.mensagemSaida();
        System.exit(0);
    }

}
