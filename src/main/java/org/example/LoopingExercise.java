package org.example;

public class LoopingExercise {
    public static void main(String[] args) {

        int totalTasks = 5;

        // FOR - ngerjain tugas berdasarkan jumlah
        System.out.println("Starting tasks with for loop:");

        for (int i = 1; i <= totalTasks; i++) {
            System.out.println("Doing task number " + i);
        }

        // WHILE - ngurangin sisa tugas sampai habis
        System.out.println("\nFinishing tasks with while loop:");

        int remainingTasks = totalTasks;

        while (remainingTasks > 0) {
            System.out.println("Remaining tasks: " + remainingTasks);
            remainingTasks--;
        }

        System.out.println("All tasks completed!");
    }
}
