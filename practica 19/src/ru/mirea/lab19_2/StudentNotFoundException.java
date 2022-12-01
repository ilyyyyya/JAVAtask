package ru.mirea.lab19_2;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String name){
        super("Student with FIO : " + name + " not found");
    }
}
