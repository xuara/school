package ch05.queues;

// @author Michael Kester
public class PrintChar implements Runnable {

    char c;
    int x;

    public PrintChar(char c, int x) {
        this.c = c;
        this.x = x;
    }

    @Override
    public void run() {
        for (int a = 0; a <= x; a++) {
            System.out.println(c);
        }
    }
}
