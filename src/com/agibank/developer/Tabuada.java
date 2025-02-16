package com.agibank.developer;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 10:");
        int number = sc.nextInt();
        int cont = 0;

        while (cont <= 10) {
            int tabuada = number * cont; // Calcula a tabuada
            System.out.println("A tabuada desse número é: " + tabuada);
            cont++; // Incrementa o contador
        }
    }
}
