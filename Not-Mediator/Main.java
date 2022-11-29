/*
 * The main problem with not using mediator is that most of the classes are tightly-coupled with
 * each other. It is a limiter that inhibits the level of reusability for a certain class.
 * Suppose that if I wanted to add a new factor that influences the runway, for instance buses,
 * I would have to go back into the code and modify the old code to factor in the bus.
 * 
 * It would involve making a new Bus class, modifying code to check for both bus and flight.
 * 
 * Alternatively, if I wanted to add a new flight to check the runway, the code for checking
 * to land would be reused, and is unecesssary, as seen in the Flight class. Furthermore, because
 * of tightly-coupled components, it would add a layer of difficulty to ensure all factors are
 * being considered to this runway.
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Creating flight objects and runway...");
        Flight plane = new Flight();
        Runway LGB = new Runway();

        plane.setRunway(LGB);

        LGB.setFlight(plane);
        LGB.clearRunway();

        System.out.println("Running Plane to land...");

        plane.canLand();

        System.out.println("Finish single plane.");






    }

}
