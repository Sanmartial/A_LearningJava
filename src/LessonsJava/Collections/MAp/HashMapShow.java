package LessonsJava.Collections.MAp;

import java.util.HashMap;
import java.util.Map;

public class HashMapShow {
    public static void main(String[] args) {
        Map<Integer, String> romanAndArabian = new HashMap<>();
        String romanNumber[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
                "XIV", "XV", "XVI", "XVII", "XVIII", "XIX",
                "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
                "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
                "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX",
                "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX",
                "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI",
                "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI",
                "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX"};

        Map<Integer, String> map = new HashMap<>();

        for (int i = 1; i < romanNumber.length; i++)
            map.put(i, romanNumber[i - 1]);


        romanAndArabian.put(10, "IV");
        romanAndArabian.put(22, "V");

        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
            if (i % 25 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
            if (entry.getKey() % 25 == 0)
                System.out.println();
        }
    }//method main
    } //class



