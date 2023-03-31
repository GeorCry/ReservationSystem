package BusTicketSystem;

public class Passenger {
    private String name;
    private char gender;

    public Passenger(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
}
