package behavioral;

import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {
    public interface MyIterable<T> {
        MyIter<T> iterator();
    }

    public interface MyIter<T> {
        boolean hasNext();
        T next();
    }

    public class MyList<T> implements MyIterable<T> {
        private List<T> data = new ArrayList<T>();

        public void add(T t) {
            data.add(t);
        }

        public int getLength() {
            return data.size();
        }

        public T get(int index) {
            return data.get(index);
        }
        
        @Override
        public MyIter<T> iterator() {
            return new MyListIterator(this);
        }
    }

    public class MyListIterator<T> implements MyIter<T> {
        private MyList<T> myIterable;
        private int index;

        public MyListIterator(MyList<T> myIterable) {
            this.myIterable = myIterable;
        }

        @Override
        public boolean hasNext() {
            return index < myIterable.getLength();
        }

        @Override
        public T next() {
            return myIterable.get(index++);
        }
    }

    public static void main(String[] args) {
        new IteratorPattern().run();
    }

    public void run() {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        MyIter iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
