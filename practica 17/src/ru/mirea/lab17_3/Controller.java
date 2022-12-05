package ru.mirea.lab17_3;

import javax.swing.*;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        initView();
    }

    public void initView(){
        view.getFirstnameText().setText(model.getFirstname());
        view.getLastnameText().setText(model.getLastname());
    }
    public void initController(){
        view.getFirstnameBTN().addActionListener(e ->
                saveFirstname());
        view.getLastnameBTN().addActionListener(e ->
                saveLastname());
        view.getHello().addActionListener( e ->
                sayHello());
        view.getBye().addActionListener(e ->
                sayBye());
    }

    private void saveFirstname(){
        model.setFirstname(view.getFirstnameText().getText());
        JOptionPane.showMessageDialog(null, "Имя сохранено : " + model.getFirstname(), "ИНФО", JOptionPane.INFORMATION_MESSAGE);
    }

    private void saveLastname(){
        model.setLastname(view.getLastnameText().getText());
        JOptionPane.showMessageDialog(null,"Фамилия сохранена : " + model.getLastname(), "ИНФО",JOptionPane.INFORMATION_MESSAGE);
    }

    private void sayHello(){
        JOptionPane.showMessageDialog(null, "Привет " + model.getFirstname() +" " + model.getLastname(), "INFO", JOptionPane.INFORMATION_MESSAGE);
    }
    private void sayBye(){
        System.exit(0);
    }

}
