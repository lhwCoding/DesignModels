package IteratorPattern;

/**
 * Created by smile on 2015/12/18.
 */
public interface InterIterator {
    //前移
    public Object previous();
    //后移
    public  Object next();
    public  boolean hasNext();
    //取得第一个元素
    public  Object first();
}
