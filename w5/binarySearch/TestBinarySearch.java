package aco.w5.binarySearch;

import static aco.w5.binarySearch.BinarySearch.find;

public class TestBinarySearch {

    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5,6,7,8,9,10};
        int res = BinarySearch.find(mas,6);
        System.out.println(res == 5);

        int res1 = BinarySearch.find(mas,1);
        System.out.println(res1 == 0);

        int[] mas2 = {1,2,3,4,5,6,7,8,9,10,11,23,234,345,346,555,565,678,789,790};
        int res2 = BinarySearch.find(mas2,790);
        System.out.println(res2 == 19);

        int res3 = BinarySearch.find(mas2,700);
        System.out.println(res3 == -1);




    }



}
