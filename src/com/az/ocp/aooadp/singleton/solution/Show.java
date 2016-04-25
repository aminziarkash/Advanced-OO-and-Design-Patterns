package com.az.ocp.aooadp.singleton.solution;

import java.util.HashSet;
import java.util.Set;

//SINGLETON SOLUTION (EAGER INITIALIZATION)

public class Show {

    private static final Show INSTANCE = new Show();

    private Set<String> availableSeats;

    public static Show getInstance() { // Now this can be used to get the same instance initialize above
        return INSTANCE;
    }

    private Show() { // Made the constructor private so that callers can't create it directly anymore
        availableSeats = new HashSet<String>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static void ticketAgentsBooked(String seat) {
        Show show = Show.getInstance(); // getIntance
        System.out.println("Booking seat succeeded\t:\t" + show.bookSeat(seat));
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
