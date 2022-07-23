package ApplicationReZerV.LotteryChance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainLottery {

    public static void main(String[] args) {
        final String userName = "bestuser";
        final String password = "bestuser";
        final String connectionUrl = "jdbc:mysql://localhost:3306/my_db";
        final String truncNumeric = "TRUNCATE TABLE my_db.numeric";
        final String createNumeric = "create table IF NOT EXISTS my_db.numeric (num1 int, num2 int, num3 int, num4 int, num5 int, num6 int)";
        final String truncResult = "TRUNCATE TABLE my_db.resultloto";
        final String createResult = "create table IF NOT EXISTS my_db.resultloto (num1 int, num2 int, num3 int, num4 int, num5 int, num6 int)";
        final String pathResultTxt = "D:\\Test\\lottery\\lotteryResult.txt";
        int price = 15, two = 20, three = 56, four =  2_084, five = 97_010, six = 12_465_681;
        int totalWin = 0;

        Scanner scanner = new Scanner(System.in);
        List<Numeric> listFull = new ArrayList<>();
        List<Integer> listPart = new ArrayList<>();
        List<String> listTxtResult = new ArrayList<>();
        List<Integer> listCount = new ArrayList<>();


        RecourceLottery wlc = new RecourceLottery();
        Numeric.CompareNumeric compareNumeric = new Numeric.CompareNumeric();

        System.out.println("1-generorovat variant\n2-write result\n3-check result");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.print("How mach various create? ");
            int qq = scanner.nextInt();
            for (int i = 0; i < qq; i++) {
                listFull.add(addListNumeric()); //генерируем указаное количество вариантов
            }
            wlc.truncDataBase(truncNumeric, createNumeric); //очищаем базуданных
            wlc.writeToDataBaseNumeric(listFull); //записываем результат в БД
        }

        if (input == 2){
            listTxtResult = wlc.readerTxtResult(pathResultTxt); //считываем результат из файла
            wlc.writerToDataBaseResult(listTxtResult, connectionUrl, userName, password); //записываем в БД
        }
        if(input == 3){
            List<Integer>listInput = new ArrayList<>();
            List<Numeric> listResult = new ArrayList<>();
            List<Numeric> listNumeric = new ArrayList<>();
            System.out.println("Input result lottery:");
            for (int i = 0; i < 6; i++)
                listInput.add(scanner.nextInt());

            Numeric result = new Numeric(listInput.get(0),listInput.get(1),listInput.get(2),listInput.get(3),listInput.get(4),listInput.get(5));
            listResult.add(result);
            listNumeric = wlc.readerDataBaseNumeric();
            for (int i = 0; i < listNumeric.size(); i++)
                listCount.add(compareNumeric.compareNumeric(listNumeric.get(i), listResult.get(0)));

            compareNumeric.showResult(listCount, totalWin, price, two, three, four, five, six);
        }
    }

    private static Numeric addListNumeric() {
        Numeric numeric = new Numeric();
        Random random = new Random();
        RecourceLottery wr = new RecourceLottery();
        List<Integer> listDrop = wr.dropNumeric();

        int n1= -1, n2= -1, n3= -1, n4= -1, n5= -1, n6 = -1;
        n1 = random.nextInt(53);
        while (compareInt(n1, n2, n3, n4, n5, n6,  listDrop )){
            n1 = random.nextInt(53);
        }

        n2 = random.nextInt(53);
        while (compareInt(n2, n1, n3, n4, n5, n6)){
            n2 = random.nextInt(53);
        }

        n3 = random.nextInt(53);
        while (compareInt(n3, n2, n1, n4, n5, n6, listDrop)){
            n3 = random.nextInt(53);
        }

        n4 = random.nextInt(53);
        while (compareInt(n4, n2, n3, n1, n5, n6, listDrop)){
            n4 = random.nextInt(53);
        }

        n5 = random.nextInt(53);
        while (compareInt(n5, n2, n3, n4, n1, n6)){
            n5 = random.nextInt(53);
        }

        n6 = random.nextInt(53);
        while (compareInt(n6, n2, n3, n4, n5, n1, listDrop)){
            n6 = random.nextInt(53);
        }

        return new Numeric(n1,n2,n3,n4,n5,n6); }

//    private static boolean compareInt(int n1, int n2, int n3, int n4, int n5, int n6) {
//        boolean result = true;
//        if (n1 == n2 || n1 == 0 )
//            return result;
//        if (n1 == n3 || n1 == 0)
//            return result;
//        if (n1 == n4 || n1 == 0)
//            return result;
//        if (n1 == n5 || n1 == 0)
//            return result;
//        if (n1 == n6 || n1 == 0)
//            return result;
//        else
//            result = false;
//        //System.out.println(result);
//    return result;}

    private static boolean compareInt(int n1, int n2, int n3, int n4, int n5, int n6, List<Integer> list) {
        boolean result = true;
        if (n1 == n2 || n1 == 0 || normalDigit(n1, list))
            return result;
        if (n1 == n3 || n1 == 0 || normalDigit(n1, list))
            return result;
        if (n1 == n4 || n1 == 0 || normalDigit(n1, list))
            return result;
        if (n1 == n5 || n1 == 0 || normalDigit(n1, list))
            return result;
        if (n1 == n6 || n1 == 0 || normalDigit(n1, list))
            return result;
        else
            result = false;
        //System.out.println(result);
        return result;}

    private static boolean compareInt(int n1, int n2, int n3, int n4, int n5, int n6) {
        boolean result = true;
        if (n1 == n2 || n1 == 0 )
            return result;
        if (n1 == n3 || n1 == 0 )
            return result;
        if (n1 == n4 || n1 == 0 )
            return result;
        if (n1 == n5 || n1 == 0 )
            return result;
        if (n1 == n6 || n1 == 0 )
            return result;
        else
            result = false;
        //System.out.println(result);
        return result;} //overload

    private static boolean normalDigit(int n1, List<Integer> list) {
        boolean normal = false;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(n1 == list.get(i))
                normal = true;
        }

        return normal;}
}
