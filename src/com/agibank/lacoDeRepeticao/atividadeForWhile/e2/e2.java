package com.agibank.lacoDeRepeticao.atividadeForWhile.e2;

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int soma = 0;
        int impar = 1;

        for (int i = 0; i < num; i++){
            soma += num;
            impar += 2;
            System.out.println("O quadrado de " + num + " é " + soma);
        }
        sc.close();
    }
}
