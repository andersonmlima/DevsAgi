package com.agibank.metodo.e3;

public class Main {
    public static void main(String[] args) {
        double crescimento = calcularCrescimento(100.0, 105.0);
        System.out.printf("A variação percentual foi de: %.1f%%%n", crescimento);
    }
    public static double calcularCrescimento(double dia1, double dia2){
        return ((dia2 - dia1) * 100) / 100;
    }
}
