package com.ac.correct_method;

public class CarThread extends Thread {

    private final String brand;
    private final String model;
    private final double price;

    public CarThread(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public void run() {
        boolean flag = true;
        while(flag) {
            System.out.println("hello my name is " + this.brand);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                flag = false;
            }
        }
    }

    // not sure why main method is in the same class, I would better place it in another one
    public static void main(String[] args) {
        CarThread audi = new CarThread("Audi", "A3", 40000);
        CarThread bmw = new CarThread("BMW", "3", 50000);

        audi.start();
        bmw.start();

        System.out.println("carThreads are running...");
    }
}
