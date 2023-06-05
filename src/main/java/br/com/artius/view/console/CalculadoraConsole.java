package br.com.artius.view.console;

import br.com.artius.Calculadora;

import java.util.Scanner;

public class CalculadoraConsole {

    private final Scanner sc;
    private final MensagemConsole mensagem;
    private final Calculadora calculadora;

    public CalculadoraConsole(final Scanner sc, final MensagemConsole mensagem, final Calculadora calculadora) {
        this.sc = sc;
        this.mensagem = mensagem;
        this.calculadora = calculadora;
    }

    public void somar() {
        mensagem.perguntarNumero(1);
        double num1 = sc.nextDouble();

        mensagem.perguntarNumero(2);
        double num2 = sc.nextDouble();

        mensagem.mostrarResultado(calculadora.somar(num1, num2));
    }

    public void subtrair() {
        mensagem.perguntarNumero(1);
        double num1 = sc.nextDouble();

        mensagem.perguntarNumero(2);
        double num2 = sc.nextDouble();

        mensagem.mostrarResultado(calculadora.subtrair(num1, num2));
    }
    public void multiplicar() {
        mensagem.perguntarNumero(1);
        double num1 = sc.nextDouble();

        mensagem.perguntarNumero(2);
        double num2 = sc.nextDouble();

        mensagem.mostrarResultado(calculadora.multiplicar(num1, num2));
    }
    public void dividir() {
        mensagem.perguntarNumero(1);
        double num1 = sc.nextDouble();

        mensagem.perguntarNumero(2);
        double num2 = sc.nextDouble();

        mensagem.mostrarResultado(calculadora.dividir(num1, num2));
    }

    public void potencia() {
        mensagem.perguntarNumero(1);
        double num1 = sc.nextDouble();

        mensagem.perguntarNumero(2);
        double num2 = sc.nextDouble();

        mensagem.mostrarResultado(calculadora.potencia(num1, num2));
    }

    public void raiz() {
        mensagem.perguntarNumero(1);
        double num1 = sc.nextDouble();

        mensagem.perguntarNumero(2);
        double num2 = sc.nextDouble();

        mensagem.mostrarResultado(calculadora.raiz(num1, num2));
    }

    public void raizQuadrada() {
        mensagem.perguntarNumero(1);
        double num1 = sc.nextDouble();

        mensagem.mostrarResultado(calculadora.raizQuadrada(num1));
    }

    public void fatorial() {
        mensagem.perguntarNumero(1);
        double num1 = sc.nextDouble();

        mensagem.mostrarResultado(calculadora.fatorial(num1));
    }

}
