package com.agibank.metodo.e5;

public class Main {
    public static void main(String[] args) {
        double ativo1 = 5.0;
        double ativo2 = 4.5;
        String maiorAtivo = comprarAtivos(5.0, 4.5);
        System.out.println(maiorAtivo);
    }
    public static String comprarAtivos(double ativo1, double ativo2){
        if (ativo1 > ativo2){
            return "O maior ativo é: ";
        } else {
            return "O maior ativo é: ";
        }
    }
}
