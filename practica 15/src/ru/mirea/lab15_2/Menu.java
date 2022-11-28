package ru.mirea.lab15_2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static void main(String[] args) {
        String[] optionsChoose = {"Greece", "Denmark" ,
                "Belgium" , "Russia"};
        JFrame frame = new JFrame();

        JComboBox<String> box = new JComboBox<>(optionsChoose);
        box.setBounds(120, 50, 140, 20);

        JButton btn = new JButton("Get info");
        btn.setBounds(140, 100, 100, 20);


        JLabel text = new JLabel();
        text.setBounds(90, 100, 100, 100);




        frame.add(box);
        frame.add(btn);
        frame.add(text);

        //frame.setLayout(new FlowLayout());
        frame.setSize(400,400);
        frame.setVisible(true);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = "Греция расположена на Балканском полуострове и многочисленных островах. \nИмеет сухопутную границу с Албанией на северо-западе, Северной Македонией и Болгарией на севере, с Турцией на северо-востоке. \nОмывается Эгейским (включая Икарийское и Фракийское моря) морем на востоке, Ионическим на западе, на юге — Средиземным и Критским морями.";
                String str2 = "Дания — самая южная из скандинавских стран; расположена к юго-западу от Швеции и к югу от Норвегии, \nс юга граничит с Германией по суше. Дания омывается Балтийским и Северным морями.";
                String str3 = "Граничит на севере с Нидерландами, на востоке — с Германией, на юго-востоке — с Люксембургом, и с \nФранцией — на юге и западе. Омывается Северным морем на северо-западе.";
                String str4 = "Крупнейшее в мире государство,занимающее 1/8 часть суши и расположенное на северо-востоке Евразии. \nРоссия — страна с многовековой историей, богатым культурным наследием и щедрой природой. В России можно найти почти всё то, что встречает путешественник по отдельности в той или иной \nстране — солнечные пляжи субтропиков и снежные горные вершины, бескрайние степи и глухие леса, бурные реки и тёплые моря.";
                int w = 175;

                if(box.getItemAt(box.getSelectedIndex()) == "Russia"){
                    //text.setText(str4);


                    JOptionPane.showMessageDialog(null, String.format(str4, w, w));
                }
                if(box.getItemAt(box.getSelectedIndex()) == "Greece"){
                    //text.setText(str1);
                    JOptionPane.showMessageDialog(null, String.format(str1, w, w));
                }
                if(box.getItemAt(box.getSelectedIndex()) == "Denmark"){
                    //text.setText(str2);
                    JOptionPane.showMessageDialog(null, String.format(str2, w, w));
                }
                if(box.getItemAt(box.getSelectedIndex()) == "Belgium"){
                   //text.setText(str3);
                    JOptionPane.showMessageDialog(null, String.format(str3, w, w));
                }

            }
        });


    }
}
