public class Runway {
    
    private boolean canLand;
    private Flight flight;

    // Constructor
    public Runway()
    {
        flight = null;
    }
    
    // Not necessary, but allows the Runway to link to the flight.
    public void setFlight(Flight air) {
        flight = air;
    }

    // Gets Flight that is linked to the runway.
    public Flight getFlight() {
        return flight;
    }
    
    // Gets boolean value whether or not landing is possible
    // True if runway is empty, false otherwise.
    public boolean getLandStatus() {
        return canLand;
    }

    // Sets Runway to be occupied.
    public void reserveRunway() {
        canLand = false;
    }
    // Sets Runway to be open.
    public void clearRunway() {
        canLand = true;
    }

    // Tells Flight that landing is possible.
    public void land() {
        System.out.println("Landing Granted.");
    }

}
