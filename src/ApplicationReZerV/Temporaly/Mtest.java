package ApplicationReZerV.Temporaly;

public class Mtest {
    public String getFrom(String s) {

        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'Т') ch[i] = '-';
            if (ch[i] == 'Н') ch[i] = '-';
            if (ch[i] == 'В') ch[i] = '-';
            sb.append(ch[i]);
        }

        return sb.substring(0);

    }
}

