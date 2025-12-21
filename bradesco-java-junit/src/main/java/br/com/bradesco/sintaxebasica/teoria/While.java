package br.com.bradesco.sintaxebasica.teoria;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var name = "";

        while (!name.equals("exit")) {
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();
            System.out.println(name);
        }

        while (true) {
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            System.out.println(name);
        }

        do {
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();
        } while (!name.equalsIgnoreCase("exit"));
    }
}