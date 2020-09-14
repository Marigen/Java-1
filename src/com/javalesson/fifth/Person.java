package com.javalesson.fifth;

public class Person {

    private String name;
    private String jobPosition;
    private String email;
    private String phoneNumber;
    private float salary;
    private int age;

    public Person(String name, String jobPosition, String email, String phoneNumber, float salary, int age) {
        this.name = name;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

        if (age >= 40){
            System.out.println("Personal file of " + name + ", " + age + " years old." +
                "\nJob position is '" + jobPosition + "' with salary - " + salary + " roubles per month." +
                "\nContacts: email - " + email + "," + "\nPh.num.: " + phoneNumber + ".");
        }
    }

    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231212", 30000, 30);
        personArray[1] = new Person("Lvov Lev", "Developer", "levdev@mailbox.com", "89231231213", 75000, 27);
        personArray[2] = new Person("Andreev Andrey", "HR", "andhr@mailbox.com", "89231231214", 45000, 31);
        personArray[3] = new Person("Antonov Anton", "CTO", "antoshka@mailbox.com", "89231231215", 75000, 41);
        personArray[4] = new Person("Mikhailov Mikhail", "CEO", "archimik@mailbox.com", "89231231216", 90000, 45);
        
    }

}
