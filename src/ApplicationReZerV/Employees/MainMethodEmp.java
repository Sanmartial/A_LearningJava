package ApplicationReZerV.Employees;

import ApplicationReZerV.Employees.CreateList.CreateList;
import ApplicationReZerV.Employees.Separate.Separate;

import java.io.IOException;

public class MainMethodEmp {
    public static void main(String[] args) throws IOException {

        int answer = 0;

        Separate separate = new Separate();
        ShowQuestion showQuestion = new ShowQuestion();
        CreateList createList = new CreateList();
        answer = showQuestion.questionStart(); // запрос на дальнейшие действия
if(answer == 1) {
    int answer2 = showQuestion.nextAfterOne();
    if (answer2 == 1) {
        System.out.println("Created the list by form");
        createList.createListSimpleList();
    }//создаем обычный список по изначальной форме
    if (answer2 == 2){
        System.out.println("Created the list by form 2");
        createList.createListToWhom();

    } //создаем список в давательном падеже

    if (answer2 == 3){
        System.out.println("Created the list by form 3");
        createList.createListToRodPad();
    }//создаем список в родительном падеже

    if (answer2 == 4){
        System.out.println("Created the list by Mission");
        createList.createListForMission();
    }

    if (answer2 == 5){
        System.out.println("Created the list by form 5");
    }
}

if(answer == 2){
        System.out.println("compare two lists");
        CompareListEmp compareListEmp = new CompareListEmp();
        compareListEmp.compareEmployees(); //сравниваем два списка работиков
        }

        //CommonMethods.showList(listPol);
        //CommonMethods.writeList(listPol, pathResult);


    }
}
