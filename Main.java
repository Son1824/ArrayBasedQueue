package QueueDemo.ArrayBasedQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array-Based Queue:");
        ArrayBasedQueue queue = new ArrayBasedQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.displayQueue();

        System.out.println("Front element (peek): " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        queue.displayQueue();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
