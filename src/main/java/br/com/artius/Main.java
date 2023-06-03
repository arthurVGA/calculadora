package br.com.artius;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculadora();
    }

    private static void calculadora() {
        final Calculadora calculadora = new Calculadora();
        final Scanner scanner = new Scanner(System.in);

        while (true){
            final String operacao = getOperacao(scanner);
            if (operacao.equals("!q"))
                fechaCalculadora();

            final String num1 = getNumero("Número 1: ", scanner);
            final String num2 = getNumero("Número 2: ", scanner);

            showResultado(calculadora, operacao, num1, num2);
        }
    }

    private static void fechaCalculadora() {
        System.out.println("|==================================|");
        System.out.println("| Obrigado por utilizar!           |");
        System.out.println("|==================================|");
        System.exit(0);
    }

    private static void showResultado(Calculadora calculadora, String operacao, String num1, String num2) {
        try {
            Double resultado = calculadora.calcula(operacao, num1, num2);

            System.out.println("|==================================|");
            System.out.println("| Resposta: " + resultado);
            System.out.println("|==================================|");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    private static String getNumero(final String num, final Scanner scanner) {
        System.out.println(num);
        return scanner.nextLine();
    }

    private static String getOperacao(Scanner scanner) {
        System.out.println("|==================================|");
        System.out.println("| Calculadora Artius               |");
        System.out.println("|==================================|");
        System.out.println("| Digite a operação (+, -, * ou /) |");
        System.out.println("|==================================|");
        System.out.println("| Para sair digite !q              |");
        System.out.println("|==================================|");

        return scanner.nextLine();
    }
}