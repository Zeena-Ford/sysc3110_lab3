import java.util.ArrayList;

/**
 * @author Zeena Ford, 101229954
 * @version september 18 2023
 */

public class AddressBook {

    private ArrayList<BuddyInfo> buddyList;

    // constructor
    public AddressBook(){
        buddyList = new ArrayList<BuddyInfo>();
    }


    // add method
    public void addBuddy(BuddyInfo addBud){ buddyList.add(addBud); }

    // remove method
    public void removeBuddy(BuddyInfo removeBud){buddyList.remove(removeBud);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Zeena", "greenland street", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy); //added text to file
    }

}
