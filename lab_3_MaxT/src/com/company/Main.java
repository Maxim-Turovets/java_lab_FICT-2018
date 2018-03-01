package com.company;

public class Main {

    public static void main(String[] args) {

        double var=6123;         // номер зачетной книжки

        double c3=var%3;         //   = 0
        double c17=var%17;       //   = 3

    /*    StringBuilder string = new StringBuilder(" ");
        String str=string.toString();


        for (int i=0;i<str.length();i++)
        System.out.print(str.charAt(i));

       // char [] ch = new char [10];
        String []s = new String [100];

       int a=0;
        for (int i=0;i<str.length();i++)
        {
           if(str.charAt(i)!=' ')
           {
               s[a]+=str.charAt(i);
           }
           else {
               a++;
           }


        }

       System.out.print(s[0]);
        System.out.print("\n");
        System.out.print(s[1]);*/

    String str="Привет как дела.Все хорошо.А ты как? Как семья? Как дети ?";
    Parsing(str);

    }





    public static void /*String []*/ Parsing (String str)
    {
        char dtr='?';
        int count = 0,index=0;

        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == dtr)
                count++;
        }


        String [] min_str = new  String [count];
        for(int i=0;i<count;i++)
            min_str[i]="";


        for (int i =0;i<str.length();i++)
          {
            min_str[index]+=str.charAt(i);

            if(str.charAt(i)=='.')
              min_str[index]="";

            if(str.charAt(i)=='?')
            index++;
          }

      //  System.out.print(min_str.length);
          for (int i=0;i<min_str.length;i++) {
              System.out.print(min_str[i]);
              System.out.print("\n");
          }
    }
}