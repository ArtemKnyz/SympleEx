package sympleex;

import java.io.IOException;

public class SympleEx {

    public static void main(String[] args) throws Exception {
//        long startTime = System.nanoTime();
//        //long estimatedTime = System.nanoTime() - startTime;
//        long estimatedTime = System.nanoTime() * 60 * 10 ^ 9;
        Hello myHello = new Hello();

        myHello.start();
        for (int i = 0; i < 6; i++) {
            Thread.sleep(6000);
            System.out.print("World ");

        }
        if (myHello.isAlive()) {
            try {
                myHello.join();	
            } catch (InterruptedException e) {
            }

            System.out.println("Hello");
        } else {
            System.out.println("World");
        }
        System.out.println("Finish");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        myHello.interrupt();
    }
}

class Hello extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.print("Hello ");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                break;

            }
        }

    }
}
