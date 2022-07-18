package aco.w5.iterator.data_str;

import java.util.Iterator;

public class ArrayQueue implements IQueue{

    private Object[] mas = new Object[10];
    private int head;
    private int tail;
    private int size;

    @Override
    public void enqueue(Object obj) {
        if(size > mas.length) {
            System.out.println("exception");
        }
        if(size == 0){
            mas [tail] = obj;
            tail++;
        }
    }

    @Override
    public Object dequeue() {

        if(size == 0) {
            System.out.println("exception");
        }
        Object ret = mas[tail];
        head++;
        return ret;
    }

    @Override
    public Iterator createIterator() {
        return new MyArrayQueueIterator();
    }

   private class MyArrayQueueIterator implements Iterator{

        int curr = head;

       @Override
       public boolean hasNext() {
           return curr < tail;
       }

       @Override
       public Object next() {
           return mas[curr++];
       }
   }
}
