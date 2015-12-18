package IteratorPattern;

/**
 * Created by smile on 2015/12/18.
 */
public class MyCollection implements InterCollection {
    private String string[]={"A","B","C","D","E"};
    @Override
    public InterIterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
