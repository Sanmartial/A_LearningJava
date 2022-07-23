package LessonsJava.Methods;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

class ArrayList_m {
    public static void main(String[] args) {
        ArrayList List = new ArrayList();
        List.add("Hello!!!");

        Car c = new Car();
        List.add(c);

        var s = new Student();
        List.add(s);
        List.add(new java.lang.StringBuilder("ok"));

        ArrayList <String> list2 = new ArrayList<>(30);
        ArrayList<String>list5 = new ArrayList<>(list2);
        System.out.println(list2==list5);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Bye");
        list3.add("Hello");
        list3.add("Hi");
        list3.add("Roman Globa");
        list3.add(3,"Hello");
        for(String s1: list3)
            System.out.println(s1);
        String s3;
        s3 = list3.set(1, "!!!");
        System.out.println("\n" + s3);
        for(int i = 0; i < list3.size(); i++)
            System.out.print(list3.get(i) + ", ");
        System.out.println();
        ArrayList<String> list6 = new ArrayList<>();
        String sb1 = new String("Hello");
        String sb2 = new String("ok");
        String sb3 = new String("Hi");
        list6.add(sb1);
        list6.add(sb2);
        list6.add(sb3);

        //list6.remove(1);
        for(String sb: list6)
            System.out.print(sb+ ", ");
        System.out.println();
        ArrayList<String> list7 = new ArrayList<>();
        list7.add("Globa");
        list7.add("Bulgakova");
        list7.add("Golubenko");
        list7.add("Potiyko");
        list7.add("Globa");
        list6.addAll(list7);
        System.out.println("method addAll -");
        for (String s2: list6)
            System.out.print(s2+ ", ");
        System.out.println();
        list6.clear();
        list6.add(sb3);
        list6.add(sb2);
        list6.add("HHH");
        System.out.println("#### method clear & add -");
        for (String s2: list6)
            System.out.print(s2 + ", ");
        System.out.println("\n#### method indexOF -");
        System.out.println(list7.indexOf("Globa") + " " + list7.lastIndexOf("Globa"));
        list6.add("Timohina");
        //String s11[] = new String[list7.size()];
        String s11[] = list7.toArray(new String[list7.size()]);

        System.out.print("#### Method to Array -\n");
        for (String element: s11)
            System.out.print(element + "' ");
        System.out.println();
        list3.clear();
        System.out.println("#### method isEmpty---");
        System.out.println(list3.isEmpty());

        System.out.println("#### method contain---");
        System.out.println(list7.contains("Globa"));

        System.out.println("#### method toString---");
        System.out.println(list7.toString());

        System.out.println("#### method clone---");
        var sb11 = new java.lang.StringBuilder("A");
        var sb22 = new java.lang.StringBuilder("B");
        var sb33 = new java.lang.StringBuilder("C");

        var list11 = new ArrayList<java.lang.StringBuilder>();
        list11.add(sb11);
        list11.add(sb22);
        list11.add(sb33);
        var list22 = (ArrayList<java.lang.StringBuilder>)list11.clone();
        System.out.print ("РЎСЂР°РІРЅРµРЅРёРµ РґРІСѓС… СЂСЏРґРѕРІ - list11 & list22 ");
        System.out.println(list11.get(1) == list22.get(1));

        list11.get(0).append("!!!");
        list11.set(0, new java.lang.StringBuilder("D"));
        System.out.println(list22.get(0));
        System.out.println(list11.get(0));
        System.out.println("\nData output");
        LocalDate date = LocalDate.now(); // РїРѕР»СѓС‡Р°РµРј С‚РµРєСѓС‰СѓСЋ РґР°С‚Сѓ
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(date);
        System.out.println(dayOfWeek);
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);

        System.out.println("\n#### method Collections.cort");
        Collections.sort(list7);
        System.out.println(list7);

        System.out.println("\n#### method equals");
        ArrayList<String> list8 = new ArrayList<>();
        list8.add("Globa");
        list8.add("Bulgakova");
        list8.add("Golubenko");
        list8.add("Potiyko");
        list8.add("Globa");
        System.out.println(list7.equals(list8));
        System.out.println(list7);
        System.out.println(list8);

        System.out.println("##### Iterator");
        Iterator<String> it = list6.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }

        for(String str: list6)
            System.out.println(str);

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
        java.util.List<String> sL = nlist.subList(1,3);
        System.out.println(sL);

        //System.out.println("\n##### List.of List.copyOf");

        for(Object oB: nlist1)
            System.out.println("number " + oB + " and length\t" + ((String)oB).length());

        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Globa");
        map.put(778, "Bulgakova");
        map.put(779, "Golubenko");
        System.out.println(map);
        map.remove(780);

    }

}

class  Car{

}

class Student
{

}