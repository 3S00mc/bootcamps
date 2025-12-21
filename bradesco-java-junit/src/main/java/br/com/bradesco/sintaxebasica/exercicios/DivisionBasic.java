/*
*  Escreva um codigo onde o usuario informe um numero inicial, e posteriormente ira informar outros N numeros, a
* execucao do codigo ira continuar ate que o numero informado dividido pelo primeiro numero tenha resto diferente de 0.
* Numeros menores que o primeiro numero serao ignorados.*
* */

package br.com.bradesco.sintaxebasica.exercicios;

import java.util.Scanner;

public class DivisionBasic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo = 0;

        System.out.println("Digite um numero inteiro positivo");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada invalida.");
            return;
        }
        numberOne = scanner.nextInt();

        if (numberOne <= 1) {
            System.out.println("Entrada invalida. Deve ser um numero inteiro positivo.");
            return;
        }

        do {
            System.out.println("Informe outro numero");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida. Deve ser um numero inteiro positivo.");
                return;
            }
            numberTwo = scanner.nextInt();

            if (numberTwo < numberOne) {
                System.out.println( "O numero informado deve ser maior que o primeiro.");
                continue;
            }
        } while (numberTwo % numberOne == 0);
    }
}
