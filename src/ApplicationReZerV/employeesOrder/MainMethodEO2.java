package ApplicationReZerV.employeesOrder;

import ApplicationReZerV.CommonMethods.CommonMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainMethodEO2 {
    public static void main(String[] args) throws IOException {
        String pathXX = "\\\\Глоба-пк\\мои документы\\УДАЛИТЬ\\xx.txt";
        String pathResult  = "\\\\Глоба-пк\\мои документы\\УДАЛИТЬ\\result.txt";

        String[] positionEO = {
                "відрядження", //0
                "внутрішній наряд",//1
                "гор", //2
                "ГУ", //3
                "відпустка",//4
                "гшр", //5
                "Dекретна відпустка",//6
                 "дельта", //7
                "жд вокзал", //8
                "за місцем проживання",//9
                "навчання", //10
                "лікарняний", //11
                "мвс", //12
                "охорона містечка",//13
                "після служби", //14
                "постанова", //15
                "звільнений",//16
                "рапорт",//17
                "блокпост",//18
                "готель",//19
                "служба",//20
                "супроводження",//21
                "масові заходи",//22
                "полігон"}; //23

        List<String> listXX = CommonMethods.readerListAll(pathXX);

        List<String> listForResult = new ArrayList<>();

        for (int i = 0; i < listXX.size(); i++) {
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[0].toLowerCase(Locale.ROOT).trim())){//відрядження
                listForResult.add("ВД"+"\t"+"");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[1].toLowerCase(Locale.ROOT).trim())){//внутрішній наряд
                listForResult.add("НС"+"\t"+"м.Київ(внутрішній наряд)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[2].toLowerCase(Locale.ROOT).trim())){//гор
                listForResult.add("НС"+"\t"+"м.Київ(група оперативного реагування)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[3].toLowerCase(Locale.ROOT).trim())){//ГУ
                listForResult.add("НС"+"\t"+"м.Київ(ГУНП у м.Києві)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[4].toLowerCase(Locale.ROOT).trim())){//відпустка
                listForResult.add("ВП"+"\t"+"");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[5].toLowerCase(Locale.ROOT).trim())){//гшр
                listForResult.add("НС"+"\t"+"м.Київ(ГШР)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[6].toLowerCase(Locale.ROOT).trim())){//декретна відпустка
                listForResult.add("ДВ"+"\t"+"");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[7].toLowerCase(Locale.ROOT).trim())){//дельта
                listForResult.add("НС"+"\t"+"м.Київ(МГШР)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[8].toLowerCase(Locale.ROOT).trim())){//жд вокзал
                listForResult.add("НС"+"\t"+"м.Київ(Залізничний вокзал)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[9].toLowerCase(Locale.ROOT).trim())){//за місцем проживання
                listForResult.add("МП"+"\t"+"");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[10].toLowerCase(Locale.ROOT).trim())){//навчання
                listForResult.add("НС"+"\t"+"проходження першочергової підготовки поліцейських");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[11].toLowerCase(Locale.ROOT).trim())){//лікарняний
                listForResult.add("ЛК"+"\t"+"");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[12].toLowerCase(Locale.ROOT).trim())){//мвс
                listForResult.add("НС"+"\t"+"м.Київ(охорона МВС України)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[13].toLowerCase(Locale.ROOT).trim())){//охорона містечка
                listForResult.add("НС"+"\t"+"м.Київ(Резерв. Охорона містечка)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[14].toLowerCase(Locale.ROOT).trim())){//після служби
                listForResult.add("НС"+"\t"+"м.Київ(після добового чергування)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[15].toLowerCase(Locale.ROOT).trim())){//постанова
                listForResult.add("НС"+"\t"+"м.Київ(Охорона осіб за постановою суду)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[16].toLowerCase(Locale.ROOT).trim())){//звільнений
                listForResult.add("ЗВ"+"\t"+"ЗВІЛЬНЕНИЙ");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[17].toLowerCase(Locale.ROOT).trim())){//рапорт
                listForResult.add("НС"+"\t"+"м.Київ(Резерв)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[18].toLowerCase(Locale.ROOT).trim())){//блокпост
                listForResult.add("НС"+"\t"+"м.Київ(блокпост)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[19].toLowerCase(Locale.ROOT).trim())){//готель
                listForResult.add("НС"+"\t"+"м.Київ(ГОР супроводження іноземних фахівців)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[20].toLowerCase(Locale.ROOT).trim())){//служба
                listForResult.add("НС"+"\t"+"м.Київ(Виконання функційних обов'язків за напрямком службової діяльності)");
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[21].toLowerCase(Locale.ROOT).trim())){
                listForResult.add("НС"+"\t"+"м.Київ(Супроводження)");//супроводження
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[22].toLowerCase(Locale.ROOT).trim())){
                listForResult.add("НС"+"\t"+"м.Київ(Охорона публічного порядку та безпеки в районах м. Києва зі складною оперативною обстановкою)");//масові заходи
            }
            if(listXX.get(i).toLowerCase(Locale.ROOT).trim().equals(positionEO[23].toLowerCase(Locale.ROOT).trim())){
                listForResult.add("НС"+"\t"+"м.Київ(заняття з тактико-спеціальної підготовки)");//полігон
            }
        }

        CommonMethods.writeList(listForResult, pathResult);
    }
}
