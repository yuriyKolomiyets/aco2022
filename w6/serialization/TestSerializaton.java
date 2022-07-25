package aco.w6.serialization;

import aco.w1.model.Contacts;
import aco.w1.model.Student;
import aco.w6.io.IOUtils;

public class TestSerializaton {

    public static void main(String[] args) {
        Student[] students = { new Student ("Oleg", 23, new Contacts("gg", "ert", 22), 790),
                new Student ("Oleg", 23, new Contacts("gg", "ert", 22), 790),
                new Student ("Oleg2", 23, new Contacts("gg", "ert", 22), 790),
                new Student ("Mykola", 23, new Contacts("gg", "ert", 22), 790)};

        Student st = students[0];
        String path = "src/group1.txt";

        IOUtils.saveObj(st, path);
        Student obj = IOUtils.loadObj(path);
        System.out.println(obj.toString());

    }
}
