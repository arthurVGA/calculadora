package br.com.artius;

import br.com.artius.view.console.CalculadoraConsole;

public class Main {
    public static void main(String[] args) {
        calculadora();
    }

    private static void calculadora() {
        final CalculadoraConsole console = new CalculadoraConsole();
        while (true)
            console.getCalculadora();
    }

}