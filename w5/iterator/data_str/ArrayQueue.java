package aco.w5.iterator.data_str;

import javax.naming.SizeLimitExceededException;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayQueue <T> implements IQueue <T>{

    private T[] mas = (T[]) new Object[10];
    private int head;
    private int tail;
    private int size;

    @Override
    public void enqueue(T t) throws SizeLimitExceededException {
        if(size > mas.length) {
            throw new SizeLimitExceededException("no free space");
        }
        if(size == 0){
            mas [tail] = t;
            tail++;
        }
    }

    @Override
    public T dequeue() {

        if(size == 0) {
            throw new NegativeArraySizeException("ArrayQueue is empty");
        }
        T ret = mas[tail];
        head++;
        return ret;
    }

    @Override
    public Iterator <T> iterator() {
        return new MyArrayQueueIterator();
    }

    @Override
    public void forEach(Consumer action) {
        IQueue.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return IQueue.super.spliterator();
    }

    private class MyArrayQueueIterator implements Iterator <T>{

        int curr = head;

       @Override
       public boolean hasNext() {
           return curr < tail;
       }

       @Override
       public T next() {
           return mas[curr++];
       }
   }
}
