package br.com.bradesco.sintaxebasica.exercicios;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        double heigh = 0;
        double weight = 0;
        var scanner = new Scanner(System.in);

        System.out.println("Bem vindos ao Calculador de IMC\n");
        System.out.println("Informe sua Altura");
        heigh = scanner.nextDouble();
        System.out.println("Informe seu Peso");
        weight = scanner.nextDouble();

        //double imc = weight / Math.pow(heigh, 2);
        double imc = weight / (heigh * heigh);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Morbida)");
        }
    }
}
