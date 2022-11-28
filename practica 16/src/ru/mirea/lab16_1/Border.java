package ru.mirea.lab16_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import static javax.swing.plaf.basic.BasicGraphicsUtils.drawString;

public class Border extends Frame{

    static JLabel label1;

    public static  void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        //panel.setLayout(new FlowLayout());

        //label1 = new JLabel("no action ");

        //Border m = new Border();


        //panel.add(label1);
        //frame.add(panel);

        /*JComponent jcomp = new MyComponent();
        frame.add(new MyComponent());
        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCord = e.getX();
                MyComponent.yCord = e.getY();
                jcomp.repaint();
            }
        });*/

        frame.setVisible(true);



       Container container = frame.getContentPane();

        container.setLayout(new BorderLayout());

        LableSimple ls1 = new LableSimple("NORTH",Color.BLUE);
        LableSimple ls2 = new LableSimple("SOUTH",Color.RED);
        LableSimple ls3 = new LableSimple("WEST",Color.GREEN);
        LableSimple ls4 = new LableSimple("EAST",Color.GRAY);
        LableSimple ls5 = new LableSimple("CENTER",Color.YELLOW);

        ls1.setPreferredSize(new Dimension(0,80));
        ls2.setPreferredSize(new Dimension(0,80));
        ls3.setPreferredSize(new Dimension(90,0));
        ls4.setPreferredSize(new Dimension(90,0));

        container.add(ls1,BorderLayout.PAGE_START);
        container.add(ls2,BorderLayout.PAGE_END);
        container.add(ls3,BorderLayout.LINE_START);
        container.add(ls4,BorderLayout.LINE_END);
        container.add(ls5,BorderLayout.CENTER);



    }

    /* static class MyComponent extends JComponent{
        public static int xCord;
        public static int yCord;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Добро пожаловать в САО" + xCord + " " + yCord, 50,30);
        }
    }*/


    static class LableSimple extends JLabel{
        LableSimple(String s, Color color){
            super(s);

            setOpaque(true);//непрозрвчность

            setBackground(color);


            setHorizontalAlignment(SwingConstants.CENTER); //горизонтальное вравнивание


        }
    }
}
