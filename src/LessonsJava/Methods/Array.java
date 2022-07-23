package LessonsJava.Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Arrays_M {
    public static void main(String[] args) {
        int arr1[] = {1,3,9,-3,8,99,4,5,77};
        int arr3[] = {1,3,9,-3,8,99,4,5,77};
        int arr4[] = arr1;

        System.out.println("equais -" + arr1.equals(arr4));

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //Arrays.sort(arr1);

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        String arr2[] = {"Hello", "Bye", "Roman", "Kiyv"};
        System.out.println();
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        System.out.println("\n##### sort");
        Arrays.sort(arr2);
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("\n##### binarySearch");
        int index1 = Arrays.binarySearch(arr2, "Roman");
        System.out.println(index1);

        int arr333[] = {1,2,3,4,5};
        int arr33[] = {1,2,3,5};

        char arr444[] = {'p','r','v','e','t'};
        char arr445[] = {'p','r','v','e','t'};
        char arr44[] = {'p','r','v','i','v','k','i'};

        System.out.println("##### compare");
        System.out.println(Arrays.compare(arr444, arr445));
        System.out.println("##### mismatch");
        System.out.println(Arrays.mismatch(arr444, arr445));
        System.out.println("##### fill");
        Arrays.fill(arr44, 's');
        for(char ch: arr44)
            System.out.print(ch+ "' ");

        System.out.println("\n##### hashCode");
        String a[] = {"0", "1"};
        int b[] = {1};
        System.out.println(a.hashCode() + " "+ b.hashCode()+ " "+ arr44.hashCode());

        System.out.println("\n##### removeAll retainAll containALL");
        ArrayList<String> nlist = new ArrayList<>();
        nlist.add("four");
        nlist.add("One");
        nlist.add("two");
        nlist.add("three");
        nlist.add("five");

        nlist.add("six");

        System.out.println(nlist + " ");
        ArrayList<String> nlist1 = new ArrayList<>();
        nlist1.add("One");
        nlist1.add("four");
        nlist1.add("three");
        nlist1.add("two");
        nlist1.add("five");

        System.out.println("nlist - " + nlist + " " + "nlist1 "+ nlist1);

        nlist.remove(nlist1);

        boolean result = nlist.containsAll(nlist1);
        System.out.println(result);

        System.out.println("\n##### sublist");
        List<String> sL = nlist.subList(1,3);
        System.out.println(sL);



    }






}

