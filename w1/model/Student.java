package aco.w1.model;

public class Student {

    private static int idCount;
    private static double money;

    private int id;
    private String name;
    private int age;

    private Contacts contacts;

    {
        idCount++;
        this.id = idCount;
    }

    public Student() {
    }

    public Student(String name, int age, Contacts contacts) {

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


    public void printInfo(){
        System.out.println(name + age + "id" + id + contacts.printInfo());
    }

    public static double getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }
}
