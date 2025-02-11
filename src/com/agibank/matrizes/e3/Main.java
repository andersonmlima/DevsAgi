package com.agibank.matrizes.e3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print("Segue a tabela da matriz: ");
        for (int l = 0; l < 3; l++) {
            System.out.println();
            for (int c = 0; c < 3; c++) {
                System.out.printf(numbers[l][c] + " ");
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite um número para validar na matriz:");
        int numTarget = sc.nextInt();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] == numTarget) {
                    System.out.println("Número encontrado, na linha: " + (i + 1) + " e na coluna: " + (j + 1));
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Número não encontrado na matriz!");
        }
    }
}