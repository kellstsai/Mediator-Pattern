public class testDriver {
    public static void main(String[] args) {
        // instantiate the concerete mediator, flight and runway
        ConcreteMediator atcMediator = new ConcreteMediator();
        Flight Plane1 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);

        // actMediator object has a private Flight, Runway and land
        atcMediator.registerFlight(Plane1); // we register the object Plane1 as a private Flight in actMediator

        atcMediator.registerRunway(mainRunway);// we register the object mainRunway as a private runway in actMediator

        // By default, whenever ther isntance of runway is created, the landing status
        // of it is true... (we made it like that)
        System.out.println("boolean land = " + atcMediator.isLandingOk());
        Plane1.land();
        System.out.println("\n");

        // Here we set the landing status to false with ConcreteMediator class
        // and we see how it changes the status of Plane1
        System.out.println("Setting landing status to false...");
        atcMediator.setLandingStatus(false); // changing status with concretemediator class
        Plane1.land();// checks to see if landing status is true/false with the Flight class and
                      // returns appropriate string
        System.out.println("boolean land = " + atcMediator.isLandingOk());// checks to see if landing status is
                                                                          // true/false with the ConcreteMediator class
        System.out.println("\n");

        // the land method from the runway class sets the land status to true whenever
        // called
        mainRunway.land();
        System.out.println("boolean land = " + atcMediator.isLandingOk());

    }
}
