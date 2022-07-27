package aco.w1.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.BinaryOperator;

public class Human  implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(contacts, human.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, contacts);
    }
}
