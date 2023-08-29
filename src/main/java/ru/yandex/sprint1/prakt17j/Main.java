package ru.yandex.sprint1.prakt17j;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Семён", "Горбунков", 38);

        employee.sayHello();

        /*String[] words1 = {"яя", "ввв",""};
        Words words = new Words(words1);
        System.out.println(words.getShortestWordLength1());*/

        Words words2 = new Words(new String[] {"zzz","я","яя","яяя"});
        int shortestWordLength = words2.getShortestWordLength();
        System.out.println(shortestWordLength);


    }
}
