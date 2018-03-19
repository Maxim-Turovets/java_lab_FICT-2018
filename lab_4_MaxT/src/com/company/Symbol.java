package com.company;

public class Symbol {
    char symbol;       //    СИМВОЛ

    Symbol(char sym)
    {
        symbol = sym;
        print();
    }

    public void print ()     //   ВЫВЕСТИ ТЕКСТ ПО СИМВОЛЬНО
    {
        System.out.print(symbol);
    }
}