package com.company;

public class Text {

    public String Text_str;
    public Sentence Sentence_mas[];    //  МАССИВ ПРЕДЛОЖЕНИЙ

    Text (String str){
        Text_str = str;
        Text_parsing();
    };

    // Парсим текст  состоящий с объектов "предложения"
    public void Text_parsing(){

        while(Text_str.contains("  ")) {
            String replace = Text_str.replace("  ", " ");
            Text_str=replace;
        }

        int count=1;

        // кол-во предложений
        for(int i=0 ;i<Text_str.length();i++)
        {
            if(Text_str.charAt(i)=='?'||Text_str.charAt(i)=='!'||Text_str.charAt(i)=='.')
            {
                count++;
            }
        }

        //новый масив
         Sentence_mas = new Sentence [count];

        Punctuation ob = new Punctuation();
        int index=0;
        String temp="";

        for(int i=0 ;i<Text_str.length();i++)
        {

            temp+= Text_str.charAt(i);

            if (Text_str.charAt(i) == ob.punctuation_mas[0] ) {
                Sentence_mas[index] = new Sentence(temp);
                index++;
                temp="";

            }

            if (Text_str.charAt(i) == ob.punctuation_mas[1] ) {
                Sentence_mas[index] = new Sentence(temp);
                index++;
                temp="";
            }


            if (Text_str.charAt(i) == ob.punctuation_mas[2] ) {
                Sentence_mas[index] = new Sentence(temp);
                index++;
                temp="";
            }
        }
    }










}
