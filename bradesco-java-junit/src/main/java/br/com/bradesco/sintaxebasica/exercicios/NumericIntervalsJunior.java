package br.com.bradesco.sintaxebasica.exercicios;

import java.util.Scanner;

public class NumericIntervalsJunior {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer inicio = lerInteiro(sc, "Digite o primeiro numero inteiro: ");
        Integer fim = lerInteiro(sc, "Digite o segundo numero inteiro (maior que o primeiro): ");

        if (inicio == null || fim == null) {
            System.out.println("Entrada invalida. Encerrando o programa.");
            return;
        }

        if (inicio >= fim) {
            System.out.println("Erro: o primeiro numero deve ser menor que o segundo.");
            return;
        }

        boolean mostrarPares = lerParidade(sc);

        System.out.println("Resultado:");

        int primeiro = inicio + 1;
        if (mostrarPares && primeiro % 2 != 0) {
            primeiro++;
        }
        if (!mostrarPares && primeiro % 2 == 0) {
            primeiro++;
        }

        for (int i = primeiro; i < fim; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }

    private static Integer lerInteiro(Scanner sc, String mensagem) {
        System.out.print(mensagem);

        if (!sc.hasNextInt()) {
            return null;
        }
        return sc.nextInt();
    }

    private static boolean lerParidade(Scanner sc) {
        System.out.print("Mostrar pares (true) ou impares (false): ");

        if (!sc.hasNextBoolean()) {
            System.out.println("Valor invalido. Usando impares como padrao.");
            return false;
        }
        return sc.nextBoolean();
    }
}
