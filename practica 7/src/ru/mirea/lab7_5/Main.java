package ru.mirea.lab7_5;

public class Main {
    public static void main(String[] args) {
        StringWork s1 = new ProcessStrings();
        String s = "dkjhfskjfsdhfksdjkfh";
        System.out.print("[+] Count symbols in string:  ");
        s1.CountSumbols(s);
        System.out.print("[+] Reverse string:  ");
        s1.ReverseString(s);
        System.out.println("[+] String with odd symbols:  " +s1.NewString(s));

    }
}
