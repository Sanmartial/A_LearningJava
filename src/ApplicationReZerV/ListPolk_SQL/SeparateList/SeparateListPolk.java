package ApplicationReZerV.ListPolk_SQL.SeparateList;

import ApplicationReZerV.CommonMethods.CommonMethods;
import ApplicationReZerV.Employees.Policeman;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateListPolk {
    String pathlistEnpl = "D:\\Test\\ListPolkDataBase\\ListEmployees.txt";

    String RegForName = "(поліції) ([А-ЯІЇЮЄа-яіїює'’]+) ([А-ЯІЇЮЄа-яіїює'’]+) ([А-ЯІЇЮЄа-яіїює'’]+)"; //нужно только указывать номер групы фамилия -2, имя 3, отчество - 4
    String RegRank = "[(старший )? А-яі]* поліції"; //RankId
    String RegPosition = "([0-9\\),\\(]+) ([А-яіЇї\\s\\W0-9№]+)";//номер группы 2
    String RegTokenID = "\\d{7}"; //номер жетона
       public List<Policeman> separateList() throws IOException {
        List<Policeman> listPoliceman = new ArrayList<>();
        List<String> listEmpTxt = CommonMethods.readerListEmployee(pathlistEnpl);
        for (int i = 0; i < listEmpTxt.size(); i++) {
            listPoliceman.add(new Policeman(i+1, getRankId(listEmpTxt.get(i)), getSurname(listEmpTxt.get(i)), getFirstName(listEmpTxt.get(i)),
                    getShortName(listEmpTxt.get(i)),getPatronymic(listEmpTxt.get(i)),getTokenID(listEmpTxt.get(i)),
                    getPosition(listEmpTxt.get(i)),getUnit(listEmpTxt.get(i))));
        }
        return listPoliceman;
        //CommonMethods.writeList( listPoliceman, pathResult);
    }

    private String getUnit(String s1) {

        String position = separatePatternREX(RegPosition, s1, 2);
        String s = "#";
        StringBuilder sb = new StringBuilder();
        sb.append(position);
        if((sb.indexOf("командир полку")) >= 0)
            s = "КП";
        if((sb.indexOf("заступник командира полку")) >= 0)
            s = "ЗКП";
        if((sb.indexOf("помічник начальника")) >= 0)
            //s = "Ш";
            s = "штаб";
        if((sb.indexOf("інспектор штабу")) >= 0)
            //s = "Ш";
            s = "штаб";
        if((sb.indexOf("чергової частини")) >= 0)
            //s = "Ш";
            s = "ЧЧ";
        if((sb.indexOf("відділення документування")) >= 0)
            //s = "Ш";
            s = "штаб";
        if((sb.indexOf("відділення зв’язку")) >= 0)
            // s = "Ш";
            s = "зв*язок";
        if((sb.indexOf("відділення кадрового")) >= 0)
            //s = "Ш";
            s = "кадри";
        if((sb.indexOf("відділення логістики")) >= 0)
            //s = "Ш";
            s = "ВЛМТЗ";
        if((sb.indexOf("тактико")) >= 0)
            //s = "Ш";
            s = "БСП";
        if((sb.indexOf("відділення превентивної")) >= 0)
            //s = "Ш";
            s = "ВПК";
        if((sb.indexOf("автотранспортної")) >= 0)
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
        return s;}//look for UNIT

    private String getPosition(String s) {
        return separatePatternREX(RegPosition, s, 2);
    }

    private String getTokenID(String s) {
        return separatePatternREX(RegTokenID, s, 0);
    }

    private String getPatronymic(String s) {
        return separatePatternREX(RegForName, s, 4);
    }

    private String getShortName(String s) {
        String firstName;
        String patronymic;
        StringBuilder sb = new StringBuilder();
        firstName = separatePatternREX(RegForName,s,3);
        patronymic = separatePatternREX(RegForName, s, 4);
        firstName = separateInitials(firstName);
        patronymic = separateInitials(patronymic);
        sb.append(firstName).append(" ").append(patronymic);
        return sb.substring(0);
    }

    private String separateInitials(String firstName) {
        StringBuilder sb = new StringBuilder();
        char[] ch = firstName.toCharArray();
        sb.append(ch[0]).append(".");
        return sb.substring(0);
    }

    private String getFirstName(String s) {
        return separatePatternREX(RegForName, s, 3);
    }

    private String getSurname(String s) {
        return separatePatternREX(RegForName, s, 2);
    }

    private String getRankId(String s) {
        return separatePatternREX(RegRank, s, 0);
    }

    private String separatePatternREX(String pattern, String line, int group){
        String list = null;
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(line);
        while(matcher.find()){
            list = matcher.group(group);
        }
        return list;
    }

}
