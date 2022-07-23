package LessonsJava.lambdaExpressionsTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Arrays;

public class lanbdaArrayAndList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int [] arr = new int[10];
        listAdd(list);
        arrAdd(arr);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        //map method
       arr = Arrays.stream(arr).map((a) -> a * 2).toArray();
       list = list.stream().map((a) -> a * 2).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        System.out.println("////////////////////////////////////");
        //filter method
        List<Integer> list1 = new ArrayList<>();
        int [] arr1 = new int[10];

        listAdd(list1);
        arrAdd(arr1);

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        arr1 = Arrays.stream(arr1).filter(a -> a % 2 == 0).toArray();
        list1 = list1.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("////////////////////////////////////");

        //forEach method
        list1.forEach( a -> System.out.print(a + ", "));
        System.out.println();
        Arrays.stream(arr1).forEach(a -> System.out.print(a + ", "));

        System.out.println();
        System.out.println("////////////////////////////////////");

        //reduce
        List<Integer> list2 = new ArrayList<>();
        int [] arr2 = new int[10];

        listAdd(list2);
        arrAdd(arr2);

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));

        int sum1 = Arrays.stream(arr2).reduce((acc, b) -> acc + b).getAsInt();
        int sum2 = list2.stream().reduce((acc, b) -> acc + b).get();

        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println();
        System.out.println("////////////////////////////////////");

        //filter + map
        List<Integer> list3 = new ArrayList<>();
        int [] arr3 = new int[10];

        listAdd(list3);
        arrAdd(arr3);

        System.out.println(list3);
        System.out.println(Arrays.toString(arr3));

        arr3 = Arrays.stream(arr3).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        list3 = list3.stream().filter(a -> a % 2 != 0).map(a -> a * 2).collect(Collectors.toList());

        System.out.println(list3);
        System.out.println(Arrays.toString(arr3));


    }

    private static void arrAdd(int[] arr) {
        int num = 1;
        for(int i = 0; i < 10; i++) {
            num = (new Random().nextInt(15));
            if(num != 0)
            arr[i] = num;
            else
                arr[i] = 16;
        }
    }

    private static void listAdd(List<Integer> list) {
        int num = 1;
        for(int i = 1; i < 11; i++) {
            num = (new Random().nextInt(25));
            if(num != 0)
            list.add(num);
            else
                list.add(26);
        }
    }

}
