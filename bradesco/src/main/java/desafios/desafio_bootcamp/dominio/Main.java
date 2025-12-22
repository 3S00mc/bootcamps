package desafios.desafio_bootcamp.dominio;

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

        //Bootcamps
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Python Developer");
        bootcamp2.setDescricao("Bootcamp de Python Developer");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria2);

        //Devs
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("--- dois mil anos depois ---");
        System.out.println("Conteudos inscritos:" + devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluídos" + devPedro.getConteudosConcluidos());
        System.out.println("Total de XP: " + devPedro.calcularTotalXp());

        System.out.println("-------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp2);
        System.out.println("Conteudos inscritos:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("--- dois mil anos depois ---");
        System.out.println("Conteudos inscritos:" + devMaria.getConteudosInscritos());
        System.out.println("Conteudos concluídos" + devMaria.getConteudosConcluidos());
        System.out.println("Total de XP: " + devMaria.calcularTotalXp());

//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);
    }
}
