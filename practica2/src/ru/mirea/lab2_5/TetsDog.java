package ru.mirea.lab2_5;

public class TetsDog {
    public static void main(String[] args){
        Dog grey = new Dog("Грей", 5);
        grey.setAge(7);
        grey.setName("Голд");
        System.out.println(grey);

        Dog dogs[] = {new Dog("Шарик",6), new Dog("Бобик",18),new Dog("Вольт",9)};

        PitomnikDog pitomnikdog = new PitomnikDog();
        System.out.println(pitomnikdog);

        pitomnikdog.addDogs(dogs);
        System.out.println(pitomnikdog);
    }
}
