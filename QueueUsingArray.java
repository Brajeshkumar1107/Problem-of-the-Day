import java.util.*;

class QueueUsingArray{
    int front, rear;
    int arr[] = new int[100005];
    int size = arr.length;
    QueueUsingArray() {
        front = rear = 0;
    }

    void push(int x) {
        if (rear == size - 1) {
            System.out.println("Overflow: ");
            return;
        }

        arr[rear] = x;
        rear = (rear + 1) % size;
    }

    int pop(){
        if (isEmpty()) {
            return - 1;
        }
        int pop = arr[front];
        front = (front + 1) % size;
        return pop;
    }

    private boolean isEmpty() {
        return rear == 0 && front == 0;
    }

    void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}