package aco.w1.model;

import java.io.Serializable;
import java.util.Objects;

public class Student extends Human implements Serializable, IBio, Comparable<Student> {

    private static int idCount;
    private static double money;

    private int id;

    {
        idCount++;
        this.id = idCount;
    }

    public Student() {
    }

    public Student(String name, int age, Contacts contacts, int money) {
        super(name,age, contacts);
        this.money = money;
    }

    public String getName() {
        return super.getName();
    }
    public void setName(String name) {
        super.setName(name);
    }

    public int getAge() {
        return super.getAge();
    }

    public void setAge(int age) {
        super.setAge(age);
    }


    public void printInfo(){
        System.out.println(super.getAge() + super.getName() + "id" + id + super.getContacts().printInfo());
    }

    public static double getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "name=" + super.getName() + ", money=" + money + ", " + super.getContacts() +
                '}';
    }

    @Override
    public void work() {
        System.out.println("student # " + id + "is working" );
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
