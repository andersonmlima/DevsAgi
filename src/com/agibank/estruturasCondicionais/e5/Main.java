package com.agibank.estruturasCondicionais.e5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do Aluno:");
        nota = sc.nextDouble();
        sc.close();

        if (nota >= 6){
            System.out.println("Aprovado!");
        }else if (nota >= 4){
            System.out.println("Exame!");
        }else{
            System.out.println("Reprovado");
        }
    }

}
