package com.agibank.metodo.e6;

public class Main {
    public static void main(String[] args) {
        double[] retornos = {0.01, 0.02, -0.1, 0.03, -0.02};
        double volatilidade = calcularVolatilidade(retornos);
        System.out.println("Volatilidade: " + volatilidade);
    }
    public static double calcularVolatilidade(double[] retornos){
        double soma = 0;
        for (int i = 0; i < retornos.length; i++){
            soma += retornos[i];
        }
        double somaQuadrado = 0;
        double media = soma / retornos.length;
        for (int j = i + 1; j < retornos.length; j++){
            somaQuadrado += Math.pow(retornos[i] - media, 2);
        }
        double variancia = somaQuadrado / retornos.length;
        double desvioPadrao = media * variancia;
        return desvioPadrao;
    }
}
