package aco.w5.iterator.data_str;

import java.util.Iterator;

public class TestDataStr {
    public static void main(String[] args) {
        IQueue <Integer> queue = new ArrayQueue();
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);

        Iterator <Integer> myIter = queue.iterator();
        while (myIter.hasNext()){
            Integer res = myIter.next();
            System.out.println(res);
        }
    }
}
