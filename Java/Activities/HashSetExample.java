package com.example;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // Create a HashSet
        HashSet<String> hs = new HashSet<>();

        // Add 6 objects using add()
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Mango");
        hs.add("Grapes");
        hs.add("Pineapple");

        // Print the size of the HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // Remove an element
        hs.remove("Mango");
        System.out.println("After removing Mango: " + hs);

        // Try removing an element that is not present
        boolean removed = hs.remove("Watermelon");
        System.out.println("Trying to remove Watermelon: " + removed);

        // Check if an item exists using contains()
        if (hs.contains("Apple")) {
            System.out.println("Apple is present in the set.");
        } else {
            System.out.println("Apple is not present in the set.");
        }

        // Print the updated set
        System.out.println("Updated HashSet: " + hs);
    }
}

