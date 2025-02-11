package com.agibank.matrizes.e2;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int sum = 0;
        int[] rowSum = {0,0,0,0};
        int[] colSum = {0,0,0,0};

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 1; j < 4; j++) {
                sum += numbers[i][j];
                rowSum[i] += numbers[i][j];
                colSum[j] += numbers[j][i];
            }
        }
        System.out.println("Alinhar a Matriz 4x4:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println("\nSoma de todos os elementos: " + sum);

        System.out.println("Soma dos elementos de cada linha:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + (i + 1) + ": " + rowSum[i]);
        }
        System.out.println("Soma dos elementos de cada coluna:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + colSum[j]);
        }
    }
}