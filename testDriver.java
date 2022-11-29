public class testDriver {
    public static void main(String[] args) {
        ConcreteMediator atcMediator = new ConcreteMediator();
        Flight Plane1 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);

        atcMediator.registerFlight(Plane1); // register Plane 1 as a private flight 

        atcMediator.registerRunway(mainRunway);// register mainRunway as private runway

        System.out.println("boolean land = " + atcMediator.isLandingOk());
        Plane1.land();
        System.out.println("\n");

        System.out.println("Setting landing status to false...");
        atcMediator.setLandingStatus(false); // changing status with concretemediator class
        Plane1.land();// checks to see if landing status is true/false with the Flight class 

        System.out.println("boolean land = " + atcMediator.isLandingOk());// checks to see if landing status is true/false
                                                                         
        System.out.println("\n");

        mainRunway.land();
        System.out.println("boolean land = " + atcMediator.isLandingOk());

    }
}
