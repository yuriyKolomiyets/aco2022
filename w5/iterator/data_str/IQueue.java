package aco.w5.iterator.data_str;

import javax.naming.SizeLimitExceededException;
import java.util.Iterator;

public interface IQueue <T> extends Iterable <T> {

    void enqueue (T t) throws SizeLimitExceededException;
    Object dequeue();


}
