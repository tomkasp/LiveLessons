package simple.examples;

import java.util.concurrent.Semaphore;

/**
 * Created by tomkasp on 16/12/15.
 */
public class SemaphoreSimpleExample {

    public final Semaphore semaphore = new Semaphore(1, true);


    public static void main(String[] args) {

    }

    public  void print() throws InterruptedException {
        semaphore.acquire();
        System.out.println("print method");
    }

    public void release(){
        semaphore.release();
        System.out.println("release");
    }


}
