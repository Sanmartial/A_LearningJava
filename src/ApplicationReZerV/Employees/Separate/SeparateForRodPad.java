package ApplicationReZerV.Employees.Separate;

import ApplicationReZerV.Employees.Policeman;

import java.util.List;
import java.util.Locale;

public class SeparateForRodPad {


    public List<Policeman> separateForListToRodPAd(List<Policeman> listPol) {

        for (int i = 0; i < listPol.size(); i++) {
            //System.out.println(i);
            listPol.get(i).setPosition(changePosition(listPol.get(i).getPosition()));
            listPol.get(i).setSurname(changeSurname(listPol.get(i).getSurname()));
            listPol.get(i).setFirstName(changeFirstName(listPol.get(i).getFirstName()));
            listPol.get(i).setPatronymic(changePatronymic(listPol.get(i).getPatronymic()));
            listPol.get(i).setRank(changeRank(listPol.get(i).getRank()));
        }
        return listPol;
    }

    private String changeRank(String list) {

        if(list.equals("полковник поліції"))
            return "полковника поліції";
        if(list.equals("підполковник поліції"))
            return "підполковника поліції";
        if(list.equals("майор поліції"))
            return "майора поліції";
        if(list.equals("капітан поліції"))
            return "капітана поліції";
        if(list.equals("старший лейтенант поліції"))
            return "старшого лейтенанта поліції";
        if(list.equals("лейтенант поліції"))
            return "лейтенанта поліції";
        if(list.equals("молодший лейтенант поліції"))
            return "молодшого лейтенанта поліції";
        if(list.equals("старший сержант поліції"))
            return "старшого сержанта поліції";
        if(list.equals("сержант поліції"))
            return "сержанта поліції";
        if(list.equals("капрал поліції"))
            return "капрала поліції";
        if(list.equals("рядовий поліції"))
            return "рядового поліції";
        else return list;
    } //меняю звание

    private String changePatronymic(String list) {
        int sizeWord = list.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(list);

        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("на")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ну");
            return sb1.substring(0);
        }

