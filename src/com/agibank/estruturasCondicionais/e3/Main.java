package com.agibank.estruturasCondicionais.e3;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double peso, altura, imc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        peso = sc.nextDouble();
        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();
        sc.close();

        imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("O status do atleta segundo IMC é: Abaixo do peso");
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("O status do atleta segundo IMC é: Peso normal");
        }else if (imc >= 25 && imc <= 30){
            System.out.println("O status do atleta segundo IMC é: Sobrepeso");
        }else{
            System.out.println("O status do atleta segundo IMC é: Obesidade");
        }
    }
}
