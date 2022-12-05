package ru.mirea.lab13_5;

public class Phone {
    private String code, city, tripl, quadro;

    public Phone(String phone) {
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        tripl = phone.substring(phone.length()-7, phone.length()-4);
        quadro = phone.substring(phone.length()-4);

    }

    @Override
    public String toString() {
        return "Phone{" +
                "code='" + code + '\'' +
                ", city='" + city + '\'' +
                ", tripl='" + tripl + '\'' +
                ", quadro='" + quadro + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Phone("88005553535"));
        System.out.println(new Phone("+78005553535"));
        System.out.println(new Phone("+1238005553535"));
        System.out.println(new Phone("+118005553535"));
    }
}
