package sympleex;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SympleEx {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long estimatedTime = System.nanoTime() - startTime;
        Hello myHello = new Hello();
        while (estimatedTime != 0) {
            System.out.println("asdf");

            myHello.start();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                System.out.println("я сплю");
            }
            System.out.print("World ");
        }
        System.out.println(System.nanoTime());
    }
}

class Hello extends Thread {

    @Override
    public void run() {
        System.out.print("Hello ");

    }
}
