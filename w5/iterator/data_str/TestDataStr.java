package aco.w5.iterator.data_str;

import java.util.Iterator;

public class TestDataStr {
    public static void main(String[] args) {
        IQueue queue = new ArrayQueue();
        queue.enqueue(11);
        queue.enqueue("12");
        queue.enqueue(13);

        Iterator myIter = queue.createIterator();
        while (myIter.hasNext()){
            Object res = myIter.next();
            System.out.println(res);
        }
    }
}
