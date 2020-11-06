package ch05.queues;

// @author Michael Kester
public class LinkedUnbndQueueTest extends LinkedUnbndQueue {

    // Exercise 5.31A
    static <T> T cFront(LinkedUnbndQueue<T> queue) throws QueueUnderflowException {
        LinkedUnbndQueue<T> q2 = new LinkedUnbndQueue();
        T toReturn = queue.dequeue();

        while (!queue.isEmpty()) {
            q2.enqueue(queue.dequeue());
        }

        while (!q2.isEmpty()) {
            queue.enqueue(q2.dequeue());
        }

        return toReturn;
    }

    public static void main(String[] args) {
        // Exercise 5.31A test
        System.out.println("Exercise 5.31A test:");
        LinkedUnbndQueue luqa = new LinkedUnbndQueue();

        luqa.enqueue(3);
        luqa.enqueue(2);
        luqa.enqueue(1);
        luqa.enqueue("Ignition");

        System.out.print("Current queue: \n" + luqa.toString());

        System.out.println("\nFront is: " + cFront(luqa) + "\n");
        // end Exercise 5.31A test

// Exercise 5.31B　test
        System.out.println("Exercise 5.31B test:");
        LinkedUnbndQueue luqb = new LinkedUnbndQueue();

        luqb.enqueue("Testing");
        luqb.enqueue(1);
        luqb.enqueue(2);
        luqb.enqueue(3);

        System.out.println("Current queue: \n" + luqb.toString());

        System.out.println("Front is: " + luqb.front());
        // end Exercise 5.31B test

    }
}
