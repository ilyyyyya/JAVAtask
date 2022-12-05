package ru.mirea.lab17_3;

public class App {
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View("TASK 3");
        Controller c = new Controller(m,v);
        c.initController();
    }
}
