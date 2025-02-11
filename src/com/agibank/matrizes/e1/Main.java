package com.agibank.matrizes.e1;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //for para imprimir a matriz em formato de tabela
        for (int i = 0; i < 3; i++) {
            //println para pular a linha após contar 3 numeros
            System.out.println();
            for (int j = 0; j < 3; j++) {
                //espaço em branco para separar os numeros
                System.out.printf(numbers[i][j] + " ");
            }
        }
    }
}