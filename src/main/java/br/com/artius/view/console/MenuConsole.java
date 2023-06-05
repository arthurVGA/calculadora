package br.com.artius.view.console;

import br.com.artius.view.functionalInterface.Opcao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuConsole {

    private final Scanner sc;
    private final MensagemConsole mensagem;
    private final CalculadoraConsole calculadoraConsole;
    private final Map<Integer, Opcao> menuPrincipal;

    public MenuConsole(Scanner sc, MensagemConsole mensagem, CalculadoraConsole calculadoraConsole) {
        this.sc = sc;
        this.mensagem = mensagem;
        this.calculadoraConsole = calculadoraConsole;

        this.menuPrincipal = setOpcoesMenuPrincipal();
    }

    private Map<Integer, Opcao> setOpcoesMenuPrincipal() {
        final Map<Integer, Opcao> menuPrincipal = new HashMap<>();
        menuPrincipal.put(1, calculadoraConsole::somar);
        menuPrincipal.put(2, calculadoraConsole::subtrair);
        menuPrincipal.put(3, calculadoraConsole::multiplicar);
        menuPrincipal.put(4, calculadoraConsole::dividir);
        menuPrincipal.put(5, calculadoraConsole::potencia);
        menuPrincipal.put(6, calculadoraConsole::raizQuadrada);
        menuPrincipal.put(7, calculadoraConsole::raiz);
        menuPrincipal.put(8, calculadoraConsole::fatorial);
        menuPrincipal.put(9, this::fechaCalculadora);
        return menuPrincipal;
    }

    public void menuPrincipal() {
        mensagem.menuPrincipal();
        menuPrincipal.get(sc.nextInt()).executar();
    }

    private void fechaCalculadora() {
        mensagem.mostrarMensagemSaida();
        System.exit(0);
    }

}
