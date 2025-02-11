package com.agibank.metodo.e4;

public class Main {
    public static void main(String[] args) {
        double[] preco = {100.0, 102.0, 101.0, 103.0, 105.0};
        int intervalo = 3;

        double[] mediaMovel = calcularMediaMovel(preco, intervalo);
        for (int i = 0; i < preco.length - (intervalo - 1); i++) {
            System.out.println(mediaMovel[i]);
        }
    }

    public static double[] calcularMediaMovel(double[] preco, int intervalo) {
        int tamanhoResultado = preco.length - intervalo + 1;
        double[] media = new double[tamanhoResultado];

        for (int i = 0; i < tamanhoResultado; i++) {
            double soma = 0.0;
            for (int j = i; j < i + intervalo; j++) {
                soma += preco[j];
                media[i] = soma / intervalo;
            }
        }
        return media;
    }
}
