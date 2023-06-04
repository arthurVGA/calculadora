package br.com.artius.controller;

import br.com.artius.operacao.Operacao;
import br.com.artius.operacao.Simbolo;

import java.util.HashMap;
import java.util.Map;

public class Calculadora {
    private final Map<Simbolo, Operacao> operacoes;

    public Calculadora() {
        operacoes = new HashMap<>();
        operacoes.put(Simbolo.SOMAR, this::somar);
        operacoes.put(Simbolo.SUBTRAIR, this::subtrair);
        operacoes.put(Simbolo.MULTIPLICAR, this::multiplicar);
        operacoes.put(Simbolo.DIVIDIR, this::dividir);
    }

    public Double somar(final Double primeiroNum, final Double segundoNum) {
        return primeiroNum + segundoNum;
    }
    public Double subtrair(final Double primeiroNum, final Double segundoNum) {
        return primeiroNum - segundoNum;
    }
    public Double multiplicar(final Double primeiroNum, final Double segundoNum) {
        return primeiroNum * segundoNum;
    }
    public Double dividir(final Double primeiroNum, final Double segundoNum) {
        return primeiroNum / segundoNum;
    }

    public Double getOperacao(Simbolo operacao, final Double d1, final Double d2) {
        return operacoes.get(operacao).calcular(d1, d2);
    }

}
