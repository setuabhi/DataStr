package Collections.Map;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorList {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) // hasNext() just check whether iterator.next() has data or not
        {
            System.out.println(iterator.next());
            list.add("W");  // No exception, changes won't reflect in current iteration, will throw java.util.ConcurrentModificationException if arraylist used
        }

        System.out.println("Updated List: " + list); // here the change will reflect
    }
}