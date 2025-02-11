package com.agibank.estruturasCondicionais.e1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        sc.close();

        if (numero < 0){
            System.out.println("Este número é negativo!");
        } else {
            System.out.println("Este número é positivo!");
        }
    }
}
