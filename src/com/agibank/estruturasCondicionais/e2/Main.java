package com.agibank.estruturasCondicionais.e2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        numero = sc.nextInt();
                System.out.println("Digite um numero:");

        if (numero % 2==0){
            System.out.println("Numero Par!");
        }else{
            System.out.println("Numero Impar!");
        }
    }
}
