import java.util.Scanner;

public class PartyController {



    public void start() {
        Scanner sc;
        sc = new Scanner(System.in);

        Party p = new Party();

        System.out.println("What is the party Host's name? ");
        p.setPartyHostName(sc.nextLine());
        System.out.println("The party host is called: '" + p.getPartyHostName() + "'");

        System.out.println("What is the name of the party? ");
        p.setPartyName(sc.nextLine());
        System.out.println("The party is called: '" + p.getPartyName() + "'");

        System.out.println("How many people are there to a table?");
        p.setTableSize(Integer.parseInt(sc.nextLine()));
        System.out.println("That's " + p.getTableSize() + " guests per table");

        System.out.println("How many guests would you like?: ");
        p.setNoOfGuests(Integer.parseInt(sc.nextLine()));
        System.out.println("So you're having " + p.getNoOfGuests() + " guests?!");

        System.out.println("Let's add the guests to the party...");
        p.addGuests(p.getNoOfGuests());

        p.printPartyGuestList();
        p.printPartyTablesList();


    }
}
