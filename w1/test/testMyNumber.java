package aco.w1.test;

import aco.w1.HW.MyNumber;

public class testMyNumber {

    public static void main(String[] args) {
        MyNumber number1 = new MyNumber(1);
        MyNumber number2 = new MyNumber(2);

        MyNumber res1 = number1.add(number2);
        MyNumber res2 = number1.takeAway(number2);
    }
}
