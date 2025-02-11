package com.agibank.metodo.e1;

public class Main {
    public static void main(String[] args) {
        double valorConvertido = converterMoeda(100.0, 4.90);
        System.out.printf("O valor convertido para dolares americano é: %.2f" , valorConvertido);
    }

    public static double converterMoeda(double valorReais, double taxaConversao){
        return valorReais / taxaConversao;
    }
}
