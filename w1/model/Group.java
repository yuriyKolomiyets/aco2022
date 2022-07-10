package aco.w1.model;

public class Group {
    private static int groupIdCount = 0;
    private int groupId;
    private int freePlace = 0;
    private Student [] students = new Student[24];

    {
        groupIdCount++;
        this.groupId = groupIdCount;
    }
    public Group() {
        this.students = students;

    }

    public Group(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students[freePlace] = student;
        freePlace++;
    }

    public static int getGroupIdCount() {
        return groupIdCount;
    }

    public int getFreePlace() {
        return freePlace;
    }

    public void printInfo() {
        for (int i = 0; i < freePlace; i++) {

            System.out.println("group Id " + groupId + "stud id " + students[i].getId() +  students[i].getAge() + students[i].getName() );

        }
    }
}
