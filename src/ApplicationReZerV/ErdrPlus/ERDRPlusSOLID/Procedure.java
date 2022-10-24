package ApplicationReZerV.ErdrPlus.ERDRPlusSOLID;

import ApplicationReZerV.CompareList.CompareList;

import java.util.List;

public class Procedure {
    final UserChoice userChoice;
    final ReadWriteInf readWriteInf;
    final StorageMemory storageMemory;
    final SingleFormat singleFormat;

    final ListCompare listCompare;

    public Procedure(UserChoice userChoice, ReadWriteInf readWriteInf, StorageMemory storageMemory, SingleFormat singleFormat, ListCompare listCompare) {
        this.userChoice = userChoice;
        this.readWriteInf = readWriteInf;
        this.storageMemory = storageMemory;
        this.singleFormat = singleFormat;
        this.listCompare = listCompare;
    }

    public void start() {

        //отобразить запрос к клиенту с перечислением возможных команд
        System.out.println("1- compare two lists\n" +
                "2- prepare list like this pattern 1 2021 10001-1234567\n" +
                "3- prepare list like this pattern 12021100011234567000 (with 000 )\n" +
                "4- correct the article number from ct.185 ch.1 like 185 (from file statUK.txt)");
        userChoice.choice();

        //в зависимости от выбраного варианта:
        //1 - сравнить два списка compare two lists
        if (userChoice.getChoice() == 1) {
            //а- прочитать первый список с внешнего ресурса "D:\\Test\\ErdrPlus\\listOne.txt";

            //б- сохранить его в памяти компютера в форме динмасива
            storageMemory.setListOne(readWriteInf.read("D:\\Test\\ErdrPlus\\listOne.txt"));
            //в- прочитать второй список с внешнего ресурся "D:\\Test\\ErdrPlus\\listTwo.txt";
            //г - сохранить его в памяти компютера в форме динмасива
            storageMemory.setListTwo(readWriteInf.read("D:\\Test\\ErdrPlus\\listTwo.txt"));
            //д - привести списки к единому формату
            singleFormat.format(storageMemory, storageMemory.getListOne());
            singleFormat.format(storageMemory, storageMemory.getListTwo());
            //е - сравнить два списка
            listCompare.compare(storageMemory);
            //ж - сохранить результат и вывести его для использование в тхт файл "D:\\Test\\ErdrPlus\\Result.txt";
            readWriteInf.write("D:\\\\Test\\\\ErdrPlus\\\\Result.txt", storageMemory);

        }
        //2- подготовить список в формате prepare list like this pattern 1 2021 10001-1234567
        //3 - подготовить список в формате prepare list like this pattern 12021100011234567000 (with 000 )
        //4 - исправить статью ККУ в стандартную correct the article number from ct.185 ch.1 like 185 (from file statUK.txt)
    }
}
