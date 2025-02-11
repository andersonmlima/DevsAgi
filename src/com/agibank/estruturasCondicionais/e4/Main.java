package com.agibank.estruturasCondicionais.e4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        float valor, media, dist, porc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        valor=sc.nextFloat();
        System.out.println("Digite uma média");
        media=sc.nextFloat();

        dist=Math.abs(valor-media);
        porc=(dist/media)*100;

        System.out.printf("A aproximação da média é %.2f%%", porc);
    }
}

