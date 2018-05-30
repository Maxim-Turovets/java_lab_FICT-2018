package com.company;

public class Vegetables {
    private String name;
    private double calories;
    public  void  set(String name ,double cl)
    {
     this.name=name;
     this.calories=cl;
    }
    public  void  get()
    {
        System.out.println("Name:"+name +"  calories:" + calories);
    }
    public  void  get_name()
    {
        System.out.print(name+"; ");
    }
    public  double  get_calories()
    {
        return calories;
    }
}
