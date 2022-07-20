package aco.w1.test;

import aco.w1.model.Contacts;
import aco.w1.model.Group;
import aco.w1.model.Student;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) throws Exception {


        Group group1 = new Group();


        Student s2 = new Student ("Oleg", 23, new Contacts("gg", "ert", 22), 790);
        Student s3 = new Student ("Oleg", 23, new Contacts("gg", "ert", 22), 790);
        Student s4 = new Student ("Oleg2", 23, new Contacts("gg", "ert", 22), 790);
        Student s5 = new Student ("Mykola", 23, new Contacts("gg", "ert", 22), 790);


        group1.addStudent(s2);
        group1.addStudent(s3);
        group1.addStudent(s4);


        System.out.println(group1.size() + "group size");
        System.out.println(s3.getId() + "s3 get id");

        System.out.printf("name %s + age %d + id %d", s2.getName(), s2.getAge(), s2.getId());

        System.out.println(group1 + "tostring");

        Student student2 = group1.removeLastStudent();
        System.out.println(student2);

        System.out.println(group1.toString());

        group1.insertStudent(s5,0);

        System.out.println(group1.toString());

        group1.work();

        List<Student> filtered = group1.filterByName("Oleg");
        System.out.println(filtered + "new test");


        Group group2 = new Group();


        Student g2s2 = new Student ("Oleg", 23, new Contacts("gg", "ert", 22), 790);
        Student g2s3 = new Student ("Oleg", 23, new Contacts("gg", "ert", 22), 790);
        Student g2s4 = new Student ("Oleg2", 23, new Contacts("gg", "ert", 22), 790);
        Student g2s5 = new Student ("Mykola", 23, new Contacts("gg", "ert", 22), 790);

        group2.addStudent(g2s4);
        group2.addStudent(g2s2);
        group2.addStudent(g2s5);
        group2.addStudent(g2s3);



        System.out.println(group2);

        group2.sort();

        System.out.println(group2);

    }

}
