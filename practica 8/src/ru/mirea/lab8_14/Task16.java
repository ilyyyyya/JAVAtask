package ru.mirea.lab8_14;

import java.io.Console;
import java.util.Scanner;

public class Task16 {
  public static void recursion(int max,int count) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      //базовый случай
      if (n > 0) {
          if (n > max)//шаг рекурсии
          {
              recursion(n, 1);
          } else if (n == max)//шаг рекусрии
          {
              recursion(max, ++count);
          } else {
              recursion(n, max);
          }
      } else {
          System.out.println(count);
      }
  }

    public static void main(String[] args) {
        recursion(0,0);
    }
}
