package ch05.queues;

// @author Michael
public class ArrayBndQueueTest {

    public static void main(String[] args) {
        ArrayBndQueue bq = new ArrayBndQueue(5);

        for (int i = 1; i <= 5; i++) {
            bq.enqueue(i);
        }
        bq.dequeue();
        bq.enqueue(13);

        //Exercise 5.14A (toString method):
        System.out.print("Current queue: \n" + bq.toString());
    }
}
