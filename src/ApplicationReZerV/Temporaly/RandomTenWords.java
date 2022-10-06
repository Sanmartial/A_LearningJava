package ApplicationReZerV.Temporaly;

import ApplicationReZerV.CommonMethods.CommonMethods;

import java.io.IOException;
import java.util.List;

public class RandomTenWords {
    public static void main(String[] args) throws IOException {
        List<String> list = CommonMethods.readerListAll("D:\\Test\\Temporaly\\randomWords\\randomWords.txt\\");
        for (int i = 0; i < 50; i++) {
            int count = (int) (Math.random() * (list.size())-1);
            System.out.println(list.get(count));
        }
    }
}