        else{
            sb1.append(sb.substring(0, sizeWord)).append("а");
            return sb1.substring(0);
        }
    } //меняем окончание отчества

    private String changeFirstName(String list) {

        int sizeWord = list.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(list);

        if(sb.substring(sizeWord-1).toLowerCase(Locale.ROOT).equals("о")){
            sb1.append(sb.substring(0, sizeWord-1)).append("а");
            return sb1.substring(0);
        }
        if(sb.substring(0).equals("Ігор")){
            return "Ігоря";
        }
        if(sb.substring(0).equals("Джоні")){
            return "Джоні";
        }
        if(sb.substring(sizeWord-1).toLowerCase(Locale.ROOT).equals("р")){
            sb1.append(sb.substring(0, sizeWord-1)).append("ра");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ія")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ію");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ій")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ія");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("та")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ту");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("на")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ну");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ла")){
            sb1.append(sb.substring(0, sizeWord-2)).append("лу");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ль")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ля");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ра")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ру");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("га")){
            sb1.append(sb.substring(0, sizeWord-2)).append("гу");
            return sb1.substring(0);
        }

        else{
            sb1.append(sb.substring(0, sizeWord)).append("а");
            return sb1.substring(0);
        }
    } //меняем окончание имени


    private String changeSurname(String list) {
        int sizeWord = list.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(list);
        //System.out.println(sb.substring(sizeWord-1));
        if(sb.substring(sizeWord-1).toLowerCase(Locale.ROOT).equals("о")){
            sb1.append(sb.substring(0, sizeWord-1)).append("А");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ка")){
            sb1.append(sb.substring(0, sizeWord-2)).append("КУ");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ха")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ХУ");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ія")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ІЮ");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-1).toLowerCase(Locale.ROOT).equals("я")){
            sb1.append(sb.substring(0, sizeWord-1)).append("Ю");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-2).toLowerCase(Locale.ROOT).equals("ій")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ІЯ");
            return sb1.substring(0);
        }

        if(sb.substring(0).toLowerCase(Locale.ROOT).equals("швець")){
            return "ШВЕЦЯ";
        }

        if(sb.substring(0).toLowerCase(Locale.ROOT).equals("орел")){
            return "ОРЛА";
        }
        if(sb.substring(0).toLowerCase(Locale.ROOT).equals("фрунзе")){
            return "ФРУНЗЕ";
        }

        if(sb.substring(0).equals("ГАЛІШТЕЙ")){
            return "ГАЛІШТЕЙ";
        }
        if(sb.substring(0).equals("ЦИТЛІШВІЛІ")){
            return "ЦИТЛІШВІЛІ";
        }

        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("ець")){
            sb1.append(sb.substring(0, sizeWord-3)).append("ЦЯ");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("нок")){
            sb1.append(sb.substring(0, sizeWord-3)).append("НКА");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-1).toLowerCase(Locale.ROOT).equals("ь")){
            sb1.append(sb.substring(0, sizeWord-1)).append("Я");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-1).toLowerCase(Locale.ROOT).equals("й")){
            sb1.append(sb.substring(0, sizeWord-2)).append("ОГО");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-1).toLowerCase(Locale.ROOT).equals("а")){
            sb1.append(sb.substring(0, sizeWord-1)).append("У");
            return sb1.substring(0);
        }

        else
        {
            sb1.append(sb.substring(0, sizeWord)).append("А");
            return sb1.substring(0);
        }

    } //мемняю фамилию


    private String changePosition(String list) {
        int[] indexCh =getCharArrayFromList(list);
        String lineReturn = getStringLine(indexCh, list);
        return lineReturn;
    }

    private String getStringLine(int[] indexCh, String list) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(list);
        String word1 = sb.substring(0, indexCh[0]);
        String word2;
        if(indexCh.length > 2 && indexCh.length < 8){
            word1 = changeWordEnd(word1);
            word2 = getWordSecond(indexCh, list);
            word2 = changeWordEnd(word2);
            sb1.append(word1).append(word2).append(sb.substring(indexCh[1]).substring(0));
            return sb1.substring(0);
        }
        else
        {
            word1 = changeWordEnd(word1);
            sb1.append(word1).append(sb.substring(indexCh[0]).substring(0));
            return sb1.substring(0);
        }
    } //возвращает строку для вывода

    private String getWordSecond(int[] indexCh, String list) {
        //System.out.println(indexCh.length + " # " + list + " l -" + list.length());
        String word2;
        StringBuilder sb = new StringBuilder();
        sb.append(list);
        word2 = sb.substring(indexCh[0], indexCh[1]);

        return  word2;} // ищем второе слово

    private String changeWordEnd(String list) {
        int sizeWord = list.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(list);

        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("дир")){
            sb1.append(sb.substring(0, sizeWord-3)).append("дира");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("ник")){
            sb1.append(sb.substring(0, sizeWord-3)).append("ника");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("ший")){
            sb1.append(sb.substring(0, sizeWord-3)).append("шого");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("тор")){
            sb1.append(sb.substring(0, sizeWord-3)).append("тора");
            return sb1.substring(0);
        }
        if(sb.substring(0).toLowerCase(Locale.ROOT).equals("інспектор–черговий")){
            sb1.append("інспектора-чергового");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("нер")){
            sb1.append(sb.substring(0, sizeWord-3)).append("нера");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("ина")){
            sb1.append(sb.substring(0, sizeWord-3)).append("ину");
            return sb1.substring(0);
        }
        if(sb.substring(0).toLowerCase(Locale.ROOT).equals("поліцейський-водій")){
            sb1.append("поліцейського-водія");
            return sb1.substring(0);
        }
        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("кий")){
            sb1.append(sb.substring(0, sizeWord-3)).append("кого");
            return sb1.substring(0);
        }

        if(sb.substring(0).toLowerCase(Locale.ROOT).equals("інспектор-снайпер")){
            sb1.append("інспектора-снайпера");
            return sb1.substring(0);
        }

        if(sb.substring(sizeWord-3).toLowerCase(Locale.ROOT).equals("лог")){
            sb1.append(sb.substring(0, sizeWord-3)).append("лога");
            return sb1.substring(0);
        }

        else
            return list;

    } // меняем окончание словa

    private int[] getCharArrayFromList(String list) {

        char[] ch =list.toCharArray();
        int count = 1;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == 32)
                count++;
        }
        int[] indexCh = new int[count];
        int j = 0;

        for (int i = 0; i < ch.length; i++) {
            if((int)ch[i] == 32) {
                indexCh[j] = i;
                j++;  }
        }
        return  indexCh;
    }// возвращает индекс пробелов в строке
}
