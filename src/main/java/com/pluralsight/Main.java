package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to the world of programming");
        System.out.println("My name is Jack Naillon");
        System.out.println("I am 28 years old!!");

        Movie myMovie = new Movie();
        myMovie.title = "immortals";
        System.out.println("My favorite movie is: " + myMovie.title);
    }
}