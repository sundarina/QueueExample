package queue;

/**
 * Created by sun on 06.03.17.
 */
public class QueueApp {
    public static void main(String[] args) {
        QueueClass theQueue = new QueueClass(5); //очередь из 4 ячеек

        theQueue.insert(10); //вставка 4 элементов
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove(); //извлечение 3 элементов(10, 20, 30)
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50); //вставка 4 элементов с циклическим переносом
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()) { //извлечение и вывод всех элементов

            long n = theQueue.remove();
            System.out.println(n);
            System.out.println(" ");
        }
        System.out.println("");

    }
}

