package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        int bobSalary = 116_000;
        int garySalary = 98_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2:
        float carPrice = 40_000;
        float truckPrice = 56_000;
        float lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest car is " + lowestPrice);

        // Question 3:
        double radius = 7.25;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area of a circle  with radius " + radius + " is " + area);

        // Question 4:
        double variableQuestion4 = 5.0;
        double variableSquareRoot = Math.sqrt(variableQuestion4);
        System.out.println("The square root of " + variableQuestion4 + " is " + variableSquareRoot);

        // Question 5:
        int xPoint1 = 5;
        int yPoint1 = 10;
        int xPoint2 = 85;
        int yPoint2 = 50;
        double distance = Math.sqrt(Math.pow((xPoint2 - xPoint1), 2) + Math.pow((yPoint2 - yPoint1), 2));
        System.out.println("The distance between (" + xPoint1 + ", " + yPoint1 + ") and (" + xPoint2 + ", " + yPoint2 + ") is " + distance);

        // Question 6:
        double variableQuestion6 = -3.8;
        System.out.println("The absolute value of " + variableQuestion6 + "  is " + Math.abs(variableQuestion6));

        // Question 7:
        System.out.println("Here's a random number between 0 and 1: " + Math.random());

        // Question 8:
        int numDays = 24;
        int numHours = numDays * 24;
        int numMinutes = numHours * 60;
        int numSeconds = numMinutes * 60;
        int numMilliseconds = numSeconds * 1000;
        System.out.println("The number of minutes in " + numDays + " days is " + numMinutes);
        System.out.println("The number of milliseconds in " + numDays + " days is " + numMilliseconds);
    }
}
