package com.company;

public class Word {

   public Symbol[] symbol_mas;     //  МАССИВ СИМВОЛОВ
   public String word_str;

    Word(String str)
    {
        word_str=str;
        Word_parsin();
     //   print();
    }




    public void Word_parsin()
    {
          symbol_mas = new Symbol[word_str.length()];
          if(word_str.length()==3)
        for (int i = 0; i < word_str.length(); i++) {
            symbol_mas[i] = new Symbol(word_str.charAt(i));
        }
    }


    public  void print()
    {
        for (int i = 0; i < symbol_mas.length; i++)
        {
            System.out.print(symbol_mas[i]);
        }
    }

}
