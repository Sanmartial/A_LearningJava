package ApplicationReZerV.BaseEmployees;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SeparationL {

    private List<String> listBase = new ArrayList<>();
    private List<String> listBaseSort = new ArrayList<>();
    private List<String> listComparison = new ArrayList<>();
    private List<String> listQuerry = new ArrayList<>();
    private List<String> listResultQuerry = new ArrayList<>();

    private List<String> listUnit = new ArrayList<>();
    private List<String> listSurname = new ArrayList<>();
    private List<String> listFirstName = new ArrayList<>();
    private List<String> listPatronymic = new ArrayList<>();
    private List<String> listTokenID = new ArrayList<>(); //номер жетона
    private List<String> listRank = new ArrayList<>(); //звание
    private List<String> listPosition = new ArrayList<>(); //должность

    private String surname;
    private String firstName;
    private String patronymic;
    private String tokenID; //номер жетона
    private String rank; //звание
    private String position; //должность
    private String unit; //подразделение

    private String RegSurname = "поліції \\D++";
    private String RegTokenID = "\\d{7}"; //номер жетона
    private String RegRank = "\\D+ поліції"; //звание

    private String forWriteCount;

    public SeparationL(List<String> listBase1) {
        this.listBase = listBase1;
    }//конструктор класса

    public List<String> completeBaseEmployees(){
        for(int i = 0; i < listBase.size(); i++) {
            setPosition(i);
            listPosition.add(getPosition());
            setRank(i);
            listRank.add(getRank());
            setTokenID(i);
            listTokenID.add(getTokenID());
            setSurname(i);
            listSurname.add(getSurname());
            setFirstName(i);
            listFirstName.add(getFirstName());
            setPatronymic(i);
            listPatronymic.add(getPatronymic());
            setUnit();
            listUnit.add(getUnit());
            listBaseSort.add(toString());
        }
        //for(String s: listTokenID)
        //  System.out.println(s);
        return listBaseSort;}//заполняем базы работников по категориям
    public void comparisonList(){
        for(int i = 0; i < listBase.size(); i++) {
            listComparison.add(LineQuerry(i));
        }
    } //создаем список для сравнения
    public void compareTwoList(){
        List<String> listBase = new ArrayList<>();
        List<String> listQuerry = new ArrayList<>();
        List<String> listResult = new ArrayList<>();
        listBase = UpString(getListComparison());
        listQuerry = UpString(getListQuerry());
        String s = "not found";
        String s1 = "not found";

        for(int i = 0; i < listQuerry.size(); i++){
            int count = 0;
            for(int j = 0; j < listBase.size(); j++){
                if(listQuerry.get(i).equals(listBase.get(j))){
                    s = lineString(listQuerry.get(i), getListSurname().get(j));
                    listResult.add(s);
                }
                else
                    count++;
                if(count==listBase.size()) {
                    s1 = lineString(listQuerry.get(i), " --");
                    listResult.add(s1);
                }
            }

        }
        setListResultQuerry(listResult);

        //for(String s2: listResult) System.out.println(s2);
        //for(String s1: listQuerry) System.out.println(s1);
        //for(String s1: listBase) System.out.println(s1);

    }//сравниваем два списка
    private String lineString( String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2);
        return sb.substring(0);
    }
    private List<String> UpString(List<String> list){
        List<String> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            result.add(list.get(i).toUpperCase(Locale.ROOT));
        }
        return result;
    }//делаем слова в верхнем регистре
    private String LineQuerry(int i){
        StringBuilder sb = new StringBuilder();
        sb.append(listSurname.get(i)).append(" ").append(listFirstName.get(i)).append(" ").append(listPatronymic.get(i));
        return  sb.substring(0);} //сoздаем строку вывода согласно запроса
    private String regularExp(String s, String l){
        String r = "not found";
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(l);
        while(matcher.find()){
            r = matcher.group();
        }
        return r;
    } //сортировка по регулярному выражнию
    private void countUnit(){
        int KP = 0, ZKP = 0, shtab = 0, Ch = 0, SVAYZ = 0, Kadry = 0, VLMTZ = 0, VKP = 0, AR = 0, R1 = 0, R2 = 0, R3 = 0, R4 = 0, R5 = 0, RSHR = 0;
        for(int i = 0; i < listUnit.size(); i++){
            System.out.println(getListSurname().get(i));
            if(listUnit.get(i).equals("КП"))
                KP++;
            if(listUnit.get(i).equals("ЗКП"))
                ZKP++;
            if(listUnit.get(i).equals("штаб"))
                shtab++;
            if(listUnit.get(i).equals("ЧЧ"))
                Ch++;
            if(listUnit.get(i).equals("зв'язок"))
                SVAYZ++;
            if(listUnit.get(i).equals("кадри"))
                Kadry++;
            if(listUnit.get(i).equals("ВЛМТЗ"))
                VLMTZ++;
            if(listUnit.get(i).equals("ВПК"))
                VKP++;
            if(listUnit.get(i).equals("АР"))
                AR++;
            if(listUnit.get(i).equals("1"))
                R1++;
            if(listUnit.get(i).equals("2"))
                R2++;
            if(listUnit.get(i).equals("3"))
                R3++;
            if(listUnit.get(i).equals("4"))
                R4++;
            if(listUnit.get(i).equals("5"))
                R5++;
            if(listUnit.get(i).equals("РШР"))
                RSHR++;
            if(listUnit.get(i)==(null))
                continue;
        }
        StringBuilder sbKom = new StringBuilder();
        StringBuilder sbOfficer = new StringBuilder();
        StringBuilder sbRota = new StringBuilder();
        StringBuilder sbTotal = new StringBuilder();
        sbKom.append("КП - ").append(KP).append(", ").append("ЗКП -").append(ZKP);
        sbOfficer.append("штаб -").append(shtab).append(", ").append("ЧЧ - ").append(Ch).append(", ").append("зв*язок - ").append(SVAYZ).append(", ").append("кадри - ")
                .append(Kadry).append(", ").append("ВЛМТЗ - ").append(VLMTZ).append(", ").append("ВПК - ").append(VKP);
        sbRota.append("1 рота -").append(R1).append(", ").append("2 рота - ").append(R2).append(", ").append("3 рота - ").append(R3).append(", ").append("4 рота - ")
                .append(R4).append(", ").append("5 рота - ").append(R5).append(", ").append("Авторота - ").append(AR).append(", ").append("РШР - ").append(RSHR);
        sbTotal.append("Всього -").append(listUnit.size()).append(" ").append(KP+ZKP+shtab+Ch+SVAYZ+Kadry+VLMTZ+VKP+R1+R2+R3+R4+R5+AR+RSHR);
        String s1 = sbKom.substring(0);
        String s2 = sbOfficer.substring(0);
        String s3 = sbRota.substring(0);
        String s4 = sbTotal.substring(0);
        StringBuilder sbResult = new StringBuilder();
        sbResult.append(s1).append(" \n").append(s2).append("\n").append(s3).append("\n").append(s4);
        forWriteCount = sbResult.substring(0);
    } //подсчет количества работников
    public void writeCount() throws IOException {
        countUnit();
        WriteReaderBB rwb = new WriteReaderBB();
        rwb.writerOther("D:\\Test\\BaseEmpl\\count.txt", forWriteCount);
    } //запись количества в файл
    public void setSurname(int i) {
        String s;
        int index, index0 = -1;
        s = regularExp(RegSurname, listBase.get(i));
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        index = sb.indexOf(" ");
        s =sb.substring(index+1);
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s);
        index0 = sb1.indexOf(" ");
        this.surname = sb1.substring(0, index0);
    }
    public void setFirstName(int i) {
        String s;
        int index, index0 = -1;
        s = regularExp(RegSurname, listBase.get(i));
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        index = sb.indexOf(surname);
        s = sb.substring(index+surname.length()+1);
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s);
        index0 = sb1.indexOf(" ");

        this.firstName = sb1.substring(0, index0);
    }
    public void setPatronymic(int i) {
        String s;
        int index, index0 = -1;
        s = regularExp(RegSurname, listBase.get(i));
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        index = sb.indexOf(firstName);
        s = sb.substring(index+firstName.length()+1);
        StringBuilder sb1 = new StringBuilder();
        sb1.append(s);
        index0 = sb1.indexOf(" ");
        this.patronymic = sb1.substring(0, index0);
    }
    public void setTokenID(int i) {
        this.tokenID = regularExp(RegTokenID, listBase.get(i) );
    }
    public void setRank(int i) {
        this.rank = regularExp(RegRank, listBase.get(i) );
    }
    public void setPosition(int i) {
        StringBuilder sb = new StringBuilder();
        int index = -1, index0 = -1;
        sb.append(listBase.get(i));
        index = sb.indexOf(", ");
        this.position = sb.substring(index+2);
        //System.out.println(listBase.get(i));
    }
    public void setUnit() {
        String s = null;
        StringBuilder sb = new StringBuilder();
        sb.append(position);
        if((sb.indexOf("командир полку")) >= 0)
            s = "КП";
        if((sb.indexOf("заступник командира полку")) >= 0)
            s = "ЗКП";
        if((sb.indexOf("помічник начальника")) >= 0)
            s = "штаб";
        if((sb.indexOf("інспектор штабу")) >= 0)
            s = "штаб";
        if((sb.indexOf("чергової частини")) >= 0)
            s = "ЧЧ";
        if((sb.indexOf("відділення документування")) >= 0)
            s = "штаб";
        if((sb.indexOf("відділення зв’язку")) >= 0)
            s = "зв'язок";
        if((sb.indexOf("відділення кадрового")) >= 0)
            s = "кадри";
        if((sb.indexOf("відділення логістики")) >= 0)
            s = "ВЛМТЗ";
        if((sb.indexOf("відділення превентивної")) >= 0)
            s = "ВПК";
        if((sb.indexOf("автотранспортної роти")) >= 0)
            s = "АР";
        if((sb.indexOf("роти № 1")) >= 0)
            s = "1";
        if((sb.indexOf("роти № 2")) >= 0)
            s = "2";
        if((sb.indexOf("роти № 3")) >= 0)
            s = "3";
        if((sb.indexOf("роти № 4")) >= 0)
            s = "4";
        if((sb.indexOf("роти № 5")) >= 0)
            s = "5";
        if((sb.indexOf("швидкого реагування")) >= 0)
            s = "РШР";

        this.unit = s;
    }
    public void setListBase(List<String> listBase) {
        this.listBase = listBase;
    }
    public void setListComparison(List<String> listComparison) {
        this.listComparison = listComparison;
    }

    public List<String> getListBase() {
        return listBase;
    }
    public String getSurname() {
        return surname;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getTokenID() {
        return tokenID;
    }
    public String getRank() {
        return rank;
    }
    public String getPosition() {
        return position;
    }
    public String getUnit() {
        return unit;
    }

    public List<String> getListComparison() {
        return listComparison;
    }
    public List<String> getListBaseSort() {
        return listBaseSort;
    }
    public List<String> getListUnit() {
        return listUnit;
    }
    public List<String> getListSurname() {
        return listSurname;
    }
    public List<String> getListFirstName() {
        return listFirstName;
    }
    public List<String> getListPatronymic() {
        return listPatronymic;
    }
    public List<String> getListTokenID() {
        return listTokenID;
    }
    public List<String> getListRank() {
        return listRank;
    }
    public List<String> getListPosition() {
        return listPosition;
    }

    public List<String> getListQuerry() {
        return listQuerry;
    }

    public void setListQuerry(List<String> listQuerry) {
        this.listQuerry = listQuerry;
    }

    public List<String> getListResultQuerry() {
        return listResultQuerry;
    }

    public void setListResultQuerry(List<String> listResultQuerry) {
        this.listResultQuerry = listResultQuerry;
    }

    @Override
    public String toString() {
        return //tokenID + " " +
                //rank + " " +
                surname + " " +
                        //firstName + " " +
                        // patronymic + " " +
                        //position +  " " +
                        unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(listBase, listQuerry);
    }
}
