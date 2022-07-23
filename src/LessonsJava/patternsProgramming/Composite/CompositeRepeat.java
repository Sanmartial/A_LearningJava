package LessonsJava.patternsProgramming.Composite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompositeRepeat {
    public static void main(String[] args) {
    Pan pan = new Pan("3 Liters");
    pan.addPan(new Pan("5 liters"));
    pan.addPan(new Pan("10 liters"));
    pan.addSpoon(new Spoon("silver"));
        System.out.println(pan.getListPan());

    }
    }
    class Spoon {
    private String name;

        public Spoon(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Spoon{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    class Pan {
    private String namePAn;
    private Date datePrepare;

    List<Spoon> listSpoon = new ArrayList<>();
    List<Pan> listPan = new ArrayList<>();

        public Pan(String namePAn) {
            this.namePAn = namePAn;
        }

        public void addPan(Pan pan){
            listPan.add(pan);
        }

        public void removePan(Pan pan){
            listPan.remove(pan);
        }

        public List<Pan> getListPan() {
            return listPan;
        }

        public List<Spoon> getListSpoon() {
            return listSpoon;
        }

        public void addSpoon(Spoon spoon){
            listSpoon.add(spoon);
        }

        public void removeSpoon(Spoon spoon){
            listSpoon.remove(spoon);
        }

        @Override
        public String toString() {
            return "Pan{" +
                    "namePAn='" + namePAn + '\'' +
                    ", datePrepare=" + datePrepare +
                    ", listSpoon=" + listSpoon +
                    ", listPan=" + listPan +
                    '}';
        }
    }