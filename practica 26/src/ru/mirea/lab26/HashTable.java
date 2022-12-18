package ru.mirea.lab26;

import java.util.HashMap;
import java.util.Map;

public class HashTable {

    public static void main(String[] args) {
        Map<Integer, String> table = new HashMap<Integer, String>();


        table.put(123,"Ivan");
        table.put(34,"Ilya");
        table.put(798,"Kolya");
        table.put(12,"Peter");
        table.put(567,"Mike");
        table.put(999,"Andrew");

        System.out.println("key: 123 value: " + table.get(123));

        System.out.println(table.containsKey(567));

        System.out.println("keys " + table.keySet());

        System.out.println("values " + table.values());

        table.remove(798);
        System.out.println(table.toString());

        System.out.println(table.get(567));





    }
}
