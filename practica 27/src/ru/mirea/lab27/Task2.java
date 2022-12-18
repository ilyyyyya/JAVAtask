package ru.mirea.lab27;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(getSameFirstNameCount(createMap(),"Name"));
        System.out.println(getSameLastNameCount(createMap(),"Surname6"));
    }

    public static HashMap<String, String> createMap()
    {
        Map<String,String> map = new HashMap<String,String>();
        for(int i = 0; i < 10; i++){
            map.put("Surname" + i, "Name");
        }

        return (HashMap<String, String>) map;
    }

    public static int getSameFirstNameCount(HashMap<String,String> map, String name)
    {
        int count=0;
        for(Map.Entry<String,String> pair : map.entrySet())
        {
            if(pair.getValue().equals(name))
                count++;
        }
        return count;

    }

    public static int getSameLastNameCount (HashMap<String,String> map, String LastName)
    {
        int count = 0;
        for(Map.Entry<String,String> pair : map.entrySet())
        {
            if(pair.getKey().equals(LastName))
                count++;

        }
        return count;
    }
}
