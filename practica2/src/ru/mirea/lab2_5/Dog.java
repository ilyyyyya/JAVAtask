package ru.mirea.lab2_5;

public class Dog {
    private String name;
    private int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Object Dog с именем : " + this.name+ " был создан");
    }
    public void setAge(int age){
        if(age > 0 && age <100){
            this.age=age;
            System.out.println("Возраст собаки установлен как: " + this.age);
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name=name;
        System.out.println("Имя собаки установлена как " + this.name);
    }
    public String getName(){
        return this.name;
    }
    public int getHumanAge(){
        return this.age * 7;
    }
    public String toString(){
        return "Собака " + this.name +
                " с возрастом " + this.age;
    }


}
