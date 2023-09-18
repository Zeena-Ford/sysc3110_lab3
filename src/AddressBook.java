import java.util.ArrayList;



public class AddressBook {

    ArrayList<BuddyInfo> list = new ArrayList<>();
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Zeena", "greenland street", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo addBud){

        list.add(addBud);
    }

    public void removeBuddy(BuddyInfo removeBud){
        list.remove(removeBud);
    }

}