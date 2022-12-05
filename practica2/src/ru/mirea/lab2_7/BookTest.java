package ru.mirea.lab2_7;
import java.util.Date;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("MeinKampf", "You", new Date());
        System.out.println(book);
        book.set_name("1984");
        book.set_writing_date(new Date());
        System.out.println(book);
    }
}
