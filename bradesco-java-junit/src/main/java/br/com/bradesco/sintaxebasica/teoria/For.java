package br.com.bradesco.sintaxebasica.teoria;

public class For {
    public static void main(String[] args) {

        // for com break
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) break;
        }
        System.out.println("\n\n");

        // Imprimindo os impares
        for (int i = 0; i < 10; i++) {
            if (i % 2 ==0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Fim do programa\n");

        // Imprimindo as frutas passadas em argumento Run do programa
        for (String fruit : args) {
            System.out.println(fruit);
        }

        System.out.println("\n");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
