package ApplicationReZerV.employeesOrder;

import ApplicationReZerV.CommonMethods.CommonMethods;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateEO {

    //String pathResult = "D:\\Test\\EmployeesOrder\\result.txt";
    //String pathResult = "E:result.txt";

    String pathResult = "\\\\Глоба-пк\\мои документы\\УДАЛИТЬ\\result.txt";
    String pathUO = "D:\\Test\\EmployeesOrder\\UO.txt";
    String pathCountOrder = "D:\\Test\\EmployeesOrder\\justCountOrder.txt";
    String pathMissOrder = "D:\\Test\\EmployeesOrder\\missOrder.txt";

    private List<String> listEmployees = new ArrayList<>();

    List<String>listName = new ArrayList<>();
    List<String> listOrder = new ArrayList<>();
    List<String> listTemp = CommonMethods.readerListEmployee(pathUO);
    List<Integer> listCount = new ArrayList<>();
    List<String> listResult = new ArrayList<>();

    String regPattern = "^([\sа-яйіїює№0-9\\W]+)\t([(старший )? А-яі]* поліції)\t([А-ЯІЇЮЄа-яіїює.'’\s]+)\t([№0-9]+)\t([А-ЯІЇЮЄа-яіїює\s0-9]+)\t([А-ЯІЇЮЄа-яіїює\s0-9]+)"; //нужно только указывать номер групы фамилия -2, имя 3, отчество - 4

    public SeparateEO() throws IOException {
    }
//1 - посада, 2- звання, 3- П.І.Б., 4- жетон, 5- юніт, 6 - служба

    public void createString() throws IOException {
        for (int i = 0; i < listEmployees.size(); i++) {
            //System.out.println(showString(listEmployees.get(i)));
            listName.add(setName(listEmployees.get(i)));
            listOrder.add(setOrder(listEmployees.get(i)));
        }
        int total = countOrder(listTemp);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String now = getDate();//получаем текущю дату

        listResult.add("ЗАДІЯННЯ");
        listResult.add("нарядів ППОП №1 ГУНП у м. Києві");
        listResult.add("станом на " + now + "\n");
        listResult.add("ПО СПИСКУ -\t" + listName.size() + " чол.");
        listResult.add("ВСЬОГО ЗАДІЯНО В НАРЯДАХ -\t" + total + " чол." + ", з них:");
        for (int i = 0; i < listTemp.size(); i++) {
            sb1.append(listTemp.get(i).toUpperCase(Locale.ROOT)).append(" -").append(listCount.get(i)).append(" чол.");
            for (int j = 0; j < listOrder.size(); j++) {
                if(listOrder.get(j).toLowerCase(Locale.ROOT).equals(listTemp.get(i).toLowerCase(Locale.ROOT))){
                    sb2.append(listName.get(j) + ", ");
                }
            }
            listResult.add(sb1.substring(0));
            listResult.add(sb2.substring(0));
            sb1.delete(0, sb1.length());
            sb2.delete(0, sb2.length());
        }

        listTemp.clear();
        listTemp = CommonMethods.readerListEmployee(pathCountOrder);
        total = countOrder(listTemp);

        listResult.add("\nВСЬОГО ЗАДІЯНО В ІНШИХ НАРЯДАХ-\t" + total + " чол." + ", з них:");
        for (int i = 0; i < listTemp.size(); i++) {
            sb1.append(listTemp.get(i).toUpperCase(Locale.ROOT)).append(" -\t").append(listCount.get(i)).append(" чол.");
            for (int j = 0; j < listOrder.size(); j++) {
                if(listOrder.get(j).toLowerCase(Locale.ROOT).trim().equals(listTemp.get(i).toLowerCase(Locale.ROOT).trim())){
                    //sb2.append(listName.get(j) + ", ");
                }
            }
            listResult.add(sb1.substring(0));
            //listResult.add(sb2.substring(0));
            sb1.delete(0, sb1.length());
            sb2.delete(0, sb2.length());
        }
        listTemp.clear();
        listTemp = CommonMethods.readerListEmployee(pathMissOrder);
        total = countOrder(listTemp);
        listResult.add("\nВІДСУТНІ -\t" + total + " чол." + ", з них:");
        for (int i = 0; i < listTemp.size(); i++) {
            sb1.append(listTemp.get(i).toUpperCase(Locale.ROOT)).append(" -\t").append(listCount.get(i)).append(" чол.");
            for (int j = 0; j < listOrder.size(); j++) {
                if(listOrder.get(j).toLowerCase(Locale.ROOT).equals(listTemp.get(i).toLowerCase(Locale.ROOT))){

                }
            }
            listResult.add(sb1.substring(0));

            sb1.delete(0, sb1.length());
            sb2.delete(0, sb2.length());
        }


        CommonMethods.writeList(listResult, pathResult);
    }

    private String getDate() {
        SimpleDateFormat dataForman = new SimpleDateFormat("dd.MM.YYYY");
        return dataForman.format(new Date());
    }

    private int countOrder(List<String> listT) {
        listCount.clear();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int total = 0;
        for (int i = 0; i < listT.size(); i++) {
            for (int j = 0; j < listOrder.size(); j++) {
                if(listOrder.get(j).toLowerCase(Locale.ROOT).trim().equals(listT.get(i).toLowerCase(Locale.ROOT).trim())){
                    //if(listOrder.get(j).equals(listT.get(i))){
                    count++;
                    total++;
                }
            }
            listCount.add(count);
            count = 0;
        }

   return total; }

    private String setOrder(String s) {
        return separateWithRegExpression(regPattern, s, 6);
    }

    private String setName(String s) {
        //System.out.println(separateWithRegExpression(regPattern, s, 3));
        return separateWithRegExpression(regPattern, s, 3);
    }

    private String separateWithRegExpression(String patternS, String fromList, int numberGroup){
        String list = null;
        Pattern pattern = Pattern.compile(patternS);
        Matcher matcher = pattern.matcher(fromList);

        while(matcher.find()){
            list = matcher.group(numberGroup);
        }

        return list;} //метод для регулярных выражений. Возвращает нужную фразу из строки


    public List<String> getListEmployees() {
        return listEmployees;
    }

    public void setListEmployees(List<String> listEmployees) {
        this.listEmployees = listEmployees;
    }
}
