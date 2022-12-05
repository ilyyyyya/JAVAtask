package ru.mirea.lab3_5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Formatter;

public class Report {

    private ArrayList<Employee> mas = new ArrayList<Employee>();
    int size;
    int count=0;
    Scanner sc = new Scanner(System.in);

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }

    public void addPerson()
    {
        if(size>count)
        {
            Employee person = new Employee();
            System.out.println("Введите ФИО работника: ");
            if(count >0) sc.nextLine();
            person.setFullName(sc.nextLine());
            System.out.println("Введите его зарполату: ");
            person.setSalary(sc.nextInt());
            mas.add(person);
            count++;
            System.out.println("этот объект добавлен в массив!");

        }
        else {
            System.out.println("Нельзя добавить объект");
        }

    }
    public String generateReport(int i){
        return String.format("У данного сотрудника: %s \tЗарплата: %15d" ,mas.get(i).getFullName(),mas.get(i).getSalary());

    }



}
