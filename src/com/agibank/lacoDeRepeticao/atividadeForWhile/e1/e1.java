package com.agibank.lacoDeRepeticao.atividadeForWhile.e1;
import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para tabuada:");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
