package com.agibank.excecao.e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] saldos = {1000.0, 1300.0, 1500.0, 2500.0, 3000.0, 3100.0, 4200.0, 4400.0, 5000.0, 5100.0};

        System.out.print("Digite o qual conta deseja ver o saldo: ");
        int conta = scanner.nextInt();

        try {
            System.out.println("Saldo da conta: " + saldos[conta]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: conta não encontrada.");
        }
        scanner.close();
    }
}
