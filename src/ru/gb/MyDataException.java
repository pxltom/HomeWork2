package ru.gb;

public class MyDataException extends MyException{
    public MyDataException() {
        super("В матрице найдены некоректные данные");
    }
}
