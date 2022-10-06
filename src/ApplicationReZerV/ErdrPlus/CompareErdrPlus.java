package ApplicationReZerV.ErdrPlus;

import java.util.ArrayList;
import java.util.List;

public class CompareErdrPlus {


    public List<String> sortListErdr(List<String> list) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            list1.add(stringErdr(list.get(i)));
        return list1;
    }//приводим строки к единому формату в 17 символов
    private String stringErdr(String s) {
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
        return ss;
    }//приводим строки к единому формату в 17 символов
    public List<String> compareListString(List<String> list, List<String> list1) {
        int count;
        List<String> listR = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list1.size(); j++) {
                if (list.get(i).equals(list1.get(j))) {
                    listR.add(lineString(list.get(i), list1.get(j)));
                    //listR.add("OK");
                }
                else
                    count++;
            }
            if (count == list1.size()) {
                listR.add("--");
                //listR.add(lineString(list.get(i), "--"));
            }
        }
        return listR;
    }//сравниваем списки
    private String lineString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append("  ").append(s2);
        return sb.substring(0);
    }//создаем строку с результатом сравнивания

}
