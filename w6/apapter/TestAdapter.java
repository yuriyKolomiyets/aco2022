package aco.w6.apapter;

public class TestAdapter {

    public static void main(String[] args) {
        PoliceDepartment.accept(new PoliceMan());
        PoliceDepartment.accept(new PoliceManAdapter(new Militioner()));
    }
}
