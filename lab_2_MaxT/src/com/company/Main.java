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
        char [][]B=new char [m][n];
        



        //init(A,m,n,reader);
      //  init(B,m,n,reader);

        //System.out.print("\nМатрица А\n");
        //output(A,m,n);
       // System.out.print("\nМатрица В\n");
        //output(B,m,n);


        //System.out.print("\nCумированная матрица по модулю 2 \nтипа integer\n");
        //int [][] C = modulo_sum(A,B,m,n);
        int max=0;
        output_int(S,m,n);
        sum_min(S,m,n);
        sum_max(S,m,n);



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
        for (int i = 0; i < m; i++) {
           System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
        }
    }

    public static int cast_int (char type)
    {
        int swap;
        swap=(int)type;
        return  swap;
    }

    public static char  [][]cast_char (int [][] Arr,int m , int n)
    {
        char [][] Arr2 = new char [m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                Arr2[i][j] = (char)Arr[i][j];
            }
            return Arr2;
    }


    public static int [][] modulo_sum(char [][] Arr_A,char [][] Arr_B,int m, int n)
    {
        int [][]Sum_mod=new int [m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
            {
                Sum_mod[i][j]=cast_int(Arr_A[i][j])^cast_int(Arr_B[i][j]);
            }
            return Sum_mod;
    }

    public static void output_int(int[][] arr,int m,int n)
    {
        for (int i = 0; i < m; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
        }
    }

    public static void sum_max(int[][] arr,int m,int n)
    {
        int max,sum=0;

        for (int i=0;i<m;i+=2)
        {
            max=arr[0][i];
            for(int j=0;j<n;j++) {
                if (max < arr[j][i]) {
                    max = arr[j][i];
                }
            }
            sum+=max;
            max=0;
        }
        System.out.print("\nCума максимальных элементов нечетных столбцов = ");
        System.out.print(sum);
        System.out.print("\n");
    }

    public static void sum_min(int[][] arr,int m,int n)
    {
        int min,sum=0;

        for (int i=1;i<m;i+=2)
        {
            min=arr[0][i];
            for(int j=0;j<n;j++) {
                if (min > arr[j][i]) {
                    min = arr[j][i];
                }
            }
            sum+=min;
            min=0;
        }
        System.out.print("\nCума минимальных элементов четных столбцов = ");
        System.out.print(sum);
        System.out.print("\n");
    }


}