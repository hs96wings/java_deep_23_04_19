package com.ll.exam;

public class MyArrayList<T>{
    private String[] data = new String[2];
    private int size = 0;
    public int size() {
        return size;
    }

    // ArrayList의 add는 무조건 true를 반환해주어야 함
    public boolean add(String element) {
        // 배열 공간이 부족하면 새 data 객체를 만든다
        makeNewDataIfNotEnough();
        data[size] = element;

        size++;
        return true;
    }

    private void makeNewDataIfNotEnough() {
        if (ifNotEnough())
            makeNewData();
    }

    private void makeNewData() {
        // 새 배열을 만든다
        String[] newData = new String[data.length * 2];

        // 기존 배열에 있는 원소들을 새 배열에 옮긴다
        for (int i = 0; i < data.length; i++)
            newData[i] = data[i];

        // 기존 배열을 해지한다
        // 리스트가 기존 배열을 가리키지 않도록 하여 가비지 컬렉팅이 되도록 한다
        data = newData;
    }

    private boolean ifNotEnough() {
        return size >= data.length;
    }

    public String get(int index) {
        return data[index];
    }
}
