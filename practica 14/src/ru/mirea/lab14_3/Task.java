package ru.mirea.lab14_3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static ArrayList<String> findRUE(String s){
        Pattern p = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> a = new ArrayList<>();
        while(m.find()){
            a.add(m.group());
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findRUE("12.3 RUB, jhsdjf22 EUfs3.234USD"));

    }
}
