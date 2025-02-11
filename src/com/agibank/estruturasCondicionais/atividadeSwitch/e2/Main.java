package com.agibank.estruturasCondicionais.atividadeSwitch.e2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pode avaliar nosso atendimento? Selecione uma opção abaixo:");
        System.out.println("Opção 1: Atendimento muito ruim!");
        System.out.println("Opção 2: Atendimento ruim");
        System.out.println("opção 3: Atendimento regular");
        System.out.println("Opção 4: Atendimento bom");
        System.out.println("Opção 5: Atendimento muito bom");

        int avaliacao = sc.nextInt();

        switch (avaliacao) {
            case 1:
                System.out.println("Sentimos muito pelo atendimento muito ruim.");
                break;
            case 2:
                System.out.println("Sentimos muito pelo atendimento ruim.");
                break;
            case 3:
                System.out.println("Obrigado por avaliar");
                break;
            case 4:
                System.out.println("Que bom que conseguimos ajudar");
                break;
            case 5:
                System.out.println("Ótimo! esperamos manter a qualidade de atendimento.");
            default:
                System.out.println("Nenhuma opção selecionada.");
                break;
        }
    }
}
