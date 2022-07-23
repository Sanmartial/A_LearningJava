package LessonsJava.Methods;

public class StringBuilder {
    public static void main(String[] args) {
//создание объектов
      var sB1 = new StringBuilder();
      var sB2 = new java.lang.StringBuilder("Good day!!!");
      var sB3 = new java.lang.StringBuilder(50);
      var sB4 = new java.lang.StringBuilder(sB3);
//длина строки
        System.out.println(sB3.length());
//получает символ по индексу
        System.out.println(sB2.charAt(5));
//устанавливает символ по определенному индексу
        int c = 65;
        //System.out.println(sB2.setCharAt(2, c));
 //находит индекс подстроки
        System.out.println(sB2.indexOf("o",1));
//выводит подстроку с и по указанных идексов
        System.out.println(sB2.substring(5, 10));
        String s2 = sB2.substring(3,11);
        System.out.println(s2);
        System.out.println(sB2.subSequence(3,9));
//добавляет строку в конец первой строки изменяя объект
        sB2.append(" Mother");
        System.out.println(sB2);
        String s3 = sB2.substring(3,15);
        System.out.println(s3);
//втавляет строку на позицию и возвращает ссылку на текущийц объект
        System.out.println(sB2.insert(4, " sun "));
//Удаляет указанный промежуток из строки
        var sB10 = new StringBuffer("Hello world");
        sB10.delete(3,6);
        System.out.println(sB10);
        sB10.deleteCharAt(7);
        System.out.println(sB10);
//выводит строку в обратном направлении
        sB10.reverse();
        System.out.println(sB10);
//Меняет местами указанные символы/подстроки в строке
        var sB12 = new java.lang.StringBuilder("All Hello!!!!!!");
        sB12.replace(0,3, "Petr");
//Возвращает количество мест в массиве конструктора StringBuilder (16+строка)
        System.out.println(sB12);
        System.out.println(sB12.capacity());
//совместимость с методами String
      var sB41 = new java.lang.StringBuilder("Hello");
      var sB42 = new StringBuffer("Good bye!!");

      var s41 = new String(sB41);
      var s42 = new String(sB42);

      System.out.println("s42 + s41 " + s42 + " " + s41);
//пример
      java.lang.StringBuilder sB11 = new java.lang.StringBuilder("123");
      java.lang.StringBuilder sB21 = sB11.append("45");
      sB21 = sB21.append("6").append("7");
      System.out.println("sB11 =" + sB11);
      System.out.println("sB21 =" + sB21);
//пример
        var sB13 = new java.lang.StringBuilder("Hello, friend!");
        String s = null;
        s = sB13.append("How are you?").substring(sB13.indexOf("f"), sB13.indexOf("!"));
        System.out.println(s);
 //пример построения строки и вызова метода to String
      var sB55 = new java.lang.StringBuilder();
      sB55.append("Hello!!!");
      String completeSt = sB55.toString();
      System.out.println("пример построения строки - " + completeSt);


    }
    }
