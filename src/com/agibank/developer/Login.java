package com.agibank.developer;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        final String username = "admin";
        final String password = "password";
        boolean autenticate = true;
        Scanner sc = new Scanner(System.in);

        while (autenticate) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
            if (user.equals(username) && pass.equals(password)) {
                System.out.println("Authentication successful");
                autenticate = false;
            } else {
                System.out.println("Authentication failed");
            }
        }
        System.out.println("Goodbye!");
    }
}
