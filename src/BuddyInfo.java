/**
 * BuddyInfo models the info of a person.
 *
 * @author Yasir Sheikh - 101181462
 * @version 1.00
 */
public class BuddyInfo {

    /** The name of the person */
    private String name;
    /** The number of the person */
    private String number;
    /** The address of the person */
    private String address;

    /**
     * Creates a new BuddyInfo object by initializing the fields, name, address, and number,
     * as empty strings.
     *
     */
    public BuddyInfo() {
        this.name = "";
        this.address = "";
        this.number = "";
    }

    /**
     * Creates a BuddyInfo object by initializing the name, number, and address fields with the provided
     * parameters.
     *
     * @param name: A String representing the name of the person
     * @param number: A String representing the number of the person
     * @param address: A String representing the address of the person
     */
    public BuddyInfo(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    /**
     * Returns the name of person.
     * @return The name of a BuddyInfo object
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the number of person.
     * @return The number of a BuddyInfo object
     */
    public String getNumber() {
        return number;
    }

    /**
     * Returns the address of person.
     * @return The address of a BuddyInfo object
     */
    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {

        //Instantiating a BuddyInfo object
        BuddyInfo buddyInfo = new BuddyInfo("Yasir","777-888-9999", "101 Street Rd");
        //Printing Hello + person's name
        System.out.println("Hello " + buddyInfo.getName());
    }
}

