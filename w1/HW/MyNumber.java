package aco.w1.HW;

public class MyNumber {
   private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public MyNumber add (MyNumber otherValue){
        return new MyNumber (this.value + otherValue.value);
    }

    public MyNumber takeAway (MyNumber otherValue){
        return new MyNumber (this.value - otherValue.value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
