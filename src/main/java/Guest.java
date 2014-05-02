public class Guest {

    private String name = "";

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
}
