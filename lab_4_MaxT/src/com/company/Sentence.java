package com.company;

public class Sentence {


    public  Word word_mas[];
    public String sentence_str;   // МАССИВ СЛОВ


    Sentence(String str){
        sentence_str=str;
        Sentence_parsin();
        Parsing();
    }

    // Парсим предложения как массив "слов"
    public void Sentence_parsin() {
        int count=1;
        String temp="";
        int index=0;
        for (int i = 0; i < sentence_str.length(); i++) {
            if (sentence_str.charAt(i) == ' ' || sentence_str.charAt(i) == '\n') {
                count++;
            }
        }

        Punctuation ob = new Punctuation();
        word_mas = new Word[count];

        for (int i = 0; i < sentence_str.length(); i++) {
            temp += sentence_str.charAt(i);

            if (sentence_str.charAt(i) == ob.punctuation_mas[0]) {
                word_mas[index] = new Word(temp);
                index++;
                temp = "";
            }

            if (sentence_str.charAt(i) == ob.punctuation_mas[1]) {
                word_mas[index] = new Word(temp);
                index++;
                temp = "";
            }

            if (sentence_str.charAt(i) == ob.punctuation_mas[2]) {
                word_mas[index] = new Word(temp);
                index++;
                System.out.println(" <-- |слово указаной длинны из вопросительного предложения|");
                temp = "";
            }

            if (sentence_str.charAt(i) == ' ') {
                word_mas[index] = new Word(temp);
                index++;
                temp = "";
            }
        }
    }

        public void Parsing ()
        {
            int count = 1, index = 0;

            for (int i = 0; i < sentence_str.length(); i++) {
                if (sentence_str.charAt(i) == '?')
                    count++;
            }

            String[] min_str = new String[count];
            for (int i = 0; i < count; i++)
                min_str[i] = "";


            for (int i = 0; i < sentence_str.length(); i++)
            {
                min_str[index] += sentence_str.charAt(i);

                if (sentence_str.charAt(i) == '.')
                    min_str[index] = "";

                if (sentence_str.charAt(i) == '?')
                    index++;
            }
        }



}
