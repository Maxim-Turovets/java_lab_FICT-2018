package com.company;

public class Main {

    public static void main(String[] args) {

       double variant = 6123%17;  //   = 3


        // Создаем овощи
        Tomato tom = new Tomato();
        tom.set(12.48);


        Beet bet = new Beet();
        bet.set(18.36);


        Potato pot = new Potato();
        pot.set(9.34);

        Carrot cart= new Carrot();
        cart.set(10.59);

        Onion oni = new Onion();
        oni.set(23.68);


        // Создаем салат
        Salad ob = new Salad();
        System.out.println("======================================================");

        // Ввод овощей в массив "салат"
        ob.set(bet);
        ob.set(pot);
        ob.set(cart);
        ob.set(tom);
        ob.set(oni);

        // Ввывод неотсортированого массива
        ob.input();
        System.out.println("======================================================");

        // Интервал калорийности овощей
        double  first=8.03,
                last=15.67;
        System.out.println("Interval : <"+first+"..."+last+">");

        // Поиск овощей из интервала
        ob.search_vegetable(first,last);

        System.out.println("======================================================");
        // Вывод отсортированого массива овощей
        ob.selectionSort();
        ob.sort_input();

    }
}
