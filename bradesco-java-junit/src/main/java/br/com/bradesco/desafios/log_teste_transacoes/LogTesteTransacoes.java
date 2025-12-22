package br.com.bradesco.desafios.log_teste_transacoes;

import java.util.Scanner;

public class LogTesteTransacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String acaoTestada = sc.nextLine();
        String resultadoEsperado = sc.nextLine();

        // TODO: Crie uma string log que concatene os valores recebidos em um formato organizado:
        String log = "Teste: " + acaoTestada + " | Resultado: " + resultadoEsperado;
        sc.close();
        System.out.println(log);
    }
}