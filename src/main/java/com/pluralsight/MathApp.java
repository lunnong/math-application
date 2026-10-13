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
        double radius  = 7.25;
        double area  = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area of a circle  with radius " + radius  + " is " + area);

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
        System.out.println("The distance between (" + xPoint1  + ", " + yPoint1 + ") and (" + xPoint2 + ", " + yPoint2 + ") is " + distance);

        // Question 6:
        double variableQuestion6 = -3.8;
        System.out.println("The absolute value of " + variableQuestion6 + "  is "+ Math.abs(variableQuestion6));

        // Question 7:
        System.out.println("Here's a random number between 0 and 1: " + Math.random());

        // Question 8:
        int numDays = 24;
        int numHours = numDays * 24;
        int numMinutes = numHours * 60;
        int numSeconds = numMinutes * 60;
        int numMilliseconds = numSeconds * 1000;
        System.out.println("The number of minutes in " + numDays +  " days is " + numMinutes);
        System.out.println("The number of milliseconds in " + numDays + " days is " + numMilliseconds);

        // Stretch Challenges

        System.out.println();
        System.out.println("Stretch challenges:");

        // 1. The Time Machine
        int hours = 22;
        int minutes = 45;
        int minutesToAdd = 150;
        System.out.println("The current time is " + hours + ":" + minutes);

        minutes = minutes + minutesToAdd;
        int hoursToAdd = minutes / 60;
        minutes = minutes % 60;
        hours = hours + hoursToAdd;
        hours = hours % 24;
        System.out.println("After " + minutesToAdd + " minutes, it is now " + hours + ":" + minutes);

        // 2. The Movie Marathon
        int movieOneMinutes = 125;
        int movieTwoMinutes = 98;
        int movieThreeMinutes = 142;

        int totalMinutes = movieOneMinutes + movieTwoMinutes + movieThreeMinutes;
        int hoursQuestionTwo = totalMinutes / 60;
        int minutesQuestionTwo  = totalMinutes % 60;

        System.out.println("After watching three movies lasting " + movieOneMinutes + " minutes, " + movieTwoMinutes + " minutes, and " + movieThreeMinutes +
                           " minutes, I will be watching movies for " + hoursQuestionTwo + " hours and " +  minutesQuestionTwo + " minutes.");

        int currentHour = 19;
        int currentMinute = 30;
        System.out.println("The current time is " + currentHour + ":" + currentMinute);

        currentMinute = currentMinute + minutesQuestionTwo;
        hoursQuestionTwo += (currentMinute / 60);
        currentMinute = currentMinute % 60;
        currentHour  = (currentHour + hoursQuestionTwo) % 24;
        System.out.println("After the movie marathon, the time will be " + currentHour + ":" + currentMinute);

        // 3. The Pizza Party
        int people = 23;
        int slicesPerPerson = 3;
        int slicesPerPizza = 8;

        int totalSlices = people * slicesPerPerson;
        int pizzas = (totalSlices + slicesPerPizza - 1) / slicesPerPizza;
        int leftoverSlices = pizzas * slicesPerPizza - totalSlices;

        System.out.println("Total slices needed: " + totalSlices);
        System.out.println("Pizzas to order: " + pizzas);
        System.out.println("Slices left over: " + leftoverSlices);

    }
}
