package com.mycompany.chattapp;

import java.util.Scanner;

public class ChattApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter number: ");
        String number = scanner.nextLine();

        NewLogin newLogin = new NewLogin(username, password, number);
        System.out.println(newLogin.registerUser());

        System.out.println("Confirm username: ");
        String confirmUsername = scanner.nextLine();
        System.out.println("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        System.out.println("Confirm number: ");
        String confirmNumber = scanner.nextLine();

        boolean status = newLogin.loginUser(confirmUsername, confirmPassword, confirmNumber);
        System.out.println(newLogin.LoginStatus(status));

    }
}
