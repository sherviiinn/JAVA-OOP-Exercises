public class Court {
    private String courtname;
    private boolean[] time =  new boolean[5];
    public Court(String courtname){
        this.courtname = courtname;
        for(int i=0; i<5; i++){
            time[i] = true;
        }
    }
    public String getCourtname() {
        return courtname;
    }
    public void bookCourt(int clock) {
        if(time[clock]){
            time[clock] = false;
            System.out.println("Court " + courtname + " at "+clock*2+1+"-"+(clock+1)*2+1+" booked successfully");
            return;
        }
        System.out.println("Court " + courtname + " at "+clock*2+1+"-"+(clock+1)*2+1+" is booked");
    }
    public void unBookCourt(int clock) {
        if(!time[clock]){
            time[clock] = true;
            System.out.println("Court " + courtname + " at "+clock*2+1+"-"+(clock+1)*2+1+" unbooked successfully");
            return;
        }
        System.out.println("Court " + courtname + " at "+clock*2+1+"-"+(clock+1)*2+1+" is not booked yet");
    }
    public boolean isAvailable(int clock) {
        if(time[clock]){
            return true;
        }
        return false;
    }
}