package org.example;
import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is your current age? " );

        Scanner scanner = new Scanner(System.in);
        int age, retiringAge, yearsLeft, currentYear, retiringYear;

        age = scanner.nextInt();

        System.out.println( "At what age would you like to retire? " );
        retiringAge = scanner.nextInt();

        yearsLeft = retiringAge - age;
        currentYear = Calendar.getInstance().get(Calendar.YEAR);
        retiringYear = currentYear + yearsLeft;

        System.out.println
        (
            "You have " + yearsLeft + " years left until you can retire.\n"
            + "It's " + currentYear + ", so you can retire in " + retiringYear
        );

    }
}
