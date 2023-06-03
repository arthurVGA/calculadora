package br.com.artius.operacao;

import java.util.regex.Pattern;

public abstract class Operacao {
    public abstract Double calcula(final String num1, final String num2);

    public Double toNumber(String number) {
        final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        if (number == null)
            throw new RuntimeException("Número não informado");
        if (number.isBlank() || number.isEmpty() || !pattern.matcher(number).matches())
            throw new RuntimeException("Número inválido");
        return Double.parseDouble(number);
    }
}
