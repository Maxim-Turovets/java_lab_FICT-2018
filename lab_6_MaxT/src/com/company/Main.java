package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       double variant = 6123%2;  //   = 1 (Set)



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


        // Создаем салаты
        Salad salad1 = new Salad();
        Salad salad2 = new Salad();
        Salad salad3 = new Salad();
        System.out.println("======================================================");

        // Ввод овощей в массив "салат"
        salad1.set(bet);
        salad2.set(pot);
        salad3.set(cart);
        salad1.set(tom);
        salad2.set(oni);
        salad3.set(oni);


        //  Создаем Array List  для проверки 3-го конструктора
       ArrayList<Salad> ListForConstructor= new ArrayList<Salad>();
       ListForConstructor.add(salad2);


       MySet mySet1 = new MySet();    //  пустой конструктор
       MySet mySet2 = new MySet(salad1);  //  передаем объект
       MySet mySet3 = new MySet(ListForConstructor);  //  передаем список

      // пример функций для  разных сетов
       mySet1.add(salad1);
       mySet1.add(salad2);
       mySet1.add(salad3);

       System.out.println(mySet2.size());
       mySet2.clear();

       mySet3.remove(ListForConstructor);



    }
}
