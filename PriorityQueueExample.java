import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();

        // Adding elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mango");
        queue.add("Orange");

        // Printing elements
        System.out.println("Priority Queue Elements:");

        for (String item : queue) {

            System.out.println(item);
        }
    }
}