package priorityQueue;

import java.io.IOException;

/**
 * Created by sun on 06.03.17.
 */
public class PriorityQApp {
    public static void main(String[] args) throws IOException{
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.println((item + " "));
        }
        System.out.println("");
    }
}
