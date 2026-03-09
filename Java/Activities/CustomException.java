package com;

public class CustomException extends Exception {

    // Private message variable
    private String message;

    // Constructor
    public CustomException(String message) {
        this.message = message;
    }

    // Override getMessage()
    @Override
    public String getMessage() {
        return message;
    }

public static void main(String[] args) {

        try {
            throw new CustomException("This is a custom exception");
        } 
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}