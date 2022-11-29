public class Flight{

    private Runway runway;

    // Constructor
    public Flight() {
        runway = null;
    }
    // Establishes Runway that the Flight will attempt to land to.
    public void setRunway(Runway road) {
        runway = road;
    }

    // Checks with Runway if it is okay to land.
    // Reusability problem and can get repetitive.
    public void canLand() {
        if(runway.getLandStatus() == true) {
            runway.land();
            successLand();
        }
        else {
            System.out.println("Cannot Land. Runway Occupied.");
        }
    }

    // The current flight proceeds to land.
    public void successLand()
    {
        System.out.println("Successful Landing.");
        runway.reserveRunway();
    }

}