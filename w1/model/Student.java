package aco.w1.model;

public class Student extends Human implements IBio, Comparable<Student> {

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
                "name=" + super.getName() +
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
}
