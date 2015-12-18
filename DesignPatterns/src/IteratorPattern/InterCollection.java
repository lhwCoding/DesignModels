package IteratorPattern;

/**
 * Created by smile on 2015/12/18.
 */
public interface InterCollection {
    public  InterIterator iterator();
    //取得集合元素
    public  Object get(int i);
    //取得集合大小
    public  int size();
}
