package ApplicationReZerV.CompareList;

import java.util.ArrayList;
import java.util.List;

public class CompareList {

    public List<String> compareList(List<String> listOne, List<String> listTwo){
        List<String> listResult = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < listOne.size(); i++) {
            count = 0;
            for (int j = 0; j <listTwo.size(); j++) {
                if(compareString(listOne.get(i), listTwo.get(j))){
                    listResult.add("OK");
                }
                else
                    count++;
            }
            if(count==listTwo.size()){
                listResult.add("--");            }
        }
    return listResult;}

    private boolean compareString(String i, String j) {
        if(i.equals(j)) {
            return true;
        }
        else
            return false;
    }
}
