public class Main {
    public static void main(String[] args) {

        //** this is a simple main class to test the classes, you can make a complete theme park with this classes if you want ***/

        Ride rollerCoaster = new Ride("Roller Coaster", 5, 3);
        Visitor kourosh = new Visitor("Kourosh");
        VIPVisitor ali = new VIPVisitor("Ali");

        rollerCoaster.addVisitor(kourosh);
        rollerCoaster.addVisitor(ali);
        rollerCoaster.startRide();
    }
}