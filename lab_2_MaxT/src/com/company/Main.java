package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        double var = 6123;
        double c5 = var%5;     // == 3
        double c7 = var%7;     // == 5
        double c11=var%11;     // == 7

        int n,m;

        Scanner reader = new Scanner(System.in);  // ввод чисел
        System.out.print("Введите n и m ");
        n = reader.nextInt();
        m = reader.nextInt();

        char [][] mass_A = new char [n][m];
        char [][] mass_B = new char [n][m];

        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
            {
                mass_A[i][j]=reader.next().charAt(0);
            }

        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
            {
                System.out.print( mass_A[i][j]);
            }

      /*int a;
      char b=' ';
      a=(int) b;

      System.out.print(a);*/

    }
}
