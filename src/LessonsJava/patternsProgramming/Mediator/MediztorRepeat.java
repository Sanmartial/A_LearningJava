package LessonsJava.patternsProgramming.Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediztorRepeat {
    public static void main(String[] args) {
ConcreteMediatorR mediatorR = new ConcreteMediatorR();
mediatorR.add(new ConcreteCollequeR(mediatorR, "one"));
mediatorR.add(new ConcreteCollequeR(mediatorR, "two"));
ConcreteCollequeR collequeR = new ConcreteCollequeR(mediatorR, "three");
collequeR.changeStatus();
    }
}

interface MediatorR{void allRequest(CollequeR collequeR);}
class ConcreteMediatorR implements MediatorR{
    List<CollequeR> collequeRList = new ArrayList<>();
    void add(CollequeR collequeR){
        collequeRList.add(collequeR);
    }

    @Override
    public void allRequest(CollequeR collequeR) {
        collequeR.setTrue();
        for(CollequeR coll : collequeRList){
            if(coll != collequeRList){
                coll.setFalse();
            }
        }
    }
}
interface  CollequeR{
    void setFalse();
    void setTrue();
    void changeStatus();
}
class ConcreteCollequeR implements CollequeR{
    boolean status;
    MediatorR mediatorR;
    String name;

    public ConcreteCollequeR(MediatorR mediatorR, String name) {
        this.mediatorR = mediatorR;
        this.name = name;
    }

    @Override
    public void setFalse() {
        status = false;
        System.out.println(name + " status is false");
    }

    @Override
    public void setTrue(){
        status = true;
        System.out.println(name + " status is true");
    }

    @Override
    public void changeStatus() {
        mediatorR.allRequest(this);
    }
}