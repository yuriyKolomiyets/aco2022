package aco.w3.timeCount;

public class TimeCounter {

    private ITimeAction timeAction;

    public TimeCounter(ITimeAction timeAction) {
        this.timeAction = timeAction;
    }

    public void setTimeAction(ITimeAction timeAction) {
        this.timeAction = timeAction;
    }

    public String countActionTime(){
        long start = System.currentTimeMillis();
        timeAction.callAction();
        long end = System.currentTimeMillis();
        return "millis " + (end - start);
    }
}
