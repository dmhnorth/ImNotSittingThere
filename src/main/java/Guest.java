import java.util.ArrayList;

public class Guest {

    private String name = "";
    private ArrayList<Guest> blackList;

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


    public ArrayList<Guest> getBlackList() {
        return blackList;
    }

    public void setBlackList(ArrayList<Guest> blackList) {
        this.blackList = blackList;
    }
}
