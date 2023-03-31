package BusTicketSystem;

public class DoubleDeckerBus extends Bus {
    private int upperDeckRows;

    public DoubleDeckerBus(String plateNumber, Ticket[][] seatLayout, int upperDeckRows) {
        super("Double Decker Bus", plateNumber, seatLayout.length * seatLayout[0].length, seatLayout);
        this.upperDeckRows = upperDeckRows;
    }

    public int getUpperDeckRows() {
        return upperDeckRows;
    }
    public String getSeatLayoutString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seatLayout.length; i++) {
            for (int j = 0; j < seatLayout[i].length; j++) {
                if (i < upperDeckRows) {
                    sb.append(seatLayout[i][j].getTicketReference() == null ? "O" : "X");
                } else {
                    sb.append(seatLayout[i][j].getTicketReference() == null ? "O" : "X");
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


