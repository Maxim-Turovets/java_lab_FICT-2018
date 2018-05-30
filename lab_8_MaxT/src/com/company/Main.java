package com.company;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        double variant = 6123 % 2;  //   = 1 (Set)


        // Создаем овощи
        Tomato tom = new Tomato();
        tom.set(12.48);

        Beet bet = new Beet();
        bet.set(18.36);

        Potato pot = new Potato();
        pot.set(9.34);

        Carrot cart = new Carrot();
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
        ArrayList<Salad> ListForConstructor = new ArrayList<Salad>();
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

        //  Exception
        try {
            for (Salad x : mySet1) {
                if (x == null) {
                    throw new MyException("My exception NULL");
                }
                System.out.println(x);
            }
        } catch (MyException ex) {
            System.out.println(ex);
        }
        ///////////////////////////////////////////////////////////////////

        System.out.println("Запись объекта в файл\n");    // единый объект
        SerializeObject(mySet1);

        System.out.println("Чтение объекта из файла\n");  // единый объект
        MySet deserialize = DeserializeObject();
        deserialize = Arr(deserialize, mySet1);

        // вывод объекта
        for (Salad x : deserialize) {
            if (x == null) continue;
            x.input();
        }

        System.out.println("\nЗапись массива объектов\n");  //массив объектов
        SerializeToArr(mySet1);

        System.out.println("Чтение массива объектов\n");  // массив объектов
        deserialize = DeserializeToArr();
        deserialize = Arr(deserialize, mySet1);

        for (Salad x : deserialize) {
            if (x == null) continue;
            x.input();
        }

        System.out.println("\nЗапись в JSON файл \n");
        serializeJSON(mySet1);

        System.out.println("Чтение JSON файла\n");
        deserialize = deserializeJSON();
        deserialize = Arr(deserialize, mySet1);

        for (Salad x : deserialize) {
            if (x == null) continue;
            x.input();
        }

    }

    // запись объекта
    public static void SerializeObject(MySet obj) {

        FileOutputStream fio = null;
        ObjectOutputStream oos = null;

        try {
            String path = "WriteToFileObject.ser";
            fio = new FileOutputStream(path);
            oos = new ObjectOutputStream(fio);
            oos.writeObject(obj);

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fio != null) {
                try {
                    fio.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    // Чтение объекта
    public static MySet DeserializeObject() {

        FileInputStream fin = null;
        ObjectInputStream ois = null;
        MySet obj = null;

        try {
            String path = "WriteToFileObject.ser";
            fin = new FileInputStream(path);
            ois = new ObjectInputStream(fin);
            obj = (MySet) ois.readObject();

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return obj;
    }

    // Запись массива овощей
    public static void SerializeToArr(MySet obj) {

        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {
            String path = "WriteToFileObject.ser";
            fout = new FileOutputStream(path);
            oos = new ObjectOutputStream(fout);
            oos.writeInt(obj.size());

            for (Salad x : obj) {
                oos.writeObject(x);
            }

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    // Чтение массива овощей
    public static MySet DeserializeToArr() {

        FileInputStream fin = null;
        ObjectInputStream ois = null;
        MySet obj = new MySet();

        try {
            String path = "WriteToFileObject.ser";
            fin = new FileInputStream(path);
            ois = new ObjectInputStream(fin);
            int size = ois.readInt();

            for (int i = 0; i < size; i++) {
                Salad x = (Salad) ois.readObject();
                obj.add(x);
            }
        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return obj;
    }

    // Запись в формате жсон
    public static void serializeJSON(MySet obj) {
        Gson gson = new Gson();
        PrintWriter out = null;
        try {
            String path = "ArrayOfObjects.json";
            out = new PrintWriter(path);
            String json = gson.toJson(obj);
            out.write(json);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    // чтение
    public static MySet deserializeJSON() {
        BufferedReader in = null;
        MySet obj = null;
        Gson gson = new Gson();

        try {
            String path = "ArrayOfObjects.json";
            in = new BufferedReader(new FileReader(path));
            String json = in.readLine();
            obj = gson.fromJson(json, MySet.class);
        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {
            if (in != null) {
                try {
                    in.close();
                    obj = DeserializeToArr();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return obj;
    }

    public static MySet Arr(MySet vb, MySet as) {
        vb = as;
        return vb;
    }
}

