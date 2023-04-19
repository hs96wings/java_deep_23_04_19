package com.ll.exam;

public class MyArrayList<T>{
    private int size = 0;
    public int size() {
        return size;
    }

    // ArrayList의 add는 무조건 true를 반환해주어야 함
    public boolean add(String element) {
        size++;
        return true;
    }

    public String get(int index) {
        return "포도";
    }
}
