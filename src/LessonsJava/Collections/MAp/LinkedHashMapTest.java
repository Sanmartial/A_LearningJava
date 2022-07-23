package LessonsJava.Collections.MAp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
       Map <String, String> linkedHashMap = new LinkedHashMap<>();
        Map <String, String> treeMap = new TreeMap<>();
        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);


    }//method main

    public static void testMap(Map<String, String> map) {
        map.put("Боб", "Bob");
        map.put("Михаил", "Mike");
        map.put("Том", "Tom");
        map.put("1", "Tim");
        map.put("Леонид", "Lewis");
        map.put("33", "Richard");

        for (Map.Entry entry : map.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + " ");
        }
        System.out.println();
    }//testMap
}//class
