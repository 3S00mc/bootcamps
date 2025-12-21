package br.com.bradesco.teoria;

public class Records {
    public static void main(String[] args) {
        var person = new Person("João", 25);
        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(person.gerInfo());

        System.out.println(Person.class + "\n");

//        var nome = person.name();
//        nome = "Maria";
//        System.out.println(person.name());
//        System.out.println(nome);

        var person2 = new Person("Pedro", 31);
        System.out.println(person2);
        System.out.println(person2.name());
        System.out.println(person2.age());
        System.out.println(person2.gerInfo());



    }
}
