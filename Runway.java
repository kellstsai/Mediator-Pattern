/*
 * A Concrete colleage that implements the Colleague interface and communicates with other colleagues through its mediator
 */
public class Runway implements Command {

    private ConcreteMediator atcMediator;

    public Runway(ConcreteMediator atcMediator) {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
        // whenever the runway constructor is called, the plane is on the runway so its
        // landing status is true
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted....");
        atcMediator.setLandingStatus(true);
    }

}
