package com.ac.threads;

import java.util.Random;

public class VerticalThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            boolean randomDirection = new Random().nextBoolean();
            if (randomDirection) {
                System.out.println("forward..");
            } else {
                System.out.println("backward...");
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
