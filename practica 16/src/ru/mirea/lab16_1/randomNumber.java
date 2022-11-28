package ru.mirea.lab16_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class randomNumber implements ActionListener {

    private static JLabel text;
    private static JLabel correct;
    private static JLabel counter;
    private static JTextField number;
    private static JButton btn;
    private static int rndNum;

    private int chance=3;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        text = new JLabel("Введи число(от 0 - 20) которое я загадал(У  вас 3 попытки!!!!!)");
        text.setBounds(10,-30,600,100);
        panel.add(text);

        number = new JTextField();
        number.setBounds(10,40,90,20);
        panel.add(number);

        btn = new JButton("SEND");
        btn.setBounds(10,70,80,20);
        btn.addActionListener(new randomNumber());
        panel.add(btn);

        correct = new JLabel();
        correct.setBounds(50,90,500,30);
        panel.add(correct);

        counter = new JLabel();
        counter.setBounds(50,110,400,30);
        panel.add(counter);


        frame.setVisible(true);
        int max = 20;
        rndNum = rnd(max);
        System.out.println(rndNum);
    }

    public static int rnd(int max){
        return (int) (Math.random() * max);
    }

    public void loseGame(){
        showMessageDialog(null, "Ты проиграл");
        System.exit(0);
    }

    public void winGame(){
        showMessageDialog(null, "Ура ты выиграл");
        System.exit(0);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(chance > 1){
            String message = "";
            try{
                int num = Integer.parseInt(number.getText());
                if(num == rndNum) {
                    message += "Вы угадали";
                    correct.setText(message);
                    winGame();
                }
                else if (num < rndNum) {
                    message += "Ваше число меньше загаданного";
                    

                }
                else {
                    message += "Ваше число больше загаданного";

                }
                chance--;


            }catch (Exception ex){
                message = "Пустое поле это не число! Введите целое число от 0 до 20.";
            }
            finally {
                correct.setText(message);
                counter.setText("У тебя осталось попыток: " + chance);
            }


        }
        else{
            chance--;
            counter.setText("У тебя отсалось попыток: " + chance);
            loseGame();
        }


    }
}
