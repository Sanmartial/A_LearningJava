package LessonsJava.Methods;

public class M_String {
    public static void main(String[] args) {
        String s1 = new String("AbcdefghijklMnopqrstuvWxyz");
        String s2 = "abcdefghijklmnopqrstuvwxyzjoOfFodon";
        System.out.println(s2);


        System.out.printf("%s \n%s\n", s1, s2);
//Длина строки
        int a = s1.length();
        System.out.println(a);
//какой симовл находится под индексом
        char ch = s1.charAt(5);
        System.out.println(ch);
//первое/ или после указаного индекса вхождение символа в строку
        int ind1 = s2.indexOf('o',5);
        int ind2 = s2.indexOf('g');
        int ind3 = s2.indexOf("stu", 5);
//последнее вхождение симовла в строке
        int ind4 = s2.lastIndexOf("o");
//возвращает в юникоде символ от указаного индекса
        int cC = s1.codePointCount(0, s1.length());
        //int f = s1.offsetByCodePoints(0, 'o');
//Примеры вывода
        System.out.println(ind1+ " "+ ind2 + " "+ ind3 + " "+ ind4);
        System.out.println(cC);
//вывод по символьно
        for (int i = 0; i < s1.length(); i++)
        {
            char cp = s1.charAt(i);
            System.out.printf("%c ", cp);
        }
        //пробел
        System.out.println();
//сравнение строк игноря регистр
        if(s1.equalsIgnoreCase(s2))
            System.out.println("strings is equais");
        else
            System.out.println("strings not equals");
//проверяет заканчивается ли на указаный символ строка
        if(s1.endsWith("z"))
            System.out.println("true");
        else
            System.out.println("false");
//выводит подстроку от и по указаными индексами. Индекс в вывод не входит
        String s10 = s1.substring(5,15);
        System.out.println(s10);
//невыводит пробелы в начали и в конце строки
        String s3 = "Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала: Ты лучше голодай, чем что попало есть, И лучше будь один, чем с кем попало.";
        String s30 = s3.trim();
        System.out.println(s30 + "\n" + s3);
//выводит все либо в верхнем либо в нижнем регистре
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
//меняет местами указаные сиволи/часть строки
        String rP = s1.replaceAll("yui", "bui0125");
        System.out.println(rP);
//проверяет содержит ли строка указаный символ/чатсь строки
        boolean cT = s1.contains(" ");
        System.out.println(cT);
// вывод строки после заглавных букв
        System.out.println("вывод заглавных букв");
        String s100 = s3.toUpperCase();

        char c1, c2;

        for (int i = 0; i < s3.length(); i++)
        {
            c1 = s3.charAt(i);
            c2 = s100.charAt(i);

            if(c1 !='.' && c1 != ',' && c1 != ' ' && c1 != ':' && (c1 == c2))
            {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
//сравнение строк при двух методах
        System.out.println();
        String x = "Hello!!!";
        String y = "Hello!!!";
        System.out.println(" сравнение строк ");
        System.out.println(x.equals(y));
//метод isBlank isEmpty Strip join
        System.out.println("метод isBlank");
        String s5 = "";
        System.out.println(s5.isBlank());
        System.out.println("метод isEmpty");
        System.out.println(s5.isEmpty());
        System.out.println("метод join");
        System.out.println(String.join("#", s2, s1));
        System.out.println(y.stripLeading());
        System.out.println(y.strip() == x);

        String one = String.valueOf(25);
        System.out.println(one + 12);

    }
}
