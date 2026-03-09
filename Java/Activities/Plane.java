package com.example;

import java.util.Date;   // Required import

public class Plane {

    private int passengers;
    private Date takeOffDate;
    private Date landingDate;

    // Constructor
    public Plane(int passengers) {
        this.passengers = passengers;
    }

    // Getter for passengers
    public int getPassengers() {
        return passengers;
    }

    // Method to board passengers
    public void boardPassengers(int number) {
        passengers += number;
    }

    // Method for plane takeoff
    public void takeOff() {
        takeOffDate = new Date();
        System.out.println("Plane took off at: " + takeOffDate);
    }

    // Method for landing
    public void land() {
        landingDate = new Date();
        System.out.println("Plane landed at: " + landingDate);
    }

    // Getters for dates
    public Date getTakeOffDate() {
        return takeOffDate;
    }

    public Date getLandingDate() {
        return landingDate;
    }

    public static void main(String[] args) {

        Plane plane = new Plane(0);

        plane.boardPassengers(50);
        System.out.println("Passengers: " + plane.getPassengers());

        plane.takeOff();

        plane.land();
    }
}