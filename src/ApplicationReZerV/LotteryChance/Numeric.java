package ApplicationReZerV.LotteryChance;

import java.util.ArrayList;
import java.util.List;

public class Numeric {

    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int number5;
    private int number6;

    public Numeric() {
    }

    public Numeric(int number1, int number2, int number3, int number4, int number5, int number6) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
        this.number6 = number6;
    }

    public List<Integer> addList(Numeric numeric){
        List<Integer> list = new ArrayList<>();
        list.add(numeric.number1);
        list.add(numeric.number2);
        list.add(numeric.number3);
        list.add(numeric.number4);
        list.add(numeric.number5);
        list.add(numeric.number6);

        return list;}

    @Override
    public String toString() {
        return  number1 +
                ", " + number2 +
                ", " + number3 +
                ", " + number4 +
                ", " + number5 +
                ", " + number6 ;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public int getNumber4() {
        return number4;
    }

    public void setNumber4(int number4) {
        this.number4 = number4;
    }

    public int getNumber5() {
        return number5;
    }

    public void setNumber5(int number5) {
        this.number5 = number5;
    }

    public int getNumber6() {
        return number6;
    }

    public void setNumber6(int number6) {
        this.number6 = number6;
    }

    public static class CompareNumeric {
        public int compareNumeric(Numeric numeric, Numeric result) {
            List<Integer> listNumeric = numeric.addList(numeric);
            List<Integer> listResult = result.addList(result);
            int count = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if(listNumeric.get(i) == listResult.get(j)){

                        count++;
                    }
                }
            }
            //System.out.println(count);
            return count;}

        private int countWin(Integer integer, int two, int three, int four, int five, int six) {
            int countWIn = 0;
            if(integer == 2)
                countWIn = two;
            if(integer == 3)
                countWIn = two + three;
            if(integer == 4)
                countWIn = two + three + four;
            if(integer == 5)
                countWIn = two + three + four + five;
            if(integer == 6)
                countWIn = two + three + four + five + six;
            return countWIn;}

        public void showResult(List<Integer> listCount, int totalWin, int price, int two, int three, int four, int five, int six) {
            int invest = listCount.size() * price;
            int countWinTicket = 0, countTwo = 0, countThree = 0, countFour = 0, countFive = 0, countSix = 0;
            for (int i = 0; i < listCount.size(); i++)
                totalWin+= countWin(listCount.get(i), two, three, four, five, six);

            for (int i = 0; i < listCount.size(); i++) {
                if(listCount.get(i) == 2){
                    countTwo++;
                    countWinTicket++;}
                if(listCount.get(i) == 3){
                    countTwo++;
                    countThree++;
                    countWinTicket++;}
                if(listCount.get(i) == 4){
                    countTwo++;
                    countThree++;
                    countFour++;
                    countWinTicket++;}
                if(listCount.get(i) == 5){
                    countTwo++;
                    countThree++;
                    countFour++;
                    countFive++;
                    countWinTicket++;}
                if(listCount.get(i) == 6){
                    countTwo++;
                    countThree++;
                    countFour++;
                    countFive++;
                    countSix++;
                    countWinTicket++;}
            }
            double per =  ((double)countWinTicket / (double)listCount.size()) * 100; //;
            double perSale = ((double) totalWin / ((double) listCount.size() * price)) * 100;
            System.out.println("Куплено " + listCount.size() + " билетов за " + invest + " грн.");
            System.out.printf("Выиграно " + totalWin + " грн. Что %.2f %% от вложенной суммы\n", perSale);
            System.out.printf("Выиграшных билетов " + countWinTicket + " шт.  %.2f %% от всего количества.\n", per);
            System.out.print("Угадано:\n2 номера в " + countTwo + " билетах, " );
            System.out.print("3 номера в " + countThree + " билетах, " );
            System.out.print("4 номера в " + countFour + " билетах, \n" );
            System.out.print("5 номеров в " + countFive + " билете, " );
            System.out.print("6 номеров в " + countSix + " билете\n" );
        }
    }
}
