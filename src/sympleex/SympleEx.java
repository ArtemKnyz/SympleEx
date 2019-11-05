package sympleex;

public class SympleEx {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long estimatedTime = 0;
        double elapsedTimeInSecond = 0;

        while ((elapsedTimeInSecond) < 60) {
            new Hello().start();
            new World().start();

            try {
                Thread.sleep(10000);
                estimatedTime = System.nanoTime() - startTime;
                elapsedTimeInSecond = (double) estimatedTime / 1_000_000_000;
                System.out.print(elapsedTimeInSecond + " sec");
                System.out.print("\r\n");

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class Hello extends Thread {

    @Override
    public void run() {
        System.out.print("Hello ");
    }
}

class World extends Thread {

    @Override
    public void run() {
        System.out.print("World ");
    }
}
