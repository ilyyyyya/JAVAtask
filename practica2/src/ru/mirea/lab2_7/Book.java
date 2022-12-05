package ru.mirea.lab2_7;
import java.util.Date;

public class Book {
    private String name;
    private String author;
    private Date bookWritingDate = new Date();

    Book(String name,String author, Date bookWritingDate){
        this.name=name;
        this.author=author;
        this.bookWritingDate = bookWritingDate;
        System.out.println("Книга создана");

    }
    String get_name(){
        return this.name;
    }
    void set_name(String name){
        this.name=name;
    }
    String get_author(){
        return this.author;
    }
    void set_author(String author){
        this.author=author;
    }
    Date get_writing_date(){
        return this.bookWritingDate;
    }
    void set_writing_date(Date bookWritingDate){
        this.bookWritingDate.setTime(bookWritingDate.getTime());
    }
    public String toString() {
        return "Book name: " + this.name + ", author: " + this.author + ", writing date: " + this.bookWritingDate;
    }
}
