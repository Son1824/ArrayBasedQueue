package QueueDemo.ArrayBasedQueue;

import java.util.Arrays;

public class ArrayBasedQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;

    public ArrayBasedQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full!");
            return;
        }
        queueArray[++rear] = value;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[front++];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (front > rear);
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Current Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}
