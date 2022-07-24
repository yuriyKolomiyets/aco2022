package aco.w6.builder;

public class TestBuilder {

    public static void main(String[] args) {
        ComplexObject.ComplexObjectBuilder builder = new ComplexObject.ComplexObjectBuilder();
        ComplexObject complexObject = builder.appendAge(34)
                .appendLocation("Kiev")
                .appendName("Oleg")
                .appendSalary(233.23)
                .build();



        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a").append(" ").append(" Kolia").append("").toString();
    }
}
