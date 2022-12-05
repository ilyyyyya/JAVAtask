package ru.mirea.lab18;

public class ThrowsDemo {
    public static void main(String[] args) {
        //printMessage("adadad");
        //getDetails("");
        System.out.println(getDetails(null));

    }
    /*public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }*/
    public static String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        return "1";
    }
}
