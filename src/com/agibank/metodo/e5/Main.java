package com.agibank.metodo.e5;

public class Main {
    public static void main(String[] args) {
        double ativo1 = 5.0;
        double ativo2 = 4.5;
        String maiorAtivo = comprarAtivos(ativo1, ativo2);
        System.out.println("O ativo com maior retorno é: " + maiorAtivo);
    }

    public static String comprarAtivos(double ativo1, double ativo2) {
        if (ativo1 > ativo2) {
            return "Ativo 1";
        } else {
            return "Ativo 2";
        }
    }
}
