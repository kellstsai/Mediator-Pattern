/*
 * It defines the interface for communication between colleague objects.
 */
public interface Mediator {
    public void registerRunway(Runway runway);

    public void registerFlight(Flight flight);

    public boolean isLandingOk();

    public void setLandingStatus(boolean status);
}