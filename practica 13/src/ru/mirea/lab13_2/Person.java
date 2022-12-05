package ru.mirea.lab13_2;

public class Person {
    private String Surname;
    private String Name;
    private String SecondName;

    public Person(String surname, String name, String secondName) {
        Surname = surname;
        Name = name;
        SecondName = secondName;
    }

    public Person(String surname) {
        Surname = surname;
    }

    public String getFIO(){
        StringBuilder str = new StringBuilder(Surname);
        if(Name != null && !Name.equals(""))
            str.append("  ").append(Name);
        if(SecondName != null && !SecondName.equals(""))
            str.append("  ").append(SecondName);
        return str.toString();
    }



    public static void main(String[] args) {
        Person p1 = new Person("Cоловьёв");
        Person p2 = new Person("", "Роман", "");
        Person p3 = new Person("Романов", "Николай", "Александрович");

        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
    }
}
