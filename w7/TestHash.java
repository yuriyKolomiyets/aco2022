package aco.w7;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestHash {
    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();

        Date birth = new Date();
        userSet.add(new User(1, 2000, "Ivan", birth));
        userSet.add(new User(1, 2000, "Ivan", birth));
        userSet.add(new User(1, 2000, "Ivan", birth));
        userSet.add(new User(1, 2000, "Ivan", birth));

        System.out.println(userSet.size());
    }
}

class User {

    private int id;
    private double salary;
    private String name;
    private Date birth;

    public User(int id, double salary, String name, Date birth) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + id; // >>
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        long temp = Double.doubleToLongBits(salary);
        hash = 31 * hash + (int)(temp ^ (temp >>> 32));
        hash = 31 * hash + (birth != null ? birth.hashCode() : 0);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(obj == null || User.class != obj.getClass()){
            return false;
        }

        User that = (User) obj;

        if(this.id != that.id){
            return false;
        }

        if(!(Objects.equals(this.name, that.name))){
            return false;
        }

        if(this.salary != that.salary){
            return false;
        }

        if(!(Objects.equals(birth, that.birth))){
            return false;
        }
        return true;
    }
}

class User2 {

    private int id;
    private double salary;
    private String name;
    private Date birth;

    public User2(int id, double salary, String name, Date birth) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.birth = birth;
    }

    @Override
    public int hashCode() {
        return id;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || User2.class != obj.getClass()) {
            return false;
        }
        User2 that = (User2) obj;
        return id == that.id;
    }
}
