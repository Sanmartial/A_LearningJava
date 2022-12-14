package LessonsJava.patternsProgramming.Iterator;


import org.apache.commons.collections4.iterators.ArrayIterator;

public class IteratorTest {
    public static void main(String[] args) {
    ArrayContainer arrayContainer = new ArrayContainer();
    Iterator iterator = arrayContainer.getIterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
    }
}

interface Iterator{
    boolean hasNext();
    Object next();

}

interface  Container{
    Iterator getIterator();
}

class ArrayContainer implements Container{
    String[] array = {"Max", "ROman", "John", "Michel"};
    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return (index < array.length) ? true: false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return array[index++];
            }
            return null;
        }
    }
}