package org.tnsif.acc.c2tc.interfacedemo;

interface Vechicle {
    void start();
    void stop();

    final int Max_speed = 120;

     public default void repair() {
        System.out.println("We provide repair service.");
    }

    static void checkMaintaince() {
        System.out.println("Vechicle maintaince taken care here.");
    }
}

class Car implements Vechicle {
    private String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " starting");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " stopping");
    }

    @Override
    public void repair() {
        System.out.println("Car " + model + " repair service.");
    }
}

class Bike implements Vechicle {
    private String type;

    Bike(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Bike " + type + " starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike " + type + " stopping");
    }

    @Override
    public void repair() {
        System.out.println("Bike " + type + " repair service.");
    }
}

public class DefaultStaticDemo {
    public static void main(String[] args) {

        Vechicle car = new Car("KIA");
        Vechicle bike = new Bike("RX 100");

        car.start();
        car.stop();

        bike.start();
        bike.stop();

        car.repair();
        bike.repair();

        Vechicle.checkMaintaince();

        System.out.println("Maxspeed " + Vechicle.Max_speed);
    }
}