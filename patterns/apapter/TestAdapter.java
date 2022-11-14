package aco.patterns.apapter;

public class TestAdapter {

    public static void main(String[] args) {
        PoliceMan policeMan = new PoliceManAdapter(new Militioner());
        PoliceMan policeMan1 = new PoliceMan();

        PoliceDepartment.accept(policeMan1);
        PoliceDepartment.accept(policeMan);

    }
}
