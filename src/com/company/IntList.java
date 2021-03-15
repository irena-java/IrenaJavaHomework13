package com.company;

import java.util.Arrays;

public class IntList {

    private int[] arr = new int[0];

    public void add(int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length - 1] = value;
        this.arr = new int[tmp.length];
        System.arraycopy(tmp, 0, arr, 0, tmp.length);
        System.out.println(Arrays.toString(arr));
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}


