package br.com.bradesco.sintaxebasica.teoria;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Digite um option entre 1 e 7: ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        String message = switch (option) {
            case 1, 7 -> {
                String weekend = option == 1 ? "Domingo" : "Sábado";
                yield String.format("%s - Final de Semana", weekend); // yield e a palavra reservada para representar uma saida ou retorno. Ja que a primeira linha e a condicao
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Inválido";
        };
        System.out.println(message);
    }
}