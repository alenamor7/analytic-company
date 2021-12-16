package com.ac.threads;


import java.util.Random;

public class HorizontalThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            boolean randomDirection = new Random().nextBoolean();
            if (randomDirection) {
                System.out.println("left...");
            } else {
                System.out.println("right...");
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
