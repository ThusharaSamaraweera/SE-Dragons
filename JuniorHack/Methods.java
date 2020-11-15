package SEgragons.JuniorHack;
import java.util.ArrayList;

public class Methods {
    private String Number;
	private ArrayList<Contact> myContact;
    
    public Methods(String Number) {
		this.Number = Number;
		this.Contact = new ArrayList<Contact>();
    }
    
    public void display() {
		for(int i = 0; i < this.myContact.size(); i++) {
            System.out.println(this.myContact.get(i).getName() + 
                                "  " + this.myContact.get(i).getPhoneNo());
		}
    }

    public void addContact(Contact contact){
        myContact.add(contact);
        System.out.println("Contact added");
    }

    public void editContact(Contact contact){
        myContact.add(contact);
        System.out.println("Contact edited");
    }


    public void removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if(foundPosition < 0) {
			System.out.println(contact.getName() + " , was not found");
		}
		this.myContact.remove(foundPosition);
		System.out.println(contact.getName() + " was deleted");
    }

    public String checkContact(Contact contact) {
			return contact.getName();
	}
    
    public Contact checkContact(String name) {
		int position = findContact(name);
		if(position >=0) {
			return this.myContact.get(position);
		}
		return null;
	}
}