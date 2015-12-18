package IteratorPattern;

/**
 * Created by smile on 2015/12/18.
 */
public class MyIterator implements InterIterator {
    private InterCollection collection;
    private int pos=-1;
    public MyIterator(InterCollection collection) {
        this.collection=collection;
    }

    @Override
    public Object previous() {
        if (pos>0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos<collection.size()-1){
            return  true;
        }else {
            return false;
        }

    }

    @Override
    public Object first() {
        pos=0;
        return collection.get(pos);
    }
}
