package com.example;

public class Grade {

    public static int calculateTotal(int a, int b, int c) {
        return a + b + c;
    }

    public static double calculateAverage(int a, int b, int c) {
        return calculateTotal(a, b, c) / 3.0;
    }

    public static String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        int a = 95, b = 85, c = 75;

        int total = calculateTotal(a, b, c);
        double average = calculateAverage(a, b, c);

        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + calculateGrade(average));
    }
}
