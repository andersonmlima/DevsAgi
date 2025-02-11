package com.agibank.estruturasCondicionais.atividadeForWhile.e3;
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para X");
        int x = sc.nextInt();
        System.out.println("Digite um numero para Y");
        int y = sc.nextInt();

        int result = 1;

        for (int i = 1; i < y; i++){
            result *= x;
        }
        System.out.println(x + " elevado a " + y + " é " + result);
        sc.close();
    }
}
