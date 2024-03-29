import java.util.ArrayList;
import java.util.Scanner;

public class Party {


    private int noOfGuests;
    private String partyName;
    private ArrayList<Guest> guestList = new ArrayList<Guest>();
    private ArrayList<PartyTable> tableList = new ArrayList<PartyTable>();
    private String partyHostName;
    private Scanner sc = new Scanner(System.in);
    private int tableSize;

    public Party() {
        //empty constructor
    }

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
                return;
            } else {
                Guest g = new Guest(name);
                System.out.println("You've added '" + g.getName() + "' to the party");
                guestList.add(g);
                assignGuestToPartyTable(g);
            }
        }
    }

    private void assignGuestToPartyTable(Guest g) {
        //creates a new table and adds them to it
        if (tableList.isEmpty()) {
            PartyTable pt = new PartyTable(g.getName() + "'s table");
            pt.getGuestList().add(g);
            tableList.add(pt);
        } else {
            PartyTable temp = null;
            for (PartyTable pt : tableList) {
                if(pt.getGuestList().size() == tableSize) {
                    System.err.println("This table " + pt.getTableName() + " is full SO THE PERSON WASN'T ADDED");
                    continue;
                } else if (pt.getGuestList().size() != tableSize ) {
                    pt.getGuestList().add(g);
                } else {
                    PartyTable pt2 = new PartyTable(g.getName() + "'s table");
                    pt2.getGuestList().add(g);
                    temp = pt2;
                    System.out.println("There's a new table: " + pt2.getTableName() + "'s table");
                }
            }
            if (temp != null){
                tableList.add(temp);//You can't add to a list you're iterating over
            }
        }
    }

    private void shuffleTables() {
        //TODO shuffle the tables once they have been set
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

    public void printPartyGuestList() {
        System.out.println("\nCurrently, the people going to '" + getPartyName() + "' hosted by '" + getPartyHostName() + "' are:");
        for (Guest g : guestList) {
            System.out.println(g.guestDetailsToString());
        }
    }

    public void printPartyTablesList() {
        System.out.println("\nCurrently, the people going to '" + getPartyName() + "' hosted by '" + getPartyHostName() + "' are sitting on these tables:");

        if (tableList.isEmpty()) {
            System.out.println("There are no tables set.");
        } else {

            for (PartyTable pt : tableList) {
                printPartyTable(pt);
            }
        }
    }

    public void printPartyTable(PartyTable pt) {
            System.out.println("The people on the table " + pt.getTableName() + " are:");
            for (Guest g : pt.getGuestList()) {
                System.out.println(g.getName());
            }
            System.out.println("\n");
        }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
    }

    public int getTableSize() {
        return tableSize;
    }
}

