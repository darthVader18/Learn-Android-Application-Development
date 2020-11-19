package com.example.loops;

public class Loops {
    public static void main(String[] args) {
        //The while loop

        int x = 0; //loop control variable

        while (x < 5) { // pre-test loop
            System.out.println("Hello world!");
            x++;
        }

        System.out.println("");

        //The do- while loop

        int y = 0; //loop control variable

        do {
            System.out.println("Hello world!");
            y++;
        } while(y < 5); // post-test loop

        //The for loop

        for (int z = 0 ; z<5 ; z++) {
            System.out.println("Hello world!");
        }

    }
}
