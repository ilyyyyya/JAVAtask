package ru.mirea.lab16_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password implements ActionListener {
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton btn;
    private static JLabel success;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(450,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userlabel = new JLabel("User name:");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        btn = new JButton("Login");
        btn.setBounds(10,90,80,25);
        btn.addActionListener(new Password());
        panel.add(btn);

        success =new JLabel("");
        success.setBounds(85,130,350,25);
        panel.add(success);




        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        success.setFont(new Font("Times New Roman",Font.BOLD,14));

        if(user.equals("Ilya") && password.equals("123abc")){
            success.setText("ЛОГИН И ПАРОЛЬ ВЕРНЫЙ");
        }
        else{
            success.setText("ЛОГИН ИЛИ ПАРОЛЬ НЕПРАВЛЬНЫЙ");
        }
    }
}
