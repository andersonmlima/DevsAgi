package com.agibank.developer;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("A soma dos numeros é: " + soma(20, 20));
        System.out.println("A subtração dos números é: " + subtracao(15, 5));
    }
    public static int soma(int a, int b){
        return a + b;
    }
    public static int subtracao(int c, int d){
        return c - d;
    }
}
