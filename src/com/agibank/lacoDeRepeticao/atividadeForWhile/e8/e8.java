package com.agibank.lacoDeRepeticao.atividadeForWhile.e8;

import java.util.Scanner;

public class e8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorDiv = 5000;
        float totalPag = 0;

        System.out.println("Digite o valor do pagamentodo mês 1: ");
        float valorPag = sc.nextFloat();
        totalPag += valorPag;

        while (totalPag > valorDiv){
            System.out.println("Digite o pagamento para o próximo mes: ");
            totalPag = sc.nextFloat();
            totalPag += totalPag;
        }
        if (totalPag >= valorDiv) {
            System.out.println("Você quitou sua dívida de 5000!");
        }
        sc.close();
    }
}
