package aco.w1.ArrayUtils;

public class ArrayUtils {
    public static String toString(int[] mas){
        String temp = "";

        // fori + Tab
        for (int i = 0; i < mas.length; i++) {
            temp += mas[i] + " ";
        }
        return temp;
    }

    public static void print1(int[] mas){
        System.out.println(toString(mas));
    }
    public static int indexOf(int[] target, int el){

        if(target == null){
            return -1;
        }

        for (int i = 0; i < target.length; i++) {
            if(target[i] == el) {
                return i;
            }
        }

        return -1;
    }

    public static int[] genRanMas(int size, int range) {

        int [] mas = new int[size];
        for (int s = 0; s < size; s++) {
            mas[s] = (int)(Math.random()*range);
        }
        return mas;
    }
}
