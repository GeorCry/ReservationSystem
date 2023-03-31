package BusTicketSystem;

public class Main {
    public static void main(String[] args) {
        // Single Decker Bus with 3 rows and 4 columns
        Ticket[][] singleDeckerSeatLayout = new Ticket[3][4];
        for (int i = 0; i < singleDeckerSeatLayout.length; i++) {
            for (int j = 0; j < singleDeckerSeatLayout[i].length; j++) {
                Passenger[] passengers = new Passenger[1];
                passengers[0] = new Passenger("", ' ');
                singleDeckerSeatLayout[i][j] = new Ticket(passengers);
            }
        }
        SingleDeckerBus singleDeckerBus = new SingleDeckerBus("ABC-123", singleDeckerSeatLayout);

        // Double Decker Bus with 5 rows and 4 columns on each deck
        Ticket[][] doubleDeckerSeatLayout = new Ticket[5][4];
        for (int i = 0; i < doubleDeckerSeatLayout.length; i++) {
            for (int j = 0; j < doubleDeckerSeatLayout[i].length; j++) {
                Passenger[] passengers = new Passenger[1];
                passengers[0] = new Passenger("", ' ');
                doubleDeckerSeatLayout[i][j] = new Ticket(passengers);
            }
        }
        DoubleDeckerBus doubleDeckerBus = new DoubleDeckerBus("DEF-456", doubleDeckerSeatLayout, 2);

        // Sell single ticket on Single Decker Bus
        Passenger passenger1 = new Passenger("Alice", 'F');
        Ticket ticket1 = new Ticket(new Passenger[]{passenger1});
        singleDeckerBus.sellSeat(0, 1, ticket1);
        System.out.println(singleDeckerBus.getSeatLayoutString());

        // Sell two tickets on Double Decker Bus
        Passenger passenger2 = new Passenger("Bob", 'M');
        Passenger passenger3 = new Passenger("Charlie", 'M');
        Ticket ticket2 = new Ticket(new Passenger[]{passenger2, passenger3});
        doubleDeckerBus.sellSeat(2, 1, ticket2);
        System.out.println(doubleDeckerBus.getSeatLayoutString());
    }
}



