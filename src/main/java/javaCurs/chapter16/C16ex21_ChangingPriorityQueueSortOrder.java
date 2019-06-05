package javaCurs.chapter16;

import java.util.PriorityQueue;

public class C16ex21_ChangingPriorityQueueSortOrder {

    public static void main(String[] args) {

        PriorityQueue<Double> queue = new PriorityQueue<>(new DescOrderComparator());

        // insert elements to queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");

        // display elements in queue
        while (queue.size() > 0)
        {
            System.out.printf("%.1f ", queue.peek()); // view top element
            queue.poll(); // remove top element
        }
    }
}
