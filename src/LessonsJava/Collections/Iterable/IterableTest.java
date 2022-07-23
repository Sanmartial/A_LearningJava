package LessonsJava.Collections.Iterable;

import LessonsJava.Collections.Stack.StackTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterableTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        StackTest st = new StackTest();
        st.addElement(list);

        Collections.sort(list);
        Iterator<Integer> iterator = list.iterator();
        int idx = 0;
        while (iterator.hasNext())
        {

            System.out.println(iterator.next());
            if(idx == 1)
                iterator.remove();

        idx++;
        }
        System.out.println();
        for (int a: list)
            System.out.println(a);

    }

}
