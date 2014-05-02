import java.util.ArrayList;
import java.util.Scanner;

public class Party {



    private int noOfGuests;
    private String partyName;
    private ArrayList<Guest> guestList = new ArrayList<Guest>();
    private String partyHostName;
    private Scanner sc = new Scanner(System.in);


    public int getNoOfGuests() {
        return noOfGuests;
    }

    public void setNoOfGuests(int noOfGuests) {
        this.noOfGuests = noOfGuests;
    }

    public void addGuests(int noOfGuests) {

        String name;
        for (int x = 0; x < noOfGuests; x++) {

            System.out.println("Enter a guest name (ENTER to finish): ");
            name = sc.nextLine();

            if (name.isEmpty()) {
                printPartyGuestList();
                return;
            } else {
                Guest g = new Guest(name);
                guestList.add(g);
                System.out.println("You've added '" + g.getName() + "' to the party");
                printPartyGuestList();
            }
        }
    }


    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public void setPartyHostName(String partyHostName) {
        this.partyHostName = partyHostName;
    }

    public String getPartyHostName() {
        return partyHostName;
    }

    public void printPartyGuestList(){
        for (Guest g : guestList){
            System.out.println(g.getName());
        }
    }

}
