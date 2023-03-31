package BusTicketSystem;

public class SingleDeckerBus extends Bus {
    public SingleDeckerBus(String plateNumber, Ticket[][] seatLayout) {
        super("Single Decker Bus", plateNumber, seatLayout.length * seatLayout[0].length, seatLayout);
    }

    public String getSeatLayoutString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seatLayout.length; i++) {
            for (int j = 0; j < seatLayout[i].length; j++) {
                sb.append(seatLayout[i][j].getTicketReference() == null ? "O" : "X");
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
