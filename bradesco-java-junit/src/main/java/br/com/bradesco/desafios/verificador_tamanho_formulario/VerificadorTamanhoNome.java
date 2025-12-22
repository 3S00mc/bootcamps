package br.com.bradesco.desafios.verificador_tamanho_formulario;

import java.util.Scanner;

public class VerificadorTamanhoNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCompleto = sc.nextLine();

        //TODO: Implemente a estrutura condicional para verifica o tamanho do texto digitado:
        if (nomeCompleto.length() <= 30) {
            System.out.println("Entrada valida");
        }else{
            System.out.println("Nome muito longo");
        }

        sc.close();
    }
}