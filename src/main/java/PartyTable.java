import java.util.ArrayList;

public class PartyTable {

    private ArrayList<Guest> guestList = new ArrayList<Guest>();
    private String tableName;

    public PartyTable(String tableName){
        this.tableName = tableName;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public String getTableName() {
        return tableName;
    }
}
