package com.ac.threads;

public class Robot {

    public static void main(String[] args) {

        HorizontalThread horizontalThread = new HorizontalThread();
        VerticalThread verticalThread = new VerticalThread();

        System.out.println("Robot is going ");
        horizontalThread.start();
        verticalThread.start();

    }
}
