package com.company;
import java.util.Scanner;
/*
Сначала делал ввод елементоа массива через консоль (соответствующие функции остались)
но поскольку вы сказали , самим инициализировать массив то я сделал это сам
прошу отнестись с пониманием...
изменение размера работает , но поскольку все елементы уже инициализированы , его менять нельзя
Спасибо...
*/
public class Main {


    public static void main(String[] args) {
        // write your code here

        double var = 6123;
        double c5 = var % 5;     // == 3
        double c7 = var % 7;     // == 5
        double c11 = var % 11;     // == 7


        int n=3, m=3;
    /*    Scanner reader = new Scanner(System.in);  // ввод чисел
        System.out.print("Введите размер m и n ");
        n = reader.nextInt();
        m = reader.nextInt();
        if (n<=0 ||m<=0)
            System.out.print("Размер должен быть больше ноля\n");*/


        char [][]A=new char [m][n];
        char [][]B=new char [m][n];


        // инициализация матрицы А

        A[0][0]='j';    A[0][1]='a';     A[0][2]='v';
        A[1][0]='a';    A[1][1]='i';     A[1][2]='s';
        A[2][0]='l';    A[2][1]='o';     A[2][2]='v';

       // вывод матрицы  А
        System.out.print("\nМатрица А\n");
        output(A,m,n);

        //инициализация матрицы В

        B[0][0]='m';    B[0][1]='a';     B[0][2]='x';
        B[1][0]='t';    B[1][1]='u';     B[1][2]='r';
        B[2][0]='e';    B[2][1]='c';     B[2][2]='q';

        // вывод матрицы В
        System.out.print("\nМатрица В\n");
        output(B,m,n);


        System.out.print("\nCумированная матрица А и В (полная сума #лог. или#) \nтипа integer\n");
        int [][] C = modulo_sum(A,B,m,n);

        output_int(C,m+m,n+n);
        sum_min(C,m*2,n*2);
        sum_max(C,m*2,n*2);
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



    public static int [][] modulo_sum(char [][] Arr_A,char [][] Arr_B,int m, int n)
    {
        int [][]Sum_mod=new int [m+m][n+n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n+n; j++)
            {
                if(j>n-1)
                {
                    Sum_mod[i][j]=0;
                }
                else{
                    Sum_mod[i][j]=Arr_A[i][j];
                }
            }


        for (int i = m; i < m*2; i++)
            for (int j = 0; j < n; j++)
            {
                if(j<n-1)
                {
                    Sum_mod[i][j]=0;
                }
            }

        for (int i2=0,i = m; i < m*2; i++,i2++)
            for (int j2=0,j = n; j < n*2; j++,j2++)
            {
                    Sum_mod[i][j]=Arr_B[i2][j2];
            }


            return Sum_mod;
    }

    // вывод матрицы
    public static void output_int(int[][] arr,int m,int n)
    {
        for (int i = 0; i < m; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
        }
    }
   //  сума максимальных элементов
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

// сума минимальных элементов
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
