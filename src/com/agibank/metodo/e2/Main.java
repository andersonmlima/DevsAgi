package com.agibank.metodo.e2;

public class Main {
    public static void main(String[] args) {
        double montanteFinal = calcularJurosSimples( 1000.0, 50.0, 3);
        System.out.printf("O montante final é: %.2f", montanteFinal);
    }

    public static double calcularJurosSimples(double capital, double taxa, int anos){
        return capital + ((taxa * 100) / 100) * anos;
    }
}
