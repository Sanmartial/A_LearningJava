
package ApplicationReZerV.JDBCCall102;

import java.util.ArrayList;
import java.util.List;

public class SeparationJDBC102 {
    private final int SIZE = 16;

    List<String> listPP = new ArrayList<>();
    List<String> listData = new ArrayList<>();
    List<String> listPodia = new ArrayList<>();
    List<String> listOrgan = new ArrayList<>();
    List<String> listPatrol = new ArrayList<>();
    List<String> listTape = new ArrayList<>();
    List<String> listDirection = new ArrayList<>();
    List<String> listDistance = new ArrayList<>();
    List<String> listConfirmation = new ArrayList<>();
    List<String> listArrived = new ArrayList<>();
    List<String> listDid = new ArrayList<>();
    List<String> listCancel = new ArrayList<>();
    List<String> listMinDistance = new ArrayList<>();
    List<String> listTimeBetween1 = new ArrayList<>();
    List<String> listTimeBetween2 = new ArrayList<>();
    List<String> listTimeBetween3 = new ArrayList<>();

    //WriteReaderJDBC102 c102 = new WriteReaderC102();

    public List<String> String1(List<String> list) {
        List<String> listResult = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            addLists(list.get(i));
        listData = getListData(listData);
        listPodia = getListPodia(listPodia);
        listPatrol = getListPatrol(listPatrol);
        listDid = getListDid(listDid);
        listCancel = getListDid(listCancel);

        for (int i = 0; i < list.size(); i++) {
            listResult.add(allList(i));
        }

        return listResult;
    }

    private int[] arrayTab(String s) {
        char ch[] = s.toCharArray();
        int chN[] = new int[SIZE + 1];
        int j = 1;
        chN[0] = 0;
        for (int i = 0; i < ch.length; i++, j++) {
            if ((int) ch[i] == 9)
                chN[j] = i;
            else j--;
        }
        chN[SIZE] = s.length();
//        for(int i = 0; i < chN.length; i++)
//            System.out.print(chN[i] + " ");
        //System.out.println();
        return chN;
    } //определяет индекс пробела(табуляции)

    private String sepLine(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if (end != s.length() && end != 0)
            return sb.substring(start, end);
        else
            return sb.substring(start);
    } //возвращается подстрока с условным обозначением

    private String[] ArrCall102(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = new String[SIZE];
        int ch[] = arrayTab(s);
        int j = 0;
        arr[0] = sepLine(s, ch[j], ch[j + 1]);
        j++;

        for (int i = 1; i < arr.length; i++, j++) {
            arr[i] = sepLine(s, ch[j] + 1, ch[j + 1]);
//            System.out.print((ch[j] + 1) + " "  + ch[j + 1] + " ");
//            System.out.println(arr[i]);
        }
        return arr;
    }//массив строк с данными одной строки из списка Админпрактика

    private void addLists(String s) {
        String arr[] = new String[SIZE];
        arr = ArrCall102(s);
        listPP.add(arr[0]);
        listData.add(arr[1]);
        listPodia.add(arr[2]);
        listOrgan.add(arr[3]);
        listPatrol.add(arr[4]);
        listTape.add(arr[5]);
        listDirection.add(arr[6]);
        listDistance.add(arr[7]);
        listConfirmation.add(arr[8]);
        listArrived.add(arr[9]);
        listDid.add(arr[10]);
        listCancel.add(arr[11]);
        listMinDistance.add(arr[12]);
        listTimeBetween1.add(arr[13]);
        listTimeBetween2.add(arr[14]);
        listTimeBetween3.add(arr[15]);
    }//заполняем листы по колонкам

