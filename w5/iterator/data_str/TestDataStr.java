package aco.w5.iterator.data_str;

import javax.naming.SizeLimitExceededException;
import java.util.Iterator;

public class TestDataStr {
    public static void main(String[] args) throws SizeLimitExceededException {
        IQueue <Integer> queue = new ArrayQueue();
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);

        IQueue <Integer> queue1 = new ArrayQueue();
        queue1.dequeue();

        Iterator <Integer> myIter = queue.iterator();
        while (myIter.hasNext()){
            Integer res = myIter.next();
            System.out.println(res + "!!");
        }

        for (Integer curr:queue) {
            System.out.println(curr);
        }
    }
}
