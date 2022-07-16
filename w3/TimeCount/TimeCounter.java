package aco.w3.TimeCount;

public class TimeCounter {

    public static String countActionTime(ITimeAcction action){
        long start = System.nanoTime();
        action.callAction();
        long fin = System.nanoTime();
        return "nanos " + (fin - start);
    }
}
