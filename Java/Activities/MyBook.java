package com.example;

public class MyBook {
    
    String title;

    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }



    public static void main(String[] args) {
        MyBook newNovel = new MyBook();   // create object

        newNovel.setTitle("The Great Gatsby");   // set title

        System.out.println(newNovel.getTitle()); // print title
    }
}
