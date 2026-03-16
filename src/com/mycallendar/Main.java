/**
 *  Java program to demonstrate Calendar class.
 */

package com.mycallendar;

import java.util.Calendar;

/**
 *  Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Creating Calendar instance.
        Calendar myCalendar = Calendar.getInstance();

        // Printing minimum days in a week.
        System.out.println(myCalendar.getMinimalDaysInFirstWeek());

        // Printing constant value of SUNDAY.
        System.out.println(Calendar.SUNDAY); // Output: 1

        // Printing value of first day of week.
        System.out.println(myCalendar.getFirstDayOfWeek()); // Output: 1

        // Setting first day of week MONDAY.
        myCalendar.setFirstDayOfWeek(2);

        // Printing value of first day of week.
        System.out.println(myCalendar.getFirstDayOfWeek()); // Output: 2

    }
}