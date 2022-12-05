package ru.mirea.lab2_6;

public class CirlceTest {
    public static void main(String[] args){
        Circle2 okr1 = new Circle2();
        System.out.println(okr1);
        Circle2 okr2 = new Circle2(2,-2,15);
        System.out.println(okr2);
        System.out.println("Площадь второго круга: "+okr2.square());
        System.out.println("Длина второго круга: "+okr2.circum());
        okr1.moveCircle2(2,-2);
        okr1.zoomCircle2(15);
        if(okr1.equals(okr2)){
            System.out.println("Круги одинаковые!");
        }
        else{
            System.out.println("Круги разные!");
        }

    }
}
