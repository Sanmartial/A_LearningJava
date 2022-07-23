package ApplicationReZerV.ErdrPlus;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixList {


    private String[] arrS = {"","115", "121", "122","125","162","185","186","187", "263","289","296","307","309","311"};
    //private String[] arrS = {"","115", "121", "122","125","146", "149", "152", "153", "154", "155", "156", "162","185","186","187", "189", "190", "191", "194", "199", "209", "222", "249", "255", "256", "257", "263",
            //"277", "278", "286", "289", "287", "288", "290", "296", "300", "301", "302", "303", "332", "304", "306", "307","308","309","310", "313", "315", "317", "320", "321", "357", "358", "364", "365", "366", "311"};

    private String line;
    private List<String> list = new ArrayList<>();
    private List<String> list1 = new ArrayList<>();

    private String processing(String s){
        String liner = "";
        Pattern pattern = Pattern.compile("\\d{3}");
        //Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            liner = matcher.group();
        }
        return  liner;}

    private boolean compareArr(String s){
        int count = 0;
        for(int j = 0; j < arrS.length; j++) {
            if (s.equals(arrS[j])) count++;
        }
        if(count > 0) return true;
        else          return false;
    }
    public List<String > ListProcess(List<String> list){
        String s = "";
        for(int i = 0; i < list.size(); i++){
            s=processing(list.get(i));
            if(!compareArr(s))
                s = "інші";
            list1.add(s);
        }
    return list1;}



}
