package org.example;

public class IfElseExercise {
    static void main() {
        int stock = 3;

        if (stock == 0) {
            System.out.println("Out of stock");
        } else if (stock < 5) {
            System.out.println("Stock almost empty");
        } else {
            System.out.println("Stock available");
        }
    }
}
