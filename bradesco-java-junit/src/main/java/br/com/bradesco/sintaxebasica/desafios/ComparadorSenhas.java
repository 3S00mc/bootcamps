package br.com.bradesco.sintaxebasica.desafios;

import java.util.Scanner;

public class ComparadorSenhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaDigitada = sc.nextLine();
        String senhaConfirmada = sc.nextLine();

        // TODO: Implemente a estrutura condicional que compara as duas strings:
        if (senhaDigitada.equals(senhaConfirmada)) {
            System.out.println("Senha valida");
        } else {
            System.out.println("Senhas nao conferem");
        }
        sc.close();
    }
}