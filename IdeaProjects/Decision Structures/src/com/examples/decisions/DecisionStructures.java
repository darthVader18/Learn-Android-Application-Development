package com.examples.decisions;

import javax.swing.*;

public class DecisionStructures {
    public static void main(String[] args) {
        /*

        int x = 5;
        int y = 6;
        int p = 7;

        boolean expression = x > y && y < p; //AND operator
        boolean expression1 = !(x < y); //NOT operator

        System.out.println(expression);
        System.out.println(expression1);

        */

        /*
        int number;

        String input;

        input = JOptionPane.showInputDialog("Please enter a number: ");
        number = Integer.parseInt(input);

        if (number == 5) {
            JOptionPane.showMessageDialog(null, "The number is exactly 5!");
        }

        else if (number > 10) {
            JOptionPane.showMessageDialog(null, "The number is greater than 10!");
        }

        else if (number > 5) {
            JOptionPane.showMessageDialog(null, "The number is greater than 5!");
        }

        else {
            JOptionPane.showMessageDialog(null, "The number is less than 5!");
        }

        */

        int mark;

        String input;

        input = JOptionPane.showInputDialog("Please enter your mark: ");
        mark = Integer.parseInt(input);

        if (mark < 50 && mark >= 45) {  //Failed!!
            JOptionPane.showMessageDialog(null, "You can write re-test!");
        }
        else if (mark < 45) {
            JOptionPane.showMessageDialog(null, "You failed!");
        }
        else {//The user passed
            if (mark >= 75) {
                JOptionPane.showMessageDialog(null, "You have distinction!");
            }
            else{
                JOptionPane.showMessageDialog(null, "You passed!");
            }
        }

        System.exit(0);

    }
}
