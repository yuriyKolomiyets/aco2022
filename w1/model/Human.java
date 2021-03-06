package aco.w1.model;

import java.util.function.BinaryOperator;

public class Human  {
    private String name;
    private int age;

    private Contacts contacts;

    public Human() {
    }

    public Human(String name, int age, Contacts contacts) {
        this.name = name;
        this.age = age;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contacts=" + contacts +
                '}';
    }
}
