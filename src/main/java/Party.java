import java.util.ArrayList;
import java.util.Scanner;

public class Party {



    private int noOfGuests;
    private String partyName;
    private ArrayList<Guest> guestList = new ArrayList<Guest>();
    private ArrayList<Party> partyList = new ArrayList<Party>();
    private String partyHostName;
    private Scanner sc = new Scanner(System.in);

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

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
            }
        }
        printPartyGuestList();
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
        System.out.println("\nCurrently, the people going to '" + getPartyName() + "' hosted by '" + getPartyHostName() + "' are:");
        for (Guest g : guestList) {
            System.out.println(g.guestDetailsToString());
        }
    }

    public void printPartyTablesList(){
        System.out.println("\nCurrently, the people going to '" + getPartyName() + "' hosted by '" + getPartyHostName() + "' are sitting on these tables:");
        for (Party p : partyList) {
            printPartyTable(p);
        }
    }

    public void printPartyTable(Party party){
        System.out.println("The people on the table " + party.getPartyName() + " are:");
        for (Guest g : party.getGuestList()){
            System.out.println(g.getName());
        }
        System.out.println("\n");
    }

}
