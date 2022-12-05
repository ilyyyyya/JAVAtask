package ru.mirea.lab2_5;
import java.util.*;

public class PitomnikDog {
    private List<Dog> dogArray = new ArrayList<Dog>();{

        System.out.println("Питомник собак создан");
    }
   public void addDog(Dog dog){
        this.dogArray.add(dog);
        System.out.println(dog+". Эта собака была добавлена в питомник");
    }
    public void addDogs(Dog dogs[]){
        this.dogArray.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
        System.out.println("Собаки: " + Arrays.toString(dogs) + " добавлены в питомник");
    }
    public String toString(){
        if(!this.dogArray.isEmpty())
            return "Питомник собак:" + this.dogArray;
        else
            return "Питомник собак пуст!";

    }

}
