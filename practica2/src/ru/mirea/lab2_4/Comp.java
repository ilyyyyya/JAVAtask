package ru.mirea.lab2_4;

public class Comp {
    private String name;
    private int article;

    Comp(String name, int article){
        this.name = name;
        this.article = article;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setArt(int article){
        this.article=article;
    }
    public int getArt(){
        return this.article;
    }
    public String toString(){
        return "Компьютер " + this.name +
                " с артикулем " + this.article;
    }
}
