package ApplicationReZerV.RZ_Day;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SeparationRZ {
    private final int SIZE = 31;

    public List<String> stringResult(List<String> list, String s) {

        List<String> listResult = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            listResult.add(stringEmployee(list.get(i).toUpperCase(Locale.ROOT), s));
        }

        return listResult;} //возвращает список с датами выходов в зависимости от вида запроса
    //private
    private int[] arrayTab (String s){
        char ch[] = s.toCharArray();
        int chN[] = new int[SIZE+1];
        int j = 1;
        chN[0] = 0;

        for(int i =0; i < ch.length; i++, j++){
            if(ch[i]=='\t' || ch[i]==' ')
                chN[j] = i;
            else j--;
        }
        return  chN;} //определяет индекс пробела(табуляции)
    private String sepLine (String s, int start, int end){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        if(end != s.length() && end != 0)
            return sb.substring(start, end);
        else
            return sb.substring(start);
    } //возвращается подстрока с условным обозначением
    private String[] ArrRZ(String s){
        StringBuilder sb = new StringBuilder();
        String arr[] = new String[SIZE];
        int ch[] = arrayTab(s);
        int j = 0;
        arr[0] = sepLine(s, ch[j], ch[j+1]);
        j++;
        for(int i = 1; i < arr.length; i++, j++)
            arr[i] = sepLine(s, ch[j]+1, ch[j+1]);
        return arr;
    }//массив строк с обозначениями выходов за месяц
    private String stringEmployee(String s, String logo){
        StringBuilder sb = new StringBuilder();
        String arS[] = ArrRZ(s);
        for(int i = 0; i < arS.length; i++){
            if(arS[i].equals(logo))
                sb.append(i + 1 + ",");
        }
        return sb.substring(0);
    }//возвращаем строку с перечислением дней в соответсвии с запросом


}



