package ru.yandex.sprint1.prakt17j;

import java.util.Random;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Employee(String firstName, String lastName){
        this(firstName,lastName, 18);
    }

    void sayHello() {
        String greetings = "Привет, ";
        int randomInt = new Random().nextInt(3);

        System.out.println((randomInt == 0 ? greetings : "Hello, ") + firstName + " !");
    }

}
