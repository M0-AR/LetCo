package _2020.August.Week1;

public class DesignHashSet {
    public static void main(String[] args) {
        MyHashSetBol myHashSetBol = new MyHashSetBol();
        myHashSetBol.add(1);
        myHashSetBol.add(2);
        myHashSetBol.contains(1);    // returns true
        myHashSetBol.contains(3);    // returns false (not found)
        myHashSetBol.add(2);
        myHashSetBol.contains(2);    // returns true
        myHashSetBol.remove(2);
        long startBol = System.nanoTime();
        myHashSetBol.contains(2);    // returns false (already removed)
        long finishBol = System.nanoTime();
        System.out.println(finishBol-startBol);

        MyHashSetInt myHashSetInt = new MyHashSetInt();

        myHashSetInt.add(1);
        myHashSetInt.add(2);
        myHashSetInt.contains(1);    // returns true
        myHashSetInt.contains(3);    // returns false (not found)
        myHashSetInt.add(2);
        myHashSetInt.contains(2);    // returns true
        myHashSetInt.remove(2);
        long startInt = System.nanoTime();
        myHashSetInt.contains(2);    // returns false (already removed)
        long finishInt = System.nanoTime();
        System.out.println(finishInt-startInt);
    }
}


class MyHashSetBol {
    boolean[] arr;
    /** Initialize your data structure here. */
    public MyHashSetBol() {
        arr = new boolean[1000000];
    }

    public void add(int key) {
        arr[key]=true;
    }

    public void remove(int key) {
        arr[key]=false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key];
    }
}


class MyHashSetInt {
    private int[] array;


    /** Initialize your data structure here. */
    public MyHashSetInt() {
        this.array = new int[1000000];
    }

    public void add(int key) {
        array[key] = 1;
    }

    public void remove(int key) {
        array[key] = -1;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return array[key] == 1;
    }
}
