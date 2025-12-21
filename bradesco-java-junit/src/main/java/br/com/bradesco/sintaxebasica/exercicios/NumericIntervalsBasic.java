package br.com.bradesco.sintaxebasica.exercicios;

import java.util.Scanner;

public class NumericIntervalsBasic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne;
        int numberTwo;
        boolean showEven; // Variavel que define se e true (par) ou se false (impar)

        // Validacao de Entrada
        System.out.print("Digite o primeiro numero inteiro: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada invalida.");
            return;
        }
        numberOne = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro (maior que o primeiro): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada invalida.");
            return;
        }
        numberTwo = scanner.nextInt();

        if (numberTwo <= numberOne) {
            System.out.println("Erro: o segundo numero deve ser maior que o primeiro.");
            return;
        }

        // Opcao de Exibicao
        System.out.print("O que voce quer que eu exiba? (P)ares ou (I)mpares? ");
        String option = scanner.next();

        if (option.equalsIgnoreCase("P")) {
            showEven = true;
        } else if (option.equalsIgnoreCase("I")) {
            showEven = false;
        } else {
            System.out.println("Opcao invalida.");
            return;
        }

        for (int i = numberTwo; i >= numberOne; i--) {
            if ((i % 2 == 0) == showEven) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
