package br.com.bradesco.sintaxebasica.desafios;

import java.util.Scanner;

public class VerificadorCamposObrigatorios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        String cpf = sc.nextLine();
        String email = sc.nextLine();

        //TODO: Crie a estrutura condicional para verificar se algum dos campos está vazio:
        if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty()) {
            System.out.println("Cadastro incompleto");
        } else {
            System.out.println("Cadastro validado com sucesso!");
        }
            sc.close();
    }
}