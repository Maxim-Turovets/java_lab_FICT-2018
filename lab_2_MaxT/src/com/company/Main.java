package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        double var = 6123;
        double c5 = var % 5;     // == 3
        double c7 = var % 7;     // == 5
        double c11 = var % 11;     // == 7


        int n, m;
        Scanner reader = new Scanner(System.in);  // ввод чисел
        System.out.print("Введите n и m ");
        n = reader.nextInt();
        m = reader.nextInt();

        char [][]A=new char [m][n];

        init(A,m,n,reader);
        output(A,m,n);


      /*int a;
      char b=' ';
      a=(int) b;

      System.out.print(a);*/

    }



    //   функция инициализации  массива
    public static void init(char[][] arr,int m, int n,Scanner reader)
    {
        System.out.print("Введите элементы массива :\n");

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                arr[i][j] = reader.next().charAt(0);
            }

    }
    
   //  функция вывода матрицы
    public static void output(char[][] arr,int m,int n)
    {
        System.out.print("Матрица :\n");
        for (int i = 0; i < m; i++) {
           System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
        }
    }


}