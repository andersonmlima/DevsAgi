package com.agibank.teste;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma opção do menu: ");
        System.out.println("1 - Calcular imposto");
        System.out.println("2 - Depositar salário");
        System.out.println("3 - Sair");
        int opcao = sc.nextInt();

        int cont = 0;
        while (cont != opcao) {
            cont++;
            switch (opcao) {
                case 1:
                    System.out.println("Vamos Calcular seu imposto");
                    break;
                case 2:
                    System.out.println("Deposite seu salário aqui:");
                    break;
                default:
                    System.out.println("Menu encerrado!");
                    break;
            }
        }
    }
}
