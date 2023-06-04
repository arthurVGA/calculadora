package br.com.artius.operacao;

@FunctionalInterface
public interface Operacao {
    Double calcular(final Double d1, final Double d2);
}
