package ru.mirea.lab16_2;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {


    private Task2(){
        setSize(500,500);

        JTextArea text = new JTextArea();
        text.setFont(new Font("Times New Roman", Font.PLAIN,14));

        String[] colors = {"Черный", "Красный", "Синий"};
        JComboBox<String> box = new JComboBox<>(colors);
        box.setSelectedIndex(0);

        String[] f = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts = new JComboBox<>(f);
        fonts.setSelectedIndex(0);

        fonts.addItemListener(e-> text.setFont(new Font(f[fonts.getSelectedIndex()],Font.PLAIN,14)));

        box.addItemListener(e -> {
            Color c;
            switch(box.getSelectedIndex()){
                case 1:
                    c = Color.RED;
                    break;
                case 2:
                    c = Color.BLUE;
                    break;
                default:
                    c = Color.BLACK;
            }
            text.setForeground(c);
        });

        getContentPane().add(box,BorderLayout.NORTH);
        getContentPane().add(fonts,BorderLayout.SOUTH);
        getContentPane().add(text);

    }


    public static void main(String[] args) {

        new Task2().setVisible(true);
    }
}
