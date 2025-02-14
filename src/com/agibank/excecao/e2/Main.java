package com.agibank.excecao.e2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];

        System.out.println("Digite os valores da ação nos ultimos 10 dias:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Dia " + (i + 1) + ": ");
                try {
                    precos[i] = sc.nextDouble();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido, digite um número.");
                }
            }
        }
        System.out.println("Média móvel de 3 dias:");
        for (int i = 0; i <= 7; i++) {
            double media = (precos[i] + precos[i + 1] + precos[i + 2])/3;
            System.out.println("A média dos dias " + (i + 1) + " a " + (i + 3) + ": " + media);
        }
        sc.close();
    }
}
