package queue;

/**
 * Created by sun on 06.03.17.
 */
public class QueueClass {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueClass(int s) {
        this.maxSize = s;
        this.queArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long i) { //вставка элемента в конец очереди
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = i; //увеличение rear и вставка
        nItems++;             //увеличение количества элементов
    }

    public long remove() { //извлечение элемента в начале очереди
        long temp = queArray[front++]; //выборка и увеличение front
        if(front == maxSize){ //циклический перенос
            front = 0;
        }
        nItems--;    //уменьшение количества элементов
        return temp;
    }

    public long peekFront() { //чтение элемента в начале очереди
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems==0); //верно, если очередь пуста
    }

    public boolean isFull() {
        return (nItems == maxSize); //верно, если очередь заполнена
    }

    public int size()  { //количество элементов очереди
        return nItems;
    }

}
