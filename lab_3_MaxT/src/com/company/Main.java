package com.company;

public class Main {

    public static void main(String[] args) {

        double var=6123;         // номер зачетной книжки

        double c3=var%3;         //   = 0
        double c17=var%17;       //   = 3

    /*    StringBuilder string = new StringBuilder(" ");
        String str=string.toString();

        }*/
System.out.print("ВАШ ТЕКСТ\n\n");

    String str=
            "Филип улыбнулся.\n"+
            "Этот художник своей жизни явно не смог создать для себя ничего, кроме уродливого прозябания.\n" +
            "Кроншоу на него поглядел и наполнил свой стакан.\n" +
            " Он послал официанта за пачкой сигарет.\n"+
                    "— Помилуйте, это ведь сложный вопрос. А как бы вы сами на него ответили?\n"+
                    "— Никак, потому что ответ этот каждый должен найти для себя сам. Но для чего, по-вашему, вы родились на свет божий?\n";

        System.out.print(str);
        System.out.print("\n\nВопросительные предложения :\n");
        Parsing(str);

    }





    public static void /*String []*/ Parsing (String str)
    {
        char dtr='?';
        int count = 1,index=0;

        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == dtr)
                count++;
        }


        String [] min_str = new  String [count];
        for(int i=0;i<count;i++)
            min_str[i]="";



        for (int i=0;i<str.length();i++)
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