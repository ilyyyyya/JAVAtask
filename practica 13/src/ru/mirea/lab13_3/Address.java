package ru.mirea.lab13_3;

import java.util.StringTokenizer;

public class Address {
    private String country, region , city, street, house, housing, flat;

    public Address(String str , boolean divider){
        if(str == null) throw new NullPointerException();
        String[] s;
        if(divider){
            StringTokenizer st = new StringTokenizer(str,",.;");
            s = new String[st.countTokens()];
            int i =0;
            while(st.hasMoreTokens()) s[i++] = st.nextToken();
        }else{
            s = str.split(",");
        }

        if(s.length < 7) throw new IllegalStateException("строка содержит недостаточно данных");
        //удаляю пробелы вначале и конце
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();


    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address a1 = new Address("Россия, МО ,    Москва, проспект Вернадского, 78, 7, Г-226-2", false);
        Address a2 = new Address("Великобритания, Лондон, Лондон, Травалгар площадь, 2, 3, 4, 67549,,,,", false);
        Address a3 = new Address("Россия; МО;     Москва   . Осенний бултвар, 12, 4. 658",true);
        Address a4 = new Address("Россия,      Ленинградская область', СПБ.    Невский проспект; 234;1;23", true);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
