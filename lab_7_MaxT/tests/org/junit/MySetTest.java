package org.junit;

import com.company.MySet;
import com.company.Salad;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class MySetTest {
  @Test
    public void size() {
        Salad salad1 = new Salad();
        MySet mySet = new MySet();

        mySet.add(salad1);

        int actual = mySet.size();
        int expected=1;

        assertEquals(expected , actual);
    }

    @Test
    public void isEmpty() {
        Salad salad1 = new Salad();
        MySet mySet = new MySet();

        mySet.add(salad1);

        boolean actual = mySet.isEmpty();
        boolean expected=false;

        assertEquals(expected , actual);
    }

    @Test
    public void contains() {
        Salad salad1 = new Salad();
        Salad salad2 = new Salad();
        Salad salad3 = new Salad();

        MySet mySet = new MySet();

        mySet.add(salad1);
        mySet.add(salad2);


        assertEquals("Test contains" ,false , mySet.contains(salad2));
    }


    @Test
    public void toArray() {
        Salad salad1 = new Salad();
        MySet mySet = new MySet();
        mySet.add(salad1);

        Salad[] Arr=new Salad[mySet.length];
        Arr[0]=salad1;

        mySet.toArray();


        assertEquals(Arr , mySet.toArray());
    }


    @Test
    public void add() {
        Salad salad1 = new Salad();
        Salad salad2 = new Salad();
        Salad salad3 = new Salad();

        MySet mySet = new MySet();

        mySet.add(salad1);
        mySet.add(salad2);
        mySet.add(salad3);


        assertEquals(10 , mySet.length);
        assertEquals(mySet.toArray()[0], salad1 );
        assertEquals(mySet.toArray()[1], salad2 );
        assertEquals(mySet.toArray()[2], salad3 );

    }

    @Test
    public void remove() {
        Salad salad1 = new Salad();
        Salad salad2 = new Salad();
        Salad salad3 = new Salad();

        MySet mySet = new MySet();

        mySet.add(salad1);
        mySet.add(salad2);
        mySet.add(salad3);
        mySet.remove(mySet);

        assertEquals(false , mySet.remove(mySet) );
    }


    @Test
    public void addAll() {
        Salad salad1 = new Salad();
        Salad salad2 = new Salad();

        MySet mySet = new MySet();

        ArrayList<Salad> ListForConstructor= new ArrayList<Salad>();
        ListForConstructor.add(salad1);
        ListForConstructor.add(salad2);

        mySet.addAll(ListForConstructor);

        assertEquals(ListForConstructor.toArray()[0], mySet.toArray()[0] );
        assertEquals(ListForConstructor.toArray()[1], mySet.toArray()[1] );
        assertEquals("Test addAll", true, mySet.addAll(ListForConstructor) );
    }


    @Test
    public void removeAll() {

        Salad salad2 = new Salad();

        MySet mySet = new MySet();

        mySet.add(salad2);


        ArrayList<Salad> ListForConstructor= new ArrayList<Salad>();
        ListForConstructor.add(salad2);

        mySet.removeAll(ListForConstructor);

        assertEquals(ListForConstructor.toArray()[0], mySet.toArray()[0] );
    }


    @Test
    public void clear() throws Exception {

            Salad salad1 = new Salad();
            Salad salad2 = new Salad();
            Salad salad3 = new Salad();

            MySet mySet = new MySet();

            mySet.add(salad1);
            mySet.add(salad2);
            mySet.add(salad3);
            mySet.clear();
            int actual = mySet.size();
            int expected=0;

            assertEquals(expected , actual);
    }
}
