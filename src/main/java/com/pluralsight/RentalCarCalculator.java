package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);

        //asking for pickup date
        System.out.println("Enter pickup date:  ");
        String pickupDate = Scanner.nextLine();

        //asking for the number for rental days
        System.out.println("Enter number of rental days");
        int rentalDay = Scanner.nextInt();

        //asking for if they want a toll tag
        System.out.print("Do you want an electronic toll tag? (yes/no): ");
        String tollTag = Scanner.next();

        //asking if they want GPS?
        System.out.print("Do you want GPS? (yes/no): ");
        String gps = Scanner.next();

        //asking if they want roadside assistance ?
        System.out.print("Do you want roadside assistance? (yes/no): ");
        String roadside = Scanner.next();

        //asking for there age
        System.out.print("Enter your age: ");
        int age = Scanner.nextInt();



    }
}
