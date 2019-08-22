package com.company;

import java.util.Date;

public class Ticket {
    private  Date startTime;
    private Vehicle vehicle;
    private  Spot spot;

    public Ticket(Vehicle v, Spot s) {
        startTime = new Date();
        this.vehicle = v;
        this.spot = s;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle v) {
        this.vehicle = v;
    }
}
