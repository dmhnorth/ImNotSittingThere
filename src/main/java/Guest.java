public class Guest {

    private String name = "";
    private double tilt = 0;

    public Guest(String name){
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String guestDetailsToString() {
        return getName();
    }

    public double getTilt() {
        return tilt;
    }

    public void setTilt(double tilt) {
        this.tilt = tilt;
    }
}
