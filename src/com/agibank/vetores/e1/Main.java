package com.agibank.vetores.e1;

public class Main {
    public static void main(String[] args) {
        double[] price = {10.0, 9.0, 10.2, 10.3, 20.0, 7.0, 6.0, 20.5, 21.0, 40.0};
        int firstDay, lastDay;

        for (int i = 0; i < price.length - 2; i++) { // O length -2 é para o for ser encerrado 2 valores antes do fim do vetor.
            if (price[i] < price[i + 1] && price[i + 1] < price[i + 2]) {
                firstDay = i + 1;
                i = i + 2;
                while (price[i] < price[i + i]) {
                    i++;
                    if (i == price.length - 1) break;
                    lastDay = i + 1;
                    System.out.printf("Existe uma tendencia de alta nos dias %d e %d", firstDay, lastDay);
                    break;
                }
            }
        }
    }
}

