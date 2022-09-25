import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> listOfBuddies;

    public AddressBook() {
        this.listOfBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy)
    {
        listOfBuddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy)
    {
        listOfBuddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo  buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Fixed");
    }




}
