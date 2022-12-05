package mirea.lab5_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


    public class GUI implements ActionListener {
        private JFrame frame;
        private JPanel panel;
        private JPanel panel1;

        private JLabel label1;
        private JLabel label2;
        private JLabel label3;

        private JButton button1;
        private JButton button2;

        private int counter1;
        private int counter2;


        private enum Actions{
            Milan,
            Madrid
        }

        public GUI(){

            frame = new JFrame();

            label1 = new JLabel("Result 0 X 0");
            label2 = new JLabel("Last scorer:");
            label3 = new JLabel("Winner: DRAW");

            button1 = new JButton("AC Milan");
            button2 = new JButton("Real Madrid");
            button1.addActionListener(this);
            button1.setActionCommand(Actions.Milan.name());
            button2.addActionListener(this);
            button2.setActionCommand(Actions.Madrid.name());



            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(50, 20, 10, 20));
            panel.setLayout(new GridLayout(1, 0));
            panel.add(button1);
            panel.add(button2);

            panel1 = new JPanel();
            panel1.setBorder(BorderFactory.createEmptyBorder(50,50,10,10));
            panel1.setLayout(new GridLayout(3,0));
            panel1.add(label1);
            panel1.add(label2);
            panel1.add(label3);

            frame.add(panel,BorderLayout.CENTER);
            frame.add(panel1, BorderLayout.NORTH);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setTitle("task1");
            frame.pack();
            frame.setVisible(true);





        }


        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getActionCommand() == "Milan") {
                counter1++;
                label1.setText("Result " + counter1 + " X " + counter2);
                label2.setText("Last scorer: AC Milan");
                if (counter1 > counter2)
                    label3.setText("Winner: AC Milan");
                else if (counter1 < counter2)
                    label3.setText("Winner: Madrid");
                else
                    label3.setText("Winner: Draw");
            }
            else if (event.getActionCommand() == "Madrid"){
                counter2++;
                label1.setText("Result " + counter1 + " X " + counter2);
                label2.setText("Last scorer: Madrid");
                if (counter1 > counter2)
                    label3.setText("Winner: Madrid");
                else if (counter1 < counter2)
                    label3.setText("Winner: Madrid");
                else
                    label3.setText("Winner: Draw");
            }
        }
    }

