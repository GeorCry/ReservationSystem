package BusTicketSystem;

public class Ticket {
    private Passenger[] passengers;

    public Ticket(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }
}
