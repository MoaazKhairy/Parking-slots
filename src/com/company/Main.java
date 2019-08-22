package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //user enters number of compact spots you need  in parking
        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter number of Compact spots you want: ");
        int compactSize = reader1.nextInt();

        //user enters number of regular spots you need  in parking
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter number of regular spots you want: ");
        int regularSize = reader2.nextInt();

	    // create parking1 object & show size of compact/regular spots in it
        Parking parking1 = new Parking(compactSize,regularSize);
        System.out.println("parking have " + parking1.getCompactSize()  + " compact free spots and " + parking1.getRegularSize() + " regular free spots");

        //create vehicle object
        Vehicle vehicle1 = new Vehicle("compact");
        Vehicle vehicle2 = new Vehicle("regular");
        Vehicle vehicle3 = new Vehicle("compact");
        Vehicle vehicle4 = new Vehicle("compact");
        Vehicle vehicle5 = new Vehicle("regular");

        Ticket t1 = parking1.parkVehicle(vehicle1);
        Ticket t2 = parking1.parkVehicle(vehicle2);
        Ticket t3 = parking1.parkVehicle(vehicle3);
        Ticket t4 = parking1.parkVehicle(vehicle4);

        parking1.releaseTicket(t2);

        Ticket t5 = parking1.parkVehicle(vehicle5);
    }
}
