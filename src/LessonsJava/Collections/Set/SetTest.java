package LessonsJava.Collections.Set;


import java.util.*;

public class SetTest {
public static void main(String[]args){

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> linkedHashSet1 = new LinkedHashSet<>();
        Set<Integer> treeSet1 = new TreeSet<>();

        //обьединение
        TestUnion(hashSet, hashSet1);
        TestUnion(linkedHashSet, linkedHashSet1);
        TestUnion(treeSet, treeSet1);

        System.out.println();



        System.out.println();

        //пересечение
        TestIntersection(hashSet, hashSet1);
        TestIntersection(linkedHashSet, linkedHashSet1);
        TestIntersection(treeSet, treeSet1);

        System.out.println();
        //Разность
        TestDifference(hashSet, hashSet1);
        TestDifference(linkedHashSet, linkedHashSet1);
        TestDifference(treeSet, treeSet1);


}
        static void Test(Set<Object> set){
        set.add("Mike");
        set.add("Bob");
        set.add("Richard");
        set.add("Monica");
        set.add("Rachel");
        set.add("Roman");
        set.add("Julia");

        for(Object name : set){
                System.out.print(name + " ");
        }

        System.out.println();
}

        static void TestUnion(Set<Integer> set, Set<Integer> set1){
                set.add(0);set.add(1); set.add(2);set.add(3);
                set.add(4);set.add(5);set.add(6);

                set1.add(2);set1.add(3); set1.add(4);set1.add(5);
                set1.add(6);set1.add(7);set1.add(8);

                set.addAll(set1);
                 System.out.println(set);

        }

        static void TestIntersection(Set<Integer> set, Set<Integer> set1){
                set.add(0);set.add(1); set.add(2);set.add(3);
                set.add(4);set.add(5);set.add(6);

                set1.add(2);set1.add(3); set1.add(4);set1.add(5);
                set1.add(6);set1.add(7);set1.add(8);

                set.retainAll(set1);
                  System.out.println(set);

        }

        static void TestDifference (Set<Integer> set, Set<Integer> set1){
                set.add(0);set.add(1); set.add(2);set.add(3);
                set.add(4);set.add(5);set.add(6);

                set1.add(2);set1.add(3); set1.add(4);set1.add(5);
                set1.add(6);set1.add(7);set1.add(8);

                set.removeAll(set1);
                 System.out.println(set);
 }

        static void ForEachSet(Set<Object> set){
                for(Object name : set){
                        System.out.print(name + " ");
                }
                System.out.println();
        }
}
