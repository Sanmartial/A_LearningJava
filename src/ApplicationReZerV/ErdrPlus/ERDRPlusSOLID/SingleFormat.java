package ApplicationReZerV.ErdrPlus.ERDRPlusSOLID;

import java.util.ArrayList;
import java.util.List;

public class SingleFormat {
    public void format(StorageMemory storageMemory, List<String> list) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            list1.add(stringErdr(list.get(i)));
        storageMemory.setListResult(list1);
    }

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
    }
}
