package LessonsJava.MultiThreading.Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class TestMTExchange {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendAction = new ArrayList<>();
        friendAction.add(Action.STONE);
        friendAction.add(Action.PAPER);
        friendAction.add(Action.SCISSOR);

        List<Action> friendAction2 = new ArrayList<>();
        friendAction2.add(Action.SCISSOR);
        friendAction2.add(Action.PAPER);
        friendAction2.add(Action.STONE);


        new BestFriend("Roman", friendAction, exchanger);
        new BestFriend("Ivan", friendAction2, exchanger);

    }
}
enum Action{
    STONE, SCISSOR, PAPER
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction){
        if((myAction == Action.STONE && friendAction == Action.SCISSOR)
            || (myAction == Action.SCISSOR && friendAction == Action.PAPER)
            || (myAction == Action.PAPER && friendAction == Action.STONE)){
            System.out.println(name + " WINS");
        }

    }

    public void run(){
        Action reply;
        for(Action action: myActions){
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
