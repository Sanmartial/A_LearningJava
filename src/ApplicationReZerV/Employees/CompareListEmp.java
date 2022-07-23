package ApplicationReZerV.Employees;

import ApplicationReZerV.CommonMethods.CommonMethods;
import ApplicationReZerV.Employees.Separate.Separate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareListEmp {

    public void compareEmployees() throws IOException {
        String pathPresent = "D:\\Test\\EMPLOYEES\\compare\\Present.txt";
        String pathPrevious = "D:\\Test\\EMPLOYEES\\compare\\Previous.txt";
        String pathResult = "D:\\Test\\EMPLOYEES\\compare\\Result.txt";

        List<String> listPresent = CommonMethods.readerListEmployee(pathPresent);//создаем список актуального на сегодня
        List<String> listPrevious = CommonMethods.readerListEmployee(pathPrevious); //сщздаем список предыдущего состава
        List<String> listResult = new ArrayList<>();

        Separate separate1 = new Separate();
        Separate separate2 = new Separate();

        separate1.setListEmployees(listPresent); //передаем для разделения на составляющие
        separate2.setListEmployees(listPrevious);//передаем для разделения на составляющие

        List<Policeman> listPolicePresent = separate1.getListPoliceman(); //создаем список сотрудников в виде класса
        List<Policeman> listPolicePrevous = separate2.getListPoliceman();
        List<Policeman> listResult2 = new ArrayList<>();

        listResult2 = checkEmployees(listPolicePresent, listPolicePrevous);


        //System.out.println(listPolicePresent.get(0).getSurname().equals(listPolicePrevoius.get(0).getSurname()));


        Collections.sort(listResult2, (x, y) -> x.getID() - y.getID());


        CommonMethods.writeList(forWriteToList(listResult2), pathResult);


    }

    private static List<String> forWriteToList(List<Policeman> listResult2) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < listResult2.size(); i++) {
            list.add(listResult2.get(i).getUnit() + "\t" + listResult2.get(i).getRank() + " " + listResult2.get(i).getSurname() + " " + listResult2.get(i).getFirstName() + " " + listResult2.get(i).getPatronymic() +
                    " " + listResult2.get(i).getPosition() + listResult2.get(i).getChangeless());
        }
    return list;}

    private static List<Policeman> checkEmployees(List<Policeman> listPolicePresent, List<Policeman> listPolicePrevous) {
        List<Policeman> listResult2 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < listPolicePresent.size(); i++) {
            count = 0;
            for (int j = 0; j < listPolicePrevous.size(); j++) {
                if (listPolicePresent.get(i).equals(listPolicePrevous.get(j))) ;
                else count++;
            }

            if (count == listPolicePrevous.size()) {
                listResult2.add(checkChanges(listPolicePresent.get(i), listPolicePrevous));
            }
        }
        System.out.println("____________________________________________");

        for (int i = 0; i < listPolicePrevous.size(); i++) {
            count = 0;
            for (int j = 0; j < listPolicePresent.size(); j++) {
                if (listPolicePrevous.get(i).getSurname().equals(listPolicePresent.get(j).getSurname())) ;
                else count++;
            }
            if (count == listPolicePresent.size()) {
                listPolicePrevous.get(i).setChangeless("\tВИБУВ");
                listResult2.add(listPolicePrevous.get(i));
            }
        }
        return listResult2;
    } //проверка на изменения

    private static Policeman checkChanges(Policeman policeman, List<Policeman> listPolicePrevous) {
        int countFN = 0;
        int countPos = 0;
        int countRank = 0;
        for (int i = 0; i < listPolicePrevous.size(); i++) {
            if (policeman.getSurname().equals(listPolicePrevous.get(i).getSurname()) && policeman.getRank().equals(listPolicePrevous.get(i).getRank()));
            else
                countRank++;
        }

        for (int i = 0; i < listPolicePrevous.size(); i++) {
            if (policeman.getSurname().equals(listPolicePrevous.get(i).getSurname()) && policeman.getFirstName().equals(listPolicePrevous.get(i).getFirstName()));
            else
                countFN++;
        }

        for (int i = 0; i < listPolicePrevous.size(); i++) {
            if (policeman.getSurname().equals(listPolicePrevous.get(i).getSurname()) && policeman.getPosition().equals(listPolicePrevous.get(i).getPosition()));
            else
                countPos++;
        }

        if (countPos == listPolicePrevous.size() && countFN != listPolicePrevous.size() && countRank != listPolicePrevous.size())
            policeman.setChangeless("\tзмінилась посада");

        if (countFN == listPolicePrevous.size() && countPos == listPolicePrevous.size() && countRank == listPolicePrevous.size())
            policeman.setChangeless("\tНОВИЙ");

        if (countFN != listPolicePrevous.size() && countPos != listPolicePrevous.size() && countRank == listPolicePrevous.size())
            policeman.setChangeless("\tзмінилось звання");
        if (countFN != listPolicePrevous.size() && countPos == listPolicePrevous.size() && countRank == listPolicePrevous.size())
            policeman.setChangeless("\tзмінилися звання та посада");

        //System.out.println(countPos + " " + countFN + " " + countRank);

        return policeman;
    } //изменения в должности и звании, а также новый сотрудник

}

