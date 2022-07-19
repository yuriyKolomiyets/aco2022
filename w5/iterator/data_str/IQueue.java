package aco.w5.iterator.data_str;

import java.util.Iterator;

public interface IQueue <T> extends Iterable <T> {

    void enqueue (T t);
    Object dequeue();


}
