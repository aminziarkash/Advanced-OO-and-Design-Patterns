package com.az.ocp.aooadp.singleton.problem;

import java.util.HashSet;
import java.util.Set;

//SINGLETON PROBLEM
public class Show {

    private Set<String> availableSeats;

    public static void ticketAgentsBooked(String seat) {
        Show show = new Show();
        System.out.println("Booking seat succeeded\t:\t" + show.bookSeat(seat));
    }

    public Show() {
        availableSeats = new HashSet<String>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
