package ch05.queues;

// @author Michael Kester
public class PrintCharTest {

    public static void main(String[] args) {
        PrintChar a = new PrintChar('A', 200);
        PrintChar b = new PrintChar('B', 200);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        
        t1.start();
        t2.start();
    }
}
