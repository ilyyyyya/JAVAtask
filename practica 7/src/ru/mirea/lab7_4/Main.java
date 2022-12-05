package ru.mirea.lab7_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc(4,5);
        int radius = 3;
        double area = mc1.PI() *(radius*radius);
        System.out.println("[+] The area of the circle is: " + area);
        Scanner sc = new Scanner(System.in);
        System.out.println("[+] Enter the edge of the cube:");
        double a = sc.nextDouble();
        System.out.println("[+] Cube Formula V = a^3, V = " + mc1.Degree(a,3));

        System.out.println("[+] Modulus of a complex number " + mc1.ComNum());


    }
}
