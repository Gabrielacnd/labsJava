package isp.lab10.racedemo;

import java.awt.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class CarRace {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Car Race");
        frame.setLayout(new GridLayout(2, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();
        SemaphorePanel semaphorePanel = new SemaphorePanel();
        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        frame.getContentPane().add(semaphorePanel);
        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(600, 600);
        frame.setVisible(true);
        semaphoreThread.run();
        PlaySound sound = new PlaySound();
        sound.playSound();
        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);

        car1.start();

        car2.start();
        car3.start();
        car4.start();
        car1.join();
        car2.join();
        car3.join();
        car4.join();
        sound.stopSound();
        System.out.println(car1.getTime());
        System.out.println(car2.getTime());
        System.out.println(car3.getTime());
        System.out.println(car4.getTime());

    }

}




