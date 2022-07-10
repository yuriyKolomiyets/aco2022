package aco.w1.test;

import aco.w1.model.Contacts;
import aco.w1.model.Group;
import aco.w1.model.Student;

public class TestStudent {

    public static void main(String[] args) {


        Group group1 = new Group();


        Student s2 = new Student ("Oleg", 23, new Contacts("gg", "ert", 22));
        Student s3 = new Student ("Oleg2", 23, new Contacts("gg", "ert", 22));


        group1.addStudent(s2);
        group1.addStudent(s3);

        System.out.println(group1.getFreePlace());
        System.out.println(s3.getId());

       group1.printInfo();



    }

}
