package com.agibank.estruturasCondicionais.atividadeForWhile.e7;

import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float limiteGasto = 5000;
        float valorSoma = 0;
        int cont = 0;

        while (cont + valorSoma < limiteGasto) {
            System.out.println("Digite um valor de despesa: ");
            float valor = sc.nextFloat();
            if (valor < 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            valorSoma += valor;
            cont++;
            System.out.println("O valor da despesa é: " + valorSoma);
        }
        System.out.println("O valor de " + limiteGasto + " chegou ao limite!");
        sc.close();
    }
}
