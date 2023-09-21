import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(2);

        System.out.println("PriorityQueue elements:");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}