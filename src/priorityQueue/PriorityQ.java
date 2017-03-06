package priorityQueue;

/**
 * Created by sun on 06.03.17.
 */
public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    //элементы сортируются по значению ключа от максимума(0) до минимума (maxSize-1)

    public PriorityQ(int s) {
        this.maxSize = s;
        this.queArray = new long[maxSize];
        this.nItems = 0;
    }

    public void insert(long item) { //вставка элемента
        int i;
        if (nItems == 0) { //если очередь пуста - вставляем в ячейку 0
            queArray[nItems++] = item;
        } else { //если очередь содержит элементы
            for (i = nItems - 1; i >= 0; i--) { //перебор в обратном порядке
                if (item > queArray[i]) { //если новый элемент больше
                    queArray[i + 1] = queArray[i]; //сдвинуть вверх
                } else {
                    break; //если меньше - сдвиг прекращается
                }
            }
            queArray[i + 1] = item; //вставка элемента
            nItems++;
        }
    }

    public long remove() {
        return queArray[--nItems]; //извлечение минимального элемента
    }

    public long peekMin() {
        return queArray[nItems - 1]; //чтение минимального элемента
    }

    public boolean isEmpty() {
        return (nItems == 0); //верно, если очередь пуста
    }

    public boolean isFull() {
        return (nItems == maxSize); //верно, если очередь заполненна
    }
}
