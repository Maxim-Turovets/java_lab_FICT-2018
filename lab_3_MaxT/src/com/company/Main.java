package com.company;

public class Main {

    public static void main(String[] args) {

        double var = 6123;         // номер зачетной книжки

        double c3 = var % 3;         //   = 0
        double c17 = var % 17;       //   = 3

    /*    StringBuilder string = new StringBuilder(" ");
        String str=string.toString();

        }*/
        System.out.print("ВАШ ТЕКСТ\n\n");

        String str =
                "Филип улыбнулся.\n" +
                        "Этот художник своей жизни явно не смог создать для себя ничего, кроме уродливого прозябания.\n" +
                        "Кроншоу на него поглядел и наполнил свой стакан.\n" +
                        " Он послал официанта за пачкой сигарет.\n" +
                        "— Помилуйте, это ведь сложный вопрос.А как бы бы вы сами на него ответили?\n" +
                        "— Никак, потому что ответ этот каждый должен найти для себя сам.Но для чего, по-вашему, вы родились на свет божий?\n";

        System.out.print(str);
        System.out.print("\n\nВопросительные предложения :\n");

        String[] string_array = Parsing(str, '?');   // нахождение вопросителных предложений
        output(string_array);                            // вывод  вопросительных предложений

        wordLenght(string_array);
    }


    public static String[] Parsing(String str, char dtr) {
        int count = 1, index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == dtr)
                count++;
        }


        String[] min_str = new String[count];
        for (int i = 0; i < count; i++)
            min_str[i] = "";


        for (int i = 0; i < str.length(); i++) {
            min_str[index] += str.charAt(i);

            if (str.charAt(i) == '.')
                min_str[index] = "";

            if (str.charAt(i) == dtr)
                index++;
        }

        return min_str;
    }

    public static void output(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            System.out.print("\n");
        }
    }

    public static void wordLenght(String[] str) {
        /*for (int i=0;i<str.length;i++)
        {*/
        String[] string_array = Parsing(str[0], ' ');
        String[] s= string_array;
      /*  for (int i = 0; i < string_array.length; i++) {
            for (int j = 0; j < s.length; j++) {
               if(i!=j && compare(string_array[i],s[j])==true)
                   System.out.print( string_array[j]);
            }
        }*/
      //  output(string_array);

        //}

        for (int i=0;i<string_array.length;i++)
        {
            for(int j=0;j<string_array.length;j++)
            {
                if(i!=j && compare(string_array[i],string_array[j])==true)
                {
                    string_array[i]="";
                    s[i]="";
                    System.out.print(string_array[j]);
                }
            }
        }
      //  output(string_array);
    }

    public static boolean compare(String str1, String str2) {
        boolean ret=true;

        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
          if(str1.charAt(i)==str2.charAt(i))
              ret=true;
          else
              ret=false;
        }


        return  ret;
    }


}