package ApplicationReZerV.ErdrPlus;

import java.util.ArrayList;
import java.util.List;

public class PrepareList {

    public List<String> sortListErdr(List<String> list) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(stringErdr(list.get(i)));
        }
        return list1;
    }

    private String stringErdr(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        String s1, s2, s3, s4;
        sb.append(s);
        int index = -1;
        index = sb.indexOf("№");
        if(index >= 0)
            sb.deleteCharAt(index);
        int index0 = -1;
        index0 = sb.indexOf(" ");
        if(index0>=0)
            sb.deleteCharAt(index0);
        //System.out.println(sb);
        if(sb.length() >= 17){
            s1 = sb.substring(0, 1);
            //System.out.println(s1);
            s2 = sb.substring(1, 5);
            s3 = sb.substring(5, 10);
            s4 = sb.substring(10, 17);//!!!
            sb1.append(s1).append(" ").append(s2).append(" ").append(s3).append("-").append(s4);
        }
        String s5 = sb1.toString();

        return s5;
    }

    public List<String> sortListErdrPlusZero(List<String> list) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            list1.add(stringErdrPlusZero(list.get(i)));
        return list1;
    }//приводим строки к единому формату в 17 символов
    private String stringErdrPlusZero(String s) {
        StringBuilder sb = new StringBuilder();
        String ss;
        sb.append(s);
        int index = -1, index0 = -1;
        if ((index = sb.indexOf("№")) >= 0)
            sb.deleteCharAt(index);
        while ((index0 = sb.indexOf(" ")) >= 0)
            sb.deleteCharAt(index0);
        if ((index0 = sb.indexOf("-")) >= 0)
            sb.deleteCharAt(index0);
        ss = sb.substring(0);
        if (sb.length() > 17) {
            ss = sb.substring(0, 17);
        }
        return ss+"000";
    }//приводим строки к единому формату в 17 символов


}
