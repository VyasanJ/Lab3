import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public  void addBuddy(BuddyInfo b){
        if(b != null) {
            buddies.add(b);
        }
    }

    public BuddyInfo removeBuddy(int i){
        if(i >= 0 && i < buddies.size()) {
            return buddies.remove(i);
        }
        return null;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Homer");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(0);

        System.out.println("homer");
    }
}
