package com.example;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Create an ArrayList named myList of type String
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Emma");

        // Print all names using for loop
        System.out.println("Names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Retrieve the 3rd name
        System.out.println("\n3rd name in the list: " + myList.get(2));

        // Check if a name exists
        if (myList.contains("Bob")) {
            System.out.println("\nBob exists in the list.");
        } else {
            System.out.println("\nBob does not exist in the list.");
        }

        // Print number of names
        System.out.println("\nTotal names: " + myList.size());

        // Remove a name
        myList.remove("Charlie");

        // Print new size
        System.out.println("Size after removing a name: " + myList.size());
    }

}
