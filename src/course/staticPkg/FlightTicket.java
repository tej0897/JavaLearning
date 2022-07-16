package course.staticPkg;

public class FlightTicket {
    public int flightNumber;
    public int seatNumber;
    public String ticketType;
    public int tickerID;

    public static int availableSeats = 2;

    public FlightTicket(int flightNumber, int seatNumber, String ticketType, int tickerID) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketType = ticketType;
        this.tickerID = tickerID;
    }

    public static void main(String[] args) {

        createTickets(1111, 24, "Business", 1221);
        createTickets(1112, 23, "Economy", 1222);
        createTickets(1113, 25, "Business", 1224);

    }

    private static void createTickets(int i, int i2, String type, int i3) {
        if (availableSeats > 0) {
            FlightTicket ticket1 = new FlightTicket(i, i2, "type", i3);
            availableSeats--;
            System.out.println("Number of seats available now are: " +availableSeats);
        } else {
            System.out.println("NO TICKETS AVAILABLE");
        }
    }
}
