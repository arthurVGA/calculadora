package br.com.artius;

public class Calculadora {

    public Double somar(Double d1, Double d2) {
        return d1 + d2;
    }
    public Double subtrair(Double d1, Double d2) {
        return d1 - d2;
    }
    public Double multiplicar(Double d1, Double d2) {
        return d1 * d2;
    }
    public Double dividir(Double d1, Double d2) {
        return d1 / d2;
    }
    public Double potencia(Double d1, Double d2) {
        return Math.pow(d1, d2);
    }
    public Double raiz(Double d1, Double d2) {
        return Math.pow(d1, 1/d2);
    }
    public Double raizQuadrada(Double d) {
        return Math.sqrt(d);
    }
    public Double fatorial(Double d) {
        double resposta = 1.0;
        for(double count = d; count >= 1; count--)
            resposta = resposta * count;

        return resposta;
    }
}
