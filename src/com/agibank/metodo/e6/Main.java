package com.agibank.metodo.e6;

public class Main {
    public static void main(String[] args) {
        double[] retornos = {0.01, 0.02, -0.1, 0.03, -0.02};
        double volatilidade = calcularVolatilidade(retornos);
        System.out.println("Volatilidade: " + volatilidade);
    }

    public static double calcularVolatilidade(double[] retornos) {
        double soma = 0;
        double somaQuadrado = 0;
        for (int i = 0; i < retornos.length; i++) {
            soma += retornos[i];
            somaQuadrado += Math.pow(retornos[i] - calcularMedia(retornos), 2);
        }
        double variancia = somaQuadrado / retornos.length;
        double desvioPadrao = Math.sqrt(variancia);
        return desvioPadrao;
    }

    public static double calcularMedia(double[] mediaVolatilidade) {
        double soma = 0;
        for (int i = 0; i < mediaVolatilidade.length; i++) {
            soma += mediaVolatilidade[i];
        }
        double media = soma / mediaVolatilidade.length;
        return media;
    }
}
