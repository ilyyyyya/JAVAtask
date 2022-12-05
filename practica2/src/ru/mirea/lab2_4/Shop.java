package ru.mirea.lab2_4;

import ru.mirea.lab2_5.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {


    private List<Comp> compArray = new ArrayList<Comp>();

    public void addComp(Comp computer){
        this.compArray.add(computer);
        System.out.println(computer+"");
    }


    public void deleteComp(int index){
        System.out.println("ПК " +  this.compArray.get(index) + " удален успешно");
        this.compArray.remove(index);


    }

    public int findindex(String name) {
        for (Comp computer : compArray) {
            if (computer.getName().equals(name)) {
                return compArray.indexOf(computer);
            }
        }
        return -1;
    }


    public String toString(){
        if(!this.compArray.isEmpty())
            return "Магазин компьютеров:" + this.compArray;
        else
            return "Магазин пуст!";

    }

}


