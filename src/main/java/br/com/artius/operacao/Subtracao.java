package br.com.artius.operacao;

public class Subtracao extends Operacao {

    @Override
    public Double calcula(String num1, String num2) {
        return toNumber(num1) - toNumber(num2);
    }
}
