/*
 * ConcreteMediator : It implements the Mediator interface and coordinates communication between colleague objects.
 */
public class ConcreteMediator implements Mediator {
    private Flight flight;
    private Runway runway;
    private boolean land;

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.land = status;
    }
}
