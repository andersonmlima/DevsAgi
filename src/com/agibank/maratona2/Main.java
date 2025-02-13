// Anderson Moura - Desenvolvedor nota= 90.0
//Tester - Carollina Guedes
package com.agibank.maratona2;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double g = 9.8;
        double x, y; // posição
        double intervalo = 0.01; // intervalo

        System.out.println("Digite uma velocidade inicial (m/s): ");
        double V = sc.nextDouble();

        System.out.println("Digite um ângulo de inclinação inicial (graus): ");
        double zeroGraus = sc.nextDouble();
        double zero = Math.toRadians(zeroGraus);

        for (double t = 0.0; ; t += intervalo) { //"Faltou incrementar o t"  Tester - 10
            x = V * Math.cos(zero) * t;
            y = V * Math.sin(zero) * t - 0.5 * g * t * t;

            System.out.printf("t = %.2f s, x = %.2f m, y = %.2f m%n", t, x, y);

            if (y < 0) {
                break;
            }
        }
        sc.close();
    }
}