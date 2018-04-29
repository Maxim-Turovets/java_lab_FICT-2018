package com.company;

import java.util.Set;
import java.util.*;

public class MySet implements  Set<Salad>{

    final static int BASE_SIZE = 10;
    final static int COEF = 2;
    private int length;
    private int size;
    private Salad[] Array;


    public MySet() {
        length = BASE_SIZE;
        size = 0;
        Array = new Salad[length];
    }

    public MySet(Salad obj) {
        length = BASE_SIZE;
        Array = new Salad[length];
        size = 1;
        Array[0] = obj;
    }

    public MySet(ArrayList<? extends Salad> arr) {
        length = BASE_SIZE;
        while (length < arr.size()) {
            length *= 2;
        }

        size = 0;
        Array = new Salad[length];

        for(Salad x : arr) {
            Array[size++] = x;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(Array[i])) {
                return true;
            }
        }

        return false;
    }
//  ========================
    @Override
    public Iterator<Salad> iterator() {
       return Arrays.asList(Array).listIterator();
    }

    @Override
    public Object[] toArray() {
        return Array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Salad salad) {
        if (size == length) {
            length *= COEF;
            Salad[] containerTmp = Array;
            Array = new Salad[length];
            size = 0;

            for (Salad x : containerTmp) {
                Array[size] = containerTmp[size++];
            }
        }
        Array[size++] = salad;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(Array[i])) {
                remove(i);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object x: c) {
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                if (x.equals(Array[i])) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Salad> c) {
        for (Salad x : c) {
            add(x);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (Object x: c) {
            for (int i = 0; i < size; i++) {
                if (!x.equals(Array[i])) {
                    remove(i);
                }
            }
        }

        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object x: c) {
            for (int i = 0; i < size; i++) {
                if (x.equals(Array[i])) {
                    remove(i);
                }
            }
        }

        return true;
    }


    @Override
    public void clear() {
        size = 0;
        length = BASE_SIZE;
        Array = new Salad[BASE_SIZE];
    }
}
