package LessonsJava.GUI;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test1 extends Frame{
    public static void main(String[] args) {
        Test1 main = new Test1();
        main.setSize(400, 500);
        main.setVisible(true);
        main.setTitle("AWT EXAMPLE");
        main.setLayout(new FlowLayout());
        main.setResizable(true);

        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        main.add(label);

        Button botton = new Button("Hello JAVA!!!");
        botton.setBackground(Color.CYAN);
        main.add(botton);
        main.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                main.dispose();
            }
        });

        Panel panel = new Panel();
        panel.setBackground(Color.magenta);
        GridLayout layout = new GridLayout(0, 3);
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout(layout);

        CheckboxGroup group = new CheckboxGroup();

        Checkbox box;
        for (int i = 0; i < 12; i++) {
            box=new Checkbox("CheckBox " + i, group, false);
            final  int k = i;
            box.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    label.setText("CheckBox " + k + " : " + (e.getStateChange() == 1? "checked":"unchecked" ) );
                }
            });

            panel.add(box);
        }
        main.add(panel);
        main.pack();



    }
}
