/*
 * A Concrete colleage that implements the Colleague interface and communicates with other colleagues through its mediator
 */
public class Flight implements Command {

    private ConcreteMediator atcMediator;

    public Flight(ConcreteMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    /*
     * 
     */
    @Override
    public void land() {
        if (atcMediator.isLandingOk()) {
            System.out.println("Successfully landed....(true)");
            atcMediator.setLandingStatus(true);
        } else {
            System.out.println("Waiting for landing....(false)");
        }
    }

    public void getReady() {
        System.out.println("Ready for landing....");
    }

}
