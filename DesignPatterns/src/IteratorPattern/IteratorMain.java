package IteratorPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/18.
 * 迭代子模式
 * 迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，如果对集合类比较熟悉的话，
 * 理解本模式会十分轻松。这句话包含两层意思：
 * 一是需要遍历的对象，即聚集对象，
 * 二是迭代器对象，用于对聚集对象进行遍历访问
 *
 * 这个思路和我们常用的一模一样，MyCollection中定义了集合的一些操作，
 * MyIterator中定义了一系列迭代操作，且持有Collection实例
 */
public class IteratorMain {
    public static void main(String[] args) {
        InterCollection collection = new MyCollection();
        InterIterator it=collection.iterator();
        while (it.hasNext()){
            Utils.showStr(it.next()+"");
        }
    }
}