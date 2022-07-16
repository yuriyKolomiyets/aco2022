package aco.w1.model;

import java.util.ArrayList;

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


    public void addStudent(Student student){
        students.add(student);
    }

    public void insertStudent(Student student, int indexPosition){
        students.add(indexPosition, student);
    }

    public ArrayList<Student> filterByName(String name){
        ArrayList <Student> studentsFiltered = new ArrayList<>();

        for (Student searchSt : students) {
            if (searchSt.getName().equals(name)) {
                studentsFiltered.add(searchSt);
            }
        }
        return studentsFiltered;
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


}