package com.projecao.juros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite sua idade atual: ");
        int idadeAtual = sc.nextInt();

        System.out.print("Digite sua contribuição mensal: ");
        double contribuicaoMensal = sc.nextDouble();

        System.out.print("Digite a taxa de juros esperada (em decimal, ex: 0.05 para 5%): ");
        double taxaEsperada = sc.nextDouble();

        System.out.print("Digite a idade desejada para aposentadoria: ");
        int idadeAposentadoria = sc.nextInt();

        int anosDeContribuicao = idadeAposentadoria - idadeAtual;

        // Inicialização da matriz de cenários de taxa de juros
        double[] taxasDeJuros = {0.04, 0.06, 0.08}; // Diferentes cenários de taxa de juros
        double[][] matriz = new double[taxasDeJuros.length][anosDeContribuicao];

        // Cálculo dos saldos acumulados
        for (int i = 0; i < taxasDeJuros.length; i++) {
            double ri = taxasDeJuros[i];
            for (int j = 0; j < anosDeContribuicao; j++) {
                matriz[i][j] = contribuicaoMensal * (Math.pow((1 + ri), (j + 1) * 12) - 1) / ri;
            }
        }

        // Exibição da matriz
        for (int i = 0; i < taxasDeJuros.length; i++) {
            System.out.println("Cenário com taxa de juros de " + (taxasDeJuros[i] * 100) + "%:");
            for (int j = 0; j < anosDeContribuicao; j++) {
                System.out.printf("Ano %d: Saldo acumulado = %.2f\n", j + 1, matriz[i][j]);
            }
            System.out.println();
        }
    }
}
