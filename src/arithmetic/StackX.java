package arithmetic;

/**
 * Created by sun on 06.03.17.
 */

import java.io.*;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max) {
        this.maxSize = max;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j) { //paзмещение элемента на вершине стэка
        stackArray[++top] = j;
    }

    public char pop() {  //извлечение элемента с вершины стэка
        return stackArray[top--];
    }

    public char peek() {  //чтение элемента с рершины стэка
        return stackArray[top];
    }

    public boolean isEmpty() {  //верно, если стэк пуст
        return (top == -1);
    }

    public int size() {  //текущий размер стэка
        return top + 1;
    }

    public char peekN(int n) {    //чтение элемента с индексом n
        return stackArray[n];
    }

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom --> top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println(" ");
    }
}
