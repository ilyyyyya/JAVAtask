package ru.mirea.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LabExample extends JFrame{
        JTextField text1 = new JTextField(10);
        JTextField text2 = new JTextField(10);
        JButton button1 = new JButton("add");
        JButton button2 = new JButton("subtraction");
        JButton button3 = new JButton("multiplication");
        JButton button4 = new JButton("division");
        Font fnt = new Font("Times new roman",Font.BOLD,16);

    LabExample(){
            super("Calculator");
            setSize(250,250);
            setLayout(new FlowLayout());
            text1.setFont(fnt);
            text2.setFont(fnt);

            add(new JLabel("1st Number"));
            add(text1);

            add(new JLabel("2st number"));
            add(text2);


            add(button1);
            add(button2);
            add(button3);
            add(button4);

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        double x1 = Double.parseDouble(text1.getText().trim());
                        double x2 = Double.parseDouble(text2.getText().trim());

                        JOptionPane.showMessageDialog(null,"Result = "
                        + (x1+x2), "Allert",JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch (Exception ex){
                        JOptionPane.showMessageDialog( null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);

                    }
                }
            });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(text1.getText().trim());
                    double x2 = Double.parseDouble(text2.getText().trim());

                    JOptionPane.showMessageDialog(null,"Result = "
                            + (x1-x2), "Allert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(text1.getText().trim());
                    double x2 = Double.parseDouble(text2.getText().trim());

                    JOptionPane.showMessageDialog(null,"Result = "
                            + (x1*x2), "Allert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(text1.getText().trim());
                    double x2 = Double.parseDouble(text2.getText().trim());

                    JOptionPane.showMessageDialog(null,"Result = "
                            + (x1/x2), "Allert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        setVisible(true);
        }

    public static void main(String[] args) {
        new LabExample();
    }

}

