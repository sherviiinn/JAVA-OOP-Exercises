public class player {
    private String name;

    public player(String name) {
        this.name = name;
    }
    public boolean bookCourt(Court court , int n) {
        if (court.isAvailable(n)) {
            System.out.println(name + " successfully booked a " + court.getCourtname() + " court at "+n*2+1+"-"+(n+1)*2+1 );
            return true;
        }
        System.out.println("Court is already booked!");
        return false;
    }
}
