package ru.mirea.lab17_3;

import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JTextField firstnameText;
    private JTextField lastnameText;
    private JButton firstnameBTN;
    private JButton lastnameBTN;
    private JButton hello;
    private JButton bye;

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getFirstnameLabel() {
        return firstnameLabel;
    }

    public void setFirstnameLabel(JLabel firstnameLabel) {
        this.firstnameLabel = firstnameLabel;
    }

    public JLabel getLastnameLabel() {
        return lastnameLabel;
    }

    public void setLastnameLabel(JLabel lastnameLabel) {
        this.lastnameLabel = lastnameLabel;
    }

    public JTextField getFirstnameText() {
        return firstnameText;
    }

    public void setFirstnameText(JTextField firstnameText) {
        this.firstnameText = firstnameText;
    }

    public JTextField getLastnameText() {
        return lastnameText;
    }

    public void setLastnameText(JTextField lastnameText) {
        this.lastnameText = lastnameText;
    }

    public JButton getFirstnameBTN() {
        return firstnameBTN;
    }

    public void setFirstnameBTN(JButton firstnameBTN) {
        this.firstnameBTN = firstnameBTN;
    }

    public JButton getLastnameBTN() {
        return lastnameBTN;
    }

    public void setLastnameBTN(JButton lastnameBTN) {
        this.lastnameBTN = lastnameBTN;
    }

    public JButton getHello() {
        return hello;
    }

    public void setHello(JButton hello) {
        this.hello = hello;
    }

    public JButton getBye() {
        return bye;
    }

    public void setBye(JButton bye) {
        this.bye = bye;
    }

    public View(String title){
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        firstnameLabel = new JLabel("Имя");
        lastnameLabel = new JLabel("Фамилия");
        firstnameText = new JTextField();
        lastnameText = new JTextField();
        firstnameBTN = new JButton("Сохранить Имя");
        lastnameBTN = new JButton("Сохранить Фамилию");
        hello = new JButton("Привет");
        bye = new JButton("Пока");


        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()

                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(firstnameLabel).addComponent(lastnameLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameText)
                        .addComponent(lastnameText))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameBTN)
                        .addComponent(lastnameBTN))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(hello)
                        .addComponent(bye)));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(firstnameLabel)
                        .addComponent(firstnameText).addComponent(firstnameBTN).addComponent(hello))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lastnameLabel)
                        .addComponent(lastnameText).addComponent(lastnameBTN).addComponent(bye)));
        layout.linkSize(SwingConstants.HORIZONTAL, firstnameBTN, lastnameBTN);
        layout.linkSize(SwingConstants.HORIZONTAL, hello, bye);
        frame.getContentPane().setLayout(layout);




    }


}
