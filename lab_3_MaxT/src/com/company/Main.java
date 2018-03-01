package com.company;

public class Main {

    public static void main(String[] args) {

        double var = 6123;
        double c3 = var % 3;
        double c17 = var % 17;



       String str=
               "Вы уверены что правильно поступаете ?\n"+
               "Мы не можем быть всегда уверены что делаем  это правильно.\n"+
               "А это правда - правда  вы не такой как все ?\n"+
               "Мне кажется, это не столь важно.\n"+ "Думаете ?\n";


        System.out.print("ВАШ ТЕКСТ\n\n");


        System.out.print(str);
        System.out.print("\n\nВопросительные предложения :\n");

        String[] string_array = Parsing(str, '?');   // нахождение вопросителных предложений
        output(string_array);                            // вывод  вопросительных предложений

        System.out.print("Вывод слов заданной длинны в предложении\n"); // в данном случае длинна
        wordLenght(string_array,3);                                 // = 3
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

    public static void wordLenght(String[] str,int len) {// печать слова указаной длинны без дубликатов
        if(len<=0)
            System.out.print("Не коректные данные");
        else {
            for (int k = 0; k < str.length; k++) {
                String[] string_array = Parsing(str[k], ' ');

                for (int i = 0; i < string_array.length; i++)     // удаление дубликатов
                    for (int j = 0; j < string_array.length; j++)
                        if (i != j && compare(string_array[i], string_array[j]) == true)
                            string_array[i] = "";

                for (int i = 0; i < string_array.length; i++) {
                    if (string_array[i].length() == len + 1) {
                        System.out.print("Предложение №");
                        System.out.print(k + 1);
                        System.out.print(" Слово : ");
                        System.out.print(string_array[i]);
                        System.out.print("\n");
                    }
                }

            }
        }
    }

    public static boolean compare(String str1, String str2) {
        boolean ret=true;

        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
          if(str1.charAt(i)==str2.charAt(i))
              ret=true;
          else
              return false;
        }

        return  ret;
    }


}