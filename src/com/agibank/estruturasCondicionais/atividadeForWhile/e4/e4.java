package com.agibank.estruturasCondicionais.atividadeForWhile.e4;

import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo de fatorial:");
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        int fatorial = 1;

        //Caso o usuario digite um numero menor que zero.
        while (num < 0){
            System.out.println("Digite um numero positivo.");
            num = sc.nextInt();
        }

        for (int i = 1; i <= num; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial do numero " + num + " é: " + fatorial);
        sc.close();
    }
}
