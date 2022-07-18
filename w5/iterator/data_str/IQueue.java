package aco.w5.iterator.data_str;

import java.util.Iterator;

public interface IQueue {

    void enqueue (Object obj);
    Object dequeue();

    Iterator createIterator();
}
