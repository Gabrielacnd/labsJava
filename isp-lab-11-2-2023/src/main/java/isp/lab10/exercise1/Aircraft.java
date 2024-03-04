package isp.lab10.exercise1;

import java.io.FileWriter;
import java.io.IOException;

public class Aircraft implements Runnable {

    String id;
    String lock = "lock";
    int altitude;
    int k = 0;

    public Aircraft(String id) {
        this.id = id;
        System.out.println("Aircraft " + id + " is created. Ready to take off.");
    }

    public int getAltitude() {
        return altitude;
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        try (FileWriter fileWriter = new FileWriter("ac_" + id)) {
            while (k < 20) {
                fileWriter.write("AirCraft" + id + "is flying\n");
                fileWriter.flush();
                System.out.println("Aircraft " + id + " is flying");
                k++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (k == 15) {
                    synchronized (lock) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }//.while
            System.out.println("Aircraft " + id + " is landing.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void land() {
        synchronized (lock) {
            lock.notify();
        }
    }

    public void doNotify() {
        synchronized (lock) {
            lock.notify();
        }
    }

    public static void main(String[] args) {
        Aircraft da = new Aircraft("1");
        //da.start();
        Thread t = new Thread(da);
        t.start();
    }

    public void receiveAtcCommand(AtcCommand command) {
        doNotify();

    }
}
