package br.com.artius;

import br.com.artius.view.console.CalculadoraConsole;
import br.com.artius.view.console.MensagemConsole;
import br.com.artius.view.console.MenuConsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final MenuConsole menuConsole = inicializarMenu();

        while (true)
            menuConsole.menuPrincipal();
    }

    private static MenuConsole inicializarMenu() {
        final Scanner sc = new Scanner(System.in);
        final Calculadora calculadora = new Calculadora();
        final MensagemConsole mensagemConsole = new MensagemConsole();
        final CalculadoraConsole calculadoraConsole = new CalculadoraConsole(sc, mensagemConsole, calculadora);

        return new MenuConsole(sc, mensagemConsole, calculadoraConsole);
    }

}