package com.company;

public class Salad {

    private Vegetables [] salad = new Vegetables [10];
    private int count=0;
    private  double calories;

    // Добавление овоща в салат
    public void set(Vegetables obj)
    {
        salad[count]=obj;
        count++;
        calories+=obj.get_calories();
    }

    // Вывод салата
    public void input()
    {
        System.out.print("Salad comprises: ");
        for (int i=0;i<count;i++) {
            System.out.print("("+salad[i].get_calories()+" J) ");
            salad[i].get_name();
        }
        System.out.println("\nIts caloricity: " + calories+" J");
    }

   // Поиск овощей из интервала калорийности
    public void search_vegetable(double first , double last)
    {
        for (int i=0;i<count;i++) {
            if(salad[i].get_calories()>=first && salad[i].get_calories()<=last)
            {
                System.out.print("Vegetables from the interval : ("+salad[i].get_calories()+"J) ");
                salad[i].get_name();
                System.out.print("\n");
            }
        }
    }

    // Сортировка овощей
    public  void selectionSort()
    {
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < count; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            double min = salad[i].get_calories();
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < count; j++) {
                //Если находим, запоминаем его индекс
                if (salad[j].get_calories() < min) {
                    min = salad[j].get_calories();
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                 Vegetables tmp = new Vegetables();
                tmp = salad[i];
                salad[i] = salad[min_i];
                salad[min_i] = tmp;
            }
        }
    }

    // Вывод отсортированого салата :)
     public void sort_input ()
     {
        System.out.print("Sorted array: ");
        for (int i=0;i<count;i++) {
            System.out.print("("+salad[i].get_calories()+"J)->");

            salad[i].get_name();
        }
     }
}
