package LessonsJava.Vol_1_Basics.Timer;

import javax.swing.*;

public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();
        var timer = new Timer(1000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

}

