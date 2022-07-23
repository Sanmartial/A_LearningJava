package LessonsJava.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var button = new ButtonJ();
            button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            button.setResizable(false);
            button.setVisible(true);

        });
    }

    static class ButtonJ extends JFrame {
        private static final int BUTTON_HEIGHT = 100;
        private static final int BUTTON_WIDTH = 150;
        private static final int DEF_WIDTH = 900;
        private static final int DEF_HEIGHT = 600;
        private JPanel buttonPanel;

        public ButtonJ() {
            setSize(DEF_WIDTH, DEF_HEIGHT);
            Image img = new ImageIcon("D:\\Java\\DEVILEYE.JPG").getImage();
            setIconImage(img);
            setTitle("Тестовая программа по изучению GUI.Кнопки");
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension screenSize = toolkit.getScreenSize();

            int scWight = screenSize.width;
            int scHeight = screenSize.height;

            setSize(DEF_WIDTH, DEF_HEIGHT);
            setLocation((scWight / 2) - (DEF_WIDTH / 2), (scHeight / 2) - (DEF_HEIGHT / 2));

            var buttonOne = new JButton("ONE");
            var buttonTwo = new JButton("TWO");
            var buttonThree = new JButton("THREE");

            buttonPanel = new JPanel();
            buttonPanel.add(buttonOne);
            buttonPanel.add(buttonTwo);
            buttonPanel.add(buttonThree);
            add(buttonPanel);

            var yellowButton = new ColorAction(Color.YELLOW);
            var blueButton = new ColorAction(Color.BLUE);
            var redButton = new ColorAction(Color.RED);

           buttonOne.addActionListener(yellowButton);
           buttonTwo.addActionListener(blueButton);
           buttonThree.addActionListener(redButton);
        }
        private class ColorAction implements ActionListener{
            private Color backgroundColor;
            public ColorAction(Color c){
                backgroundColor = c;
            }

            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("Pushed button " + event.paramString());
                buttonPanel.setBackground(backgroundColor);
            }
        }
    }

}
