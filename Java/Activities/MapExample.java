package com.example;

    import java.util.HashMap;
import java.util.Map;
public class MapExample  {

    public static void main(String[] args) {

        // Create a Map with Integer keys and String values
        Map<Integer, String> colours = new HashMap<>();

        // Add 5 colours
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Purple");

        // Print the Map
        System.out.println("Colours Map: " + colours);

        // Remove one colour
        colours.remove(4);
        System.out.println("After removing key 4: " + colours);

        // Check if the colour green exists
        if (colours.containsValue("Green")) {
            System.out.println("Green exists in the Map.");
        } else {
            System.out.println("Green does not exist in the Map.");
        }

        // Print the size of the Map
        System.out.println("Size of Map: " + colours.size());
    }

}
