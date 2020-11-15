package SEgragons.JuniorHack;
import java.util.ArrayList;

public class Contact {
    private String name;
    private String phoneNo;

    public Contact(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
    }
    
    public static Contact createContact(String name, String phoneNo){
        return new Contact(name, phoneNo);
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNo(){
        return this.phoneNo;
    }

    ArrayList<String> ContactList = new ArrayList<String>();

    public ArrayList<String> getList() {
		return ContactList;
	}
 
	public void storeContacts(String names) {
		ContactList.add(names);
	}
	
}