package com.pluralsight;

public class Exercise2 {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        /*Question 1: Create 2 variables to represent the salary for Bob and Gary
        name them bobSalary and garySalary. Whose salary is greater?
        */
            public static void main(String[] args) {
                int bobSalary = 80_500, garySalary = 100_000;
                int highestSalary = Math.max(bobSalary, garySalary);
                System.out.println(
                        "The highest salary is " + garySalary);

                int carPrice = 20_000, truckPrice = 28_500;;
                int lowestPrice = Math.min (carPrice, truckPrice);
                System.out.println("The lowest price is $" + lowestPrice);

                double radiusOfCircle = 7.25;
                double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
                System.out.println("The area of the circle is" + areaOfCircle);

                double startingNumber =5;
                double squareRoot = Math.sqrt(startingNumber);
                System.out.println("The square root is" + squareRoot);

                int x1=5; int y1=10;
                int x2 = 85; int y2 = 50;

                double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1,2));
                System.out.println("The distance between the points");

                float setNumber = -3.8F;
                float absoluteNumber = Math.abs(setNumber);

                double random = Math.random();
                System.out.println("A random number between 0 and 1");


    }
}
