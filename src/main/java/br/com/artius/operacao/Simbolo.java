package br.com.artius.operacao;

public enum Simbolo {
    SOMAR('+'), SUBTRAIR('-'), MULTIPLICAR('*'), DIVIDIR('/');
    public final char sinal;
    Simbolo(char sinal) {
        this.sinal = sinal;
    }

    public char sinal() {
        return sinal;
    }

    public static Simbolo valueOf(char sinal) {
        for (Simbolo simbolo : values()) {
            if (simbolo.sinal() == sinal)
                return simbolo;
        }
        return null;
    }

}
