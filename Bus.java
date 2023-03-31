package BusTicketSystem;

public abstract class Bus {
    protected String busType;
    protected String plateNumber;
    protected int numberOfSeats;
    protected Ticket[][] seatLayout;

    public Bus(String busType, String plateNumber, int numberOfSeats, Ticket[][] seatLayout) {
        this.busType = busType;
        this.plateNumber = plateNumber;
        this.numberOfSeats = numberOfSeats;
        this.seatLayout = seatLayout;
    }

    public String getBusType() {
        return busType;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfFreeSeats() {
        int count = 0;
        for (int i = 0; i < seatLayout.length; i++) {
            for (int j = 0; j < seatLayout[i].length; j++) {
                if (seatLayout[i][j].getTicketReference() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public void sellSeat(int row, int column, Ticket ticket) {
        seatLayout[row][column].setTicketReference(ticket);
    }

    public void makeSeatFree(int row, int column) {
        seatLayout[row][column].setTicketReference(null);
    }

    public abstract String getSeatLayoutString();
}
