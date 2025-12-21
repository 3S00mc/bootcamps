package br.com.bradesco.sintaxebasica.exercicios;

import java.util.Scanner;

public class NumericIntervals {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 0;
        String option = "";

        System.out.println("Digite um numero");
        numberOne = scanner.nextInt();

        System.out.println("Digite outro numero, maior que o primeiro");
        numberTwo = scanner.nextInt();

        //Validacao de Entrada
        if (numberTwo <= numberOne) {
            System.out.println("Erro: o segundo numero deve ser maior que o primeiro.");
            return;
        }

//        System.out.println("O que voce quer? (I)ntervalo ou (S)oma");
        System.out.println("O que voce quer que eu exiba? (P)ares ou (I)mpares?");
        option = scanner.next();

        if (option.equalsIgnoreCase("P")) {
            for (int i = numberTwo; i >= numberOne; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (option.equalsIgnoreCase("I")){
            for (int i = numberTwo; i >= numberOne; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Entrada Invalida");
            return;
        }
    }
}
