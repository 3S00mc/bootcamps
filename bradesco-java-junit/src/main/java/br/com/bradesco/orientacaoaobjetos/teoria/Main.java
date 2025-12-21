package br.com.bradesco.orientacaoaobjetos.teoria;

public class Main {
    public static void main(String[] args) {

        // Employee
//        printEmployee(new Manager());
//        printEmployee(new Salesman());

        // MusicPlayer
        var music = new MusicPlayer() {
            @Override
            public void play() {
                System.out.println("Playing music");
            }

            @Override
            public void stop() {

            }
        };
        music.play();
    }

    public static void printEmployee(Employee employee) {
        // Employee
        if (employee instanceof Salesman) {
            System.out.printf("---%s----\n", employee.getClass().getCanonicalName());
            employee.setName("Instance of Salesman");
            System.out.println(employee.getName() + "\n");
        }
//        else if (employee instanceof Manager manager) {
//            // Manager
//            System.out.printf("----%s----\n", manager.getClass().getCanonicalName());
//            manager.setName("Manager Name");
//            manager.setLogin("admin");
//            System.out.println(manager.getName());
//            System.out.println(manager.getLogin());
//        }
        switch (employee){
            case Manager manager -> {
                // Employee
                employee.setCode("123");
                employee.setName("Employee Manager Switch");
                employee.setSalary(2000.0);
                ((Manager) employee).setLogin("employee");
                System.out.println(employee.getName());
                System.out.println(employee.getCode());
                System.out.println(employee.getSalary());

                // Manager
                manager.setName("Manager Switch");
                manager.setLogin("admin");
                manager.setComission(0.15);
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getComission());
            }
            case Salesman salesman -> {
                salesman.setName("Salesman Name");
                salesman.setCode("456");
                salesman.setSalary(3000.0);
                salesman.setPercentPerSold(0.10);

                System.out.println(salesman.getName());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
            }
//            default -> throw new IllegalStateException("Unexpected value: " + employee);
            /* como a classe e selada, e todas as opcoes de heranca estao marcadas, o java entende que ja contemplamos todas as opcoes
            * usamos todas as classes possiveis, e nao ha nada fora disso (manager e salesman)
             */
        }
    }


}