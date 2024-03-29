package aco.w1.model;

import aco.w6.io.IOUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Group{
    private static int groupIdCount = 0;
    private int groupId;
    private ArrayList <Student> students = new ArrayList<>();

    {
        groupIdCount++;
        this.groupId = groupIdCount;
    }
    public Group() {
        this.students = students;

    }


    public void addStudent(Student student) throws Exception {
        if (student == null) {
            throw new Exception ("student is empty");
        }
        students.add(student);
    }

    public void insertStudent(Student student, int indexPosition) throws Exception {
        if (student == null) {
            throw new Exception ("student is empty");
        }

        students.add(indexPosition, student);
    }

    public List<Student> filterByName(String name) throws Exception {
        if (name == null) {
            throw new Exception ("no name mentioned");
        } return students.stream().filter(student -> student.getName().equals(name)).collect(Collectors.toList());
    }

    public Student removeLastStudent(){

        return students.remove(students.size()-1);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", students=" + students +
                '}';
    }

    public int size() {
        return students.size();
    }

    public void work() {
        for (int i = 0; i <students.size() ; i++) {
            students.get(i).work();
        }
    }

    public void sort() {
        students.sort(new StudentComparator());
    }

    public void saveToFile(String path) {
        for (Student student:students) {
            IOUtils.save(student, path);
        }
    }


}