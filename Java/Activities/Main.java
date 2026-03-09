package com.example;

// Interface 1
interface BicycleParts {
    int tyres = 2;
    int maxSpeed = 120;
}

// Interface 2
interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

// Base Class
class Bicycle implements BicycleParts, BicycleOperations {
    int gears;
    int currentSpeed;

    Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrement) {
        currentSpeed = currentSpeed - decrement;
    }

    public void speedUp(int increment) {
        currentSpeed = currentSpeed + increment;
    }

    public void bicycleDesc() {
        System.out.println("Number of gears: " + gears);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

// Derived Class
class MountainBike extends Bicycle {
    int seatHeight;

    MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }

    @Override
    public void bicycleDesc() {
        super.bicycleDesc();
        System.out.println("Seat Height: " + seatHeight);
    }
}

// Driver Class
public class Main {
    public static void main(String[] args) {

        MountainBike mb = new MountainBike(5, 20, 10);

        mb.speedUp(10);
        mb.applyBrake(5);
        mb.setHeight(15);

        mb.bicycleDesc();

        System.out.println("Current Speed: " + mb.currentSpeed);
        System.out.println("Number of Tyres: " + mb.tyres);
    }
}