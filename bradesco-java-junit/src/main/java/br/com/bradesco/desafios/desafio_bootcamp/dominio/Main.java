package br.com.bradesco.desafios.desafio_bootcamp.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descricao do Curso de Java");
        curso1.setCargaHoraria(240);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Descricao do Curso de Python");
        curso2.setCargaHoraria(120);


        //Mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria sobre Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Python");
        mentoria2.setDescricao("Mentoria sobre Python");
        mentoria2.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
