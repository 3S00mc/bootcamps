package br.com.bradesco.teoria;

public record Person (String name, int age) {

    // Records e uma classe imutavel, tem seus atributos estaticos definidos como final,
    // e so e possivel editar no construtor.
    //Seu objetivo e trabalher com dados imutaveis.

//    public Person {
//        System.out.println("-----------------");
//        System.out.println(name + " tem " + age + " anos.");
//        System.out.println("-----------------");
//
//    }

    public String gerInfo() {
        return name + " tem " + age + " anos.";
    }
}
