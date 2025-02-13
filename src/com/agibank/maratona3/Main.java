package com.agibank.maratona3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade atual: ");
        int idade = sc.nextInt();

        System.out.print("Idade desejada para aposentadoria: ");
        int anosAposentadoria = sc.nextInt();
        int n = (anosAposentadoria - idade) * 12;

        System.out.print("Contribuição mensal: ");
        double p = sc.nextDouble();

        double r;
        System.out.print("Taxa de juros anual esperada (Problema 1): ");
        r = (sc.nextDouble() / 100) / 12;

        double s;
        s = p;
        int i =0;


        double[] saldo = new double[(n / 12) + 1];




        for (int t = 0; t <= n; t += 12) {




            s = p * (Math.pow((1 + r), t) - 1) / r;




            saldo[i] = s;
            double arrayPrint = s;




            i += 1;




            //Aqui, imprime os valores extraídos e formatados do array.
            System.out.printf("Ano %d: R$ %.2f\n", t / 12, arrayPrint);
        }


        double[] taxasDeJuros = new double[3];


        for (i = 0; i < taxasDeJuros.length; i++) {
            System.out.print("Taxa de juros anual esperada " + (i + 1) + ": ");
            taxasDeJuros[i] = (sc.nextDouble() / 100) / 12;
        }


        double[][] matriz = new double[taxasDeJuros.length][anosAposentadoria - idade + 1];


        for (i = 0; i < taxasDeJuros.length; i++) {
            r = taxasDeJuros[i];
            for (int j = 0; j <= n; j += 12) {
                s = p * (Math.pow((1 + r), j) - 1) / r;
                matriz[i][j / 12] = s;
            }
        }


        for (i = 0; i < matriz.length; i++) {
            System.out.print("Taxa de juros " + (i + 1) + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format("R$%.2f ", matriz[i][j]));
            }
            System.out.println();
        }


        int exp_vida = 85;
        double[] ret_mensal = new double[3];
        double taxa = 0;


        int m = (exp_vida - anosAposentadoria);


        System.out.print("Renda mensal estimada para " + m + " anos de aposentadoria:\n");
        for (i = 0; i < 3; i++) {
            // A última coluna da matriz para cada taxa de juros é a última linha de cada vetor (matriz[i][matriz[i].length - 1])
            double saldoFinal = matriz[i][matriz[i].length - 1];
            // Calculando o valor da renda mensal
            ret_mensal[i] = saldoFinal * taxasDeJuros[i] / (1 - Math.pow(1 + taxasDeJuros[i], -m * 12));
            System.out.print("Com taxa de " + taxasDeJuros[i]*12 * 100 + "%: R$ " + String.format("%.2f", ret_mensal[i]) + "\n");
        }
    }
}