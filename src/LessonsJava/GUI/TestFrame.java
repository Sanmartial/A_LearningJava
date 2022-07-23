package LessonsJava.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class TestFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {


            var frame = new SimpleFrame();
            //var button = new ButtonFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //button.setVisible(true);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }

    static class SimpleFrame extends JFrame {
        private static final int DEF_WIDTH = 900;
        private static final int DEF_HEIGHT = 600;



        public SimpleFrame() {
            Image img = new ImageIcon("D:\\Java\\DEVILEYE.JPG").getImage();
            setIconImage(img);
            setTitle("Тестовая программа по изучению GUI");
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension screenSize = toolkit.getScreenSize();

            int scWight = screenSize.width;
            int scHeight = screenSize.height;

            setSize(DEF_WIDTH, DEF_HEIGHT);
            setLocation((scWight / 2) - (DEF_WIDTH / 2), (scHeight / 2) - (DEF_HEIGHT / 2));

            add(new ShowInComponent());


            //pack();
        }
       }
    }


    class ShowInComponent extends JComponent {
        public static final int MESSAGE_X = 10;
        public static final int MESSAGE_Y = 20;

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.BLUE);
            var font = new Font("Arial", Font.BOLD, 14);
            g2.setFont(font);
            g2.drawString("It is test Stringline in COMPONENT", MESSAGE_X, MESSAGE_Y);
            double leftX = 25;
            double topY = 25;
            double wight = 100;
            double height = 75;

            var rect = new Rectangle2D.Double(leftX, topY, wight, height);
            g2.setPaint(Color.GREEN);
            g2.draw(rect);

            var ellipse = new Ellipse2D.Double();

            ellipse.setFrame(rect);
            g2.setPaint(Color.RED);
            g2.draw(ellipse);

            var line = new Line2D.Double();
            line.setLine(leftX,topY, leftX+wight,topY+height);
            g2.setPaint(Color.YELLOW);
            g2.draw(line);

            double centerX = rect.getCenterX();
            double centerY = rect.getCenterY();
            double radius = 25;

            var circle = new Ellipse2D.Double();
            circle.setFrameFromCenter(centerX, centerY, centerX+radius, centerY+radius);
            g2.setPaint(Color.BLUE);
            g2.fill(circle);
            g2.draw(circle);



        }

    }

