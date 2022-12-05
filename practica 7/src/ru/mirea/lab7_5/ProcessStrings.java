package ru.mirea.lab7_5;

public class ProcessStrings implements StringWork{




    @Override
    public void CountSumbols(String s) {
        int len = s.length();
        System.out.println(len);
    }

    @Override
    public String NewString(String s) {
        String odd = "";
        for(int j =0;j<s.length();j++)
        {
            if(j %2 == 0){
                odd += s.charAt(j);
            }
        }
        return odd;
    }

    @Override
    public void ReverseString(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(reverse);
    }
}
