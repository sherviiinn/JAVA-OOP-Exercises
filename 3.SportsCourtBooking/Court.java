public class Court {
    private String name;
    private boolean available = true;
    public Court(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isAvailable() {
        return available;
    }
    public void BookCourt() {
        System.out.println("Court " + name + " Successfully booked");
        available = false;
    }

}