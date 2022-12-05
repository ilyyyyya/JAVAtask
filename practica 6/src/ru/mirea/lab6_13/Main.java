package ru.mirea.lab6_13;

public class Main {
    public static void main(String[] args) {
        OvservableStringBuilder UndobleStringBuilder =
                new OvservableStringBuilder();

        char[] mas = "HFKJHFKJ".toCharArray();
        UndobleStringBuilder.setOnChangeListener(new MyListener());
        System.out.println("append");
        UndobleStringBuilder.append("Hello");
        UndobleStringBuilder.append(", ");
        UndobleStringBuilder.append("World!");

        System.out.println("replace");
        UndobleStringBuilder.replace(1,4,"test");

        System.out.println("insert");
        UndobleStringBuilder.insert(10,mas,0,2);

    }
}