    private List<String> getListData(List<String> list) {
        StringBuilder sb = new StringBuilder();
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(timeMinus(list.get(i)));
        }
        return list1;
    } //форматируем дату

    private String timeMinus(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if (s.length() > 9)
            return sb.substring(0, 10);
        else
            return s;
    }//минусуем лишнюю информацию

    private List<String> getListPodia(List<String> list) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(switchList(list.get(i)));
        }
        return list1;
    }//форматируем столбец подия

    private String switchList(String s) {

        String ss;
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        if ((sb.indexOf("АДМІН")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("ДТП")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("ЖОРСТОКЕ")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("ПОШКОДЖЕННЯ ЗЕЛЕНИХ НАСАДЖЕНЬ")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("НАРУГА НАД МОГИЛОЮ")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("НЕЗАКОННЕ БУДІВНИЦТВО")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("НЕЗАКОННЕ ВСТАНОВЛЕННЯ МАФ")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("ОБОВ'ЯЗКІВ")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("СВАРКА")) >= 0) ss = "КОНФЛІКТ";
        else if ((sb.indexOf("БІЙКА")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ЗБРО")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("АВТОМАТ")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("ВБИВСТ")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ГРАБІЖ")) >= 0) ss = "ГРАБІЖ";
        else if ((sb.indexOf("РОЗБІЙ")) >= 0) ss = "ГРАБІЖ";
        else if ((sb.indexOf("НАСИЛЬС")) >= 0) ss = "КОНФЛІКТ";
        else if ((sb.indexOf("ЗАВОЛОДІН")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ЗГВАЛТУ")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ЗЛОЧИН")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("УШКОДЖ")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("КОНФЛІКТ")) >= 0) ss = "КОНФЛІКТ";
        else if ((sb.indexOf("КРАДІЖКА")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ПОГРОЗА")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ПОЖЕЖА")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("ПОРУШЕННЯ")) >= 0) ss = "АДМІНПРАВОПОРУШЕННЯ";
        else if ((sb.indexOf("ХУЛІГАН")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ШАХРАЙ")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ПОШКОДЖ")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("НЕЗАКОНН")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ОПІР ПРЕДСТАВНИКОВІ ВЛАДИ")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ДІЯЛЬНОСТІ ЖУРНАЛІСТА")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("ПІДРОБКА")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("РОЗБЕЩЕННЯ")) >= 0) ss = "ЗЛОЧИНИ";
        else if ((sb.indexOf("РЕЙДЕРСЬКЕ")) >= 0) ss = "РЕЙДЕР";

        else ss = "ІНФОРМАЦІЯ";

        return ss;
    } //меняю на одну из нескольких категорий вызовов

    private List<String> getListPatrol(List<String> list) {
        StringBuilder sb = new StringBuilder();
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(groupMinus(list.get(i)));
        }
        return list1;
    } //форматирую столбец с ГШР

    private String groupMinus(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if (s.length() > 3)
            return sb.substring(6, 9);
        else
            return s;
    }//форматирую столбец с ГШР

    private List<String> getListDid(List<String> list) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (changeOne(list.get(i)))
                list1.add("1");
            else
                list1.add(list.get(i));
        }
        return list1;
    }//метод для столбцов виконанв та відміна. Подстановка единицы

    private boolean changeOne(String s) {
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ':')
                return true;
        }
        return false;
    }// проверяет есть ли в строке двоеточие

    private String allList(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(listPP.get(i)).append("\t").append(listData.get(i)).append("\t").append(listPodia.get(i)).append("\t").append(listOrgan.get(i)).append("\t").append(listPatrol.get(i)).append("\t").append(listTape.get(i)).append("\t").
                append(listDirection.get(i)).append("\t").append(listDistance.get(i)).append("\t").append(listConfirmation.get(i)).append("\t").append(listArrived.get(i)).append("\t").append(listDid.get(i)).append("\t").
                append(listCancel.get(i)).append("\t").append(listMinDistance.get(i)).append("\t").append(listTimeBetween1.get(i)).append("\t").append(listTimeBetween2.get(i)).append("\t").append(listTimeBetween3.get(i));
        return sb.substring(0);
    }

    public String getStringInsert(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("'").append(listPP.get(i)).append("', '").append(listData.get(i)).append("', '").append(listPodia.get(i)).append("', '").append(organChange(listOrgan.get(i))).append("', '").append(listPatrol.get(i)).append("', '").append(listTape.get(i)).append("', '").
        append(listDirection.get(i)).append("', '").append(listDistance.get(i)).append("', '").append(listConfirmation.get(i)).append("', '").append(listArrived.get(i)).append("', '").append(listDid.get(i)).append("', '").
        append(listCancel.get(i)).append("', '").append(listMinDistance.get(i)).append("', '").append(listTimeBetween1.get(i)).append("', '").append(listTimeBetween2.get(i)).append("', '").append(listTimeBetween3.get(i)).append("')");
        return sb.substring(0);
    }

    private String organChange(String s){
        StringBuilder sb = new StringBuilder();
        int index = -1;
        if((index = s.indexOf("'")) > 0) {
            sb.append(s.substring(0, index)).append("\\'").append(s.substring(index + 1, s.length()));
            //System.out.println(sb.substring(0));
            return sb.substring(0);
        }
        else
        return s;
    }
}
//создаю готовую строку
