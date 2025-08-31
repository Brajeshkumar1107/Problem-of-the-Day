public class Main {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        System.out.println(queue.pop());
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println(queue.pop());
        queue.push(40);
        queue.push(50);
        queue.push(60);
        System.out.println(queue.pop());
        queue.push(70);
        queue.push(80);
        queue.printQueue();

        // Power of Four
        PowerOfFour f = new PowerOfFour(16);
    }
}
