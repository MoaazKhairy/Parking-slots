package com.company;
import java.util.ArrayList;

public class Parking {
    private int compactSize;
    private int regularSize;
    private ArrayList<Ticket> compactSpots;
    private ArrayList<Ticket> regularSpots;

    public Parking(int cs, int rs) {
        compactSize = cs;
        regularSize = rs;
        compactSpots = new ArrayList<Ticket>();
        regularSpots = new ArrayList<Ticket>();
    }

    public int getCompactSize() {
        return compactSize;
    }

    public void setCompactSize(int compactSize) {
        this.compactSize = compactSize;
    }

    public int getRegularSize() {
        return regularSize;
    }

    public void setRegularSize(int regularSize) {
        this.regularSize = regularSize;
    }

    public boolean isFull(){
        return compactSize == compactSpots.size() && regularSize == regularSpots.size();
    }

    public boolean isCompactFull(){
        return compactSize == compactSpots.size();
    }

    public boolean isRegularFull(){
        return regularSize == regularSpots.size();
    }

    public void releaseTicket(Ticket t){
        if(t.getVehicle().getType() == "compact"){
            if(t.getSpot().getType()=="compact"){
                compactSpots.remove(t);
            }
            else { regularSpots.remove(t); }
        }
        else{
            regularSpots.remove(t);
        }
    }

    public Ticket parkVehicle(Vehicle vehicle){
        if(isFull()){
            System.out.println("parking is full");
            return null;
        }
        else
        {
            if(vehicle.getType() == "regular")
            {
                if(isRegularFull()){
                    System.out.println("parking is full");
                    return null;}
                else {
                    Spot spot = new Spot("regular");
                    Ticket ticket = new Ticket(vehicle ,spot);
                    regularSpots.add(ticket);
                    System.out.println("new regular vehicle is added");
                    return ticket;
                }
            }
            else {
                    if(!isCompactFull()){
                        Spot spot = new Spot("compact");
                        Ticket ticket = new Ticket(vehicle ,spot);
                        compactSpots.add(ticket);
                        System.out.println("new compact vehicle is added");
                        return ticket;
                    }
                    else if(!isRegularFull()){
                        Spot spot = new Spot("compact");
                        Ticket ticket = new Ticket(vehicle ,spot);
                        regularSpots.add(ticket);
                        System.out.println("new compact vehicle is added");
                        return ticket;
                    }
                    else {
                        System.out.println("parking is full");
                        return null;}
            }
        }
    }
}
