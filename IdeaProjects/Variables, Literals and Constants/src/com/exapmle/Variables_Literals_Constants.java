package com.exapmle;

public class Variables_Literals_Constants {
    public static void main(String[] args) {
        final int FIRST_NUMBER;
        int secondNumber;

        FIRST_NUMBER = 11;
        secondNumber = 20;

        double average;

        average = (FIRST_NUMBER + secondNumber) / 2.0;

        System.out.println("Average: " + average);

        String name;
        String surname;

        name = "Chaitanya";
        surname = "Singh Bisht";

        System.out.println(name + " " + surname);

        boolean value;
        value = false;

        System.out.println(value);

        char letter;
        letter = 'j';

        System.out.println(letter);

    }
}
