package com.agibank.developer;

public class QuadradoInteiro {
    public static void main(String[] args) {
        // Inicializa a variável de controle
        int number = 15;

        // Enquanto i for menor ou igual a 200
        while (number <= 200) {
            int quadrado = number * number; // Calcula o quadrado de i
            System.out.println("O quadrado do número " + number + " é: " + quadrado); // Exibe o resultado
            number++; // Incrementa i para o próximo número
        }
    }
}
