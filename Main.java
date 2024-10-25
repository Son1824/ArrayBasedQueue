package QueueDemo.ArrayBasedQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array-Based Queue:");
        ArrayBasedQueue arrayQueue = new ArrayBasedQueue(5);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);

        arrayQueue.displayQueue();

        System.out.println("Front element (peek): " + arrayQueue.peek());

        System.out.println("Dequeued element: " + arrayQueue.dequeue());
        arrayQueue.displayQueue();

        System.out.println("Is queue empty? " + arrayQueue.isEmpty());
    }
}
