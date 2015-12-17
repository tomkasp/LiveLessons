package simple.examples;

/**
 * Created by tomkasp on 17/12/15.
 */
public class SemaphoreMain {

    public static void main(String[] args) throws InterruptedException {
        final SemaphoreSimpleExample semaphoreSimpleExample = new SemaphoreSimpleExample();
        Thread thread1 = new Thread(){
            public void run(){
                try {
                    semaphoreSimpleExample.print();
                    semaphoreSimpleExample.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                try {
                    semaphoreSimpleExample.print();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
