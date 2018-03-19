package com.company;

public class Main {

    public static void main(String[] args) {
        String str=
                "Вы уверены что правильно    поступаете ? "+
                        "Мы не можем        быть всегда уверены что делаем это правильно !"+
                        "А     это правда - правда         ты  такой     как все    ? "+
                        "Мне   кажется, это       очень важно. "+ "Думайте но ? "
        +"Как           из всех        сами думаете ? "+ "Есть      смысл что-то  то       Еделать ?";

        System.out.println("***Начальный тект***");
        System.out.println(str);

        System.out.println("\n***Тект  после обработки***");
        Text obj = new Text(str);


    }
    }
