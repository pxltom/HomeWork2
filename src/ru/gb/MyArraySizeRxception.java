package ru.gb;

public class MyArraySizeRxception extends MyException{
    public MyArraySizeRxception() {
        super("Размер входного массива не 4x4");
    }
}
