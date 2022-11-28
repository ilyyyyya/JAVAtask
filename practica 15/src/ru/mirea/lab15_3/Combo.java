package ru.mirea.lab15_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Combo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 3");

        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);

        JMenu menu2 = new JMenu("Help");
        menu2.setMnemonic(KeyEvent.VK_H);


        JMenuBar bar1 = new JMenuBar();
        JMenuItem a1 = new JMenuItem("Save");
        JMenuItem a2 = new JMenuItem("Exit");
        JMenu edit = new JMenu("Edit");

        JMenuItem item1 = new JMenuItem("Copy");
        JMenuItem item2 = new JMenuItem("Cut");
        JMenuItem item3 = new JMenuItem("Paste");
        edit.add(item1);
        edit.add(item2);
        edit.add(item3);

        menu.add(a1);
        menu.add(a2);
        menu.add(edit);

        bar1.add(menu);
        bar1.add(menu2);

        JMenuItem b1 = new JMenuItem("Copy");
        JMenuItem b2 = new JMenuItem("Cut");
        JMenuItem b3 = new JMenuItem("Paste");


        JButton btn1 = new JButton("button 1");

        JButton btn2 = new JButton("button 2");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(90, 20, 10, 20));
        panel.setLayout(new GridLayout(1,0));
        panel.add(btn1);
        panel.add(btn2);

        JTextArea text = new JTextArea(
                "This is an editable JTextArea. " +
                        "A text area is a plain text component, " +
                        "which means that although it can display text " +
                        "in any font, all of the text is in the same font."
        );
        text.setFont(new Font("New Times Roman",Font.BOLD,14));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        JScrollPane sc =new JScrollPane();


        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 20));
        panel1.setLayout(new GridLayout(0,1));
        panel1.add(text);




        frame.add(panel,BorderLayout.CENTER);
        frame.add(panel1,BorderLayout.NORTH);
        frame.setJMenuBar(bar1);
        frame.setSize(350,350);
        frame.setVisible(true);
    }


}
