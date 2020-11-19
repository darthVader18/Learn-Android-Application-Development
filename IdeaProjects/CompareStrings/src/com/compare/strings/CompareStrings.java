package com.compare.strings;

import javax.swing.*;

public class CompareStrings {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Please enter name 1: ");
        String name2 = JOptionPane.showInputDialog("Please enter name 2: ");

        if (name1.equals(name2)) {  //(name1.compareTo(name2) == 0) This statement also do the same
            JOptionPane.showMessageDialog(null, "Name 1 is equal to name 2!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Not the same!");
        }
        if (name1.compareTo(name2) < 0) {
            JOptionPane.showMessageDialog(null, "Name 1 is first and name 2 is second in alphabetical order");
        }
        if (name1.compareTo(name2) > 0) {
            JOptionPane.showMessageDialog(null, "Name 2 is first and name 1 is second in alphabetical order");
        }

        System.exit(0);
    }
}
