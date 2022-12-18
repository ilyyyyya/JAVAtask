package ru.mirea.lab4_1;

public class SeasonDemo {
    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        System.out.println(season);
        print(Seasons.WINTER);
        printAll();
    }

    public static void print(Seasons season){
        switch(season){
            case WINTER:
                System.out.println("Я люлблю зиму");
                break;
            case SUMMER:
                System.out.println("Я люлблю лето");
                break;
            case SPRING:
                System.out.println("Я люлблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люлблю осень");
                break;
        }

    }
    public static void printAll(){
        for(Seasons s:Seasons.values()){
            System.out.println(s+" "+s.getAvgTmp()+" "+ s.getDescription());
        }
    }
}
