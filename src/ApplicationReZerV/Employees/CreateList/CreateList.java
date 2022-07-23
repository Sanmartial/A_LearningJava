package ApplicationReZerV.Employees.CreateList;

import ApplicationReZerV.CommonMethods.CommonMethods;
import ApplicationReZerV.Employees.Policeman;
import ApplicationReZerV.Employees.Separate.Separate;
import ApplicationReZerV.Employees.Separate.SeparateForRodPad;
import ApplicationReZerV.Employees.Separate.SeparateMission;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateList {
    private String pathListEmpl = "D:\\Test\\EMPLOYEES\\listEmployees.txt";
    private String pathResult = "D:\\Test\\EMPLOYEES\\result.txt";
    private String pathResultEX = "D:\\Test\\EMPLOYEES\\resultEX.txt";

    Separate separate = new Separate();
    SeparateForRodPad separateForRodPad = new SeparateForRodPad();

    public void createListSimpleList() throws IOException {
        List<String> listEmp = CommonMethods.readerListEmployee(pathListEmpl); //считываем с файла список работников
        separate.setListEmployees(listEmp);//отправляю список для разделения на составляющие
        List<Policeman> listPol = separate.getListPoliceman();//создаем и возвращаем список полицейских в виде екземпляров класса policeman
        createListStringAndWrite(listPol);

    }

    public void createListToWhom() throws IOException {
        List<String> listEmp = CommonMethods.readerListEmployee(pathListEmpl); //считываем с файла список работников
        separate.setListEmployees(listEmp);//отправляю список для разделения на составляющие
        List<Policeman> listPol = separate.getListPoliceman();//создаем и возвращаем список полицейских в виде екземпляров класса policeman
        listPol = separate.separateForListToWhom(listPol);
        createListStringAndWrite(listPol);
    }

    public void createListToRodPad() throws IOException {
        List<String> listEmp = CommonMethods.readerListEmployee(pathListEmpl); //считываем с файла список работников
        separate.setListEmployees(listEmp);//отправляю список для разделения на составляющие
        List<Policeman> listPol = separate.getListPoliceman();//создаем и возвращаем список полицейских в виде екземпляров класса policeman
        listPol = separateForRodPad.separateForListToRodPAd(listPol);
        createListStringAndWrite(listPol);
    }
    private void createListStringAndWrite(List<Policeman>list) throws IOException {
        List<String> listString = new ArrayList<>();
        List<String> ListForExcel = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listString.add(list.get(i).getRank() + " " + list.get(i).getSurname() + " " + list.get(i).getFirstName() + " " + list.get(i).getPatronymic() + " " + list.get(i).getTokenID()
            + list.get(i).getPosition());
            ListForExcel.add(list.get(i).getRank() + "\t" + list.get(i).getSurname() + " " + list.get(i).getFirstName() + " " + list.get(i).getPatronymic() + "\t" + list.get(i).getTokenID()
                 + "\t"   + list.get(i).getPosition());
                    }
        CommonMethods.writeList(listString, pathResult);
        CommonMethods.writeList(ListForExcel, pathResultEX);
    } //создаем ЛистСтринг на основе листПолисмен и записываю в файл в двух вариантах


    public void createListForMission() throws IOException {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@44444444444444444");
        SeparateMission separateMission = new SeparateMission();
        List<String> listEmp = CommonMethods.readerListEmployee(pathListEmpl); //считываем с файла список работников
        separate.setListEmployees(listEmp);//отправляю список для разделения на составляющие
        List<Policeman> listPol = separate.getListPoliceman();//создаем и возвращаем список полицейских в виде екземпляров класса policeman
        listPol = separateMission.separateForMission(listPol);
        createListStringAndWrite(listPol);
    }
}
