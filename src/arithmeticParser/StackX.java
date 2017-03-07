package arithmeticParser;

/**
 * Created by sun on 06.03.17.
 */
public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top = -1;

    public StackX(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
      //  this.top = -1;
    }

    public void push(int j) { //paзмещение элемента на вершине стэка
        stackArray[++top] = j;
    }

    public int pop() {  //извлечение элемента с вершины стэка
        return stackArray[top--];
    }

    public int peek() {  //чтение элемента с рершины стэка
        return stackArray[top];
    }

    public boolean isEmpty() {  //верно, если стэк пуст
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1); // true, если стек заполнен
    }

    public int size() {  //текущий размер стэка
        return top + 1;
    }

    public int peekN(int n) {    //чтение элемента с индексом n
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
