package ru.mirea.lab21_4;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Task4 {

    public static ArrayList<File> readDir (String path) throws IllegalAccessException {
        File f = new File(path);

        if (!f.exists() || !f.isDirectory())
            throw new IllegalAccessException("Not correct path");
        ArrayList<File> listFile = new ArrayList<>();

        Collections.addAll(listFile, f.listFiles());

        try{
            for(int i = 0; i < 5; i++){
                System.out.println(listFile.get(i).getName());
            }
        }catch (Exception e){
            System.out.println("Files in the directory is less than 5");
        }
         return listFile;
    }

    public static void main(String[] args) throws IllegalAccessException {


        ArrayList<File> listFile = readDir(Paths.get("").toAbsolutePath().toString());

        System.out.println(listFile);


    }
}
