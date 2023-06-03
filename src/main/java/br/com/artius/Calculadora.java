package br.com.artius;

import br.com.artius.operacao.*;

import java.util.HashMap;
import java.util.Map;

public class Calculadora {

    private final Map<String, Operacao> operacoes;

    public Calculadora() {
        this.operacoes = new HashMap<>();
        this.adicionaOperacoes();
    }

    public void adicionaOperacoes() {
        this.operacoes.put("+", new Adicao());
        this.operacoes.put("-", new Subtracao());
        this.operacoes.put("*", new Multiplicacao());
        this.operacoes.put("/", new Divisao());
    }

    private Operacao getOperacao(final String operacao) {
        final Operacao op = this.operacoes.get(operacao);
        if (op == null)
            throw new RuntimeException("Está operação não existe");
        return op;
    }

    public Double calcula(final String operacao, final String num1, final String num2) {
        return getOperacao(operacao).calcula(num1, num2);
    }
}
