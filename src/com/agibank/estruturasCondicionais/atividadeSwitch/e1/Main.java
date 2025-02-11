package com.agibank.estruturasCondicionais.atividadeSwitch.e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a opção de investimento:");
        System.out.println("Opção 1: CDB");
        System.out.println("Opção 2: CDI");
        System.out.println("opção 3: Tesouro direto");
        System.out.println("Opção 4: FII");

        opcao = sc.nextByte();

        switch (opcao) {
            case 1:
                System.out.println("CDB");
                break;
            case 2:
                System.out.println("CDI");
                break;
            case 3:
                System.out.println("Tesouro Direto");
                break;
            case 4:
                System.out.println("FII");
                break;
            default:
                System.out.println("Nenhuma opção selecionada.");
                break;
        }
    }
}
