package SEgragons.JuniorHack;
import java.util.*;
import java.io.File; 
import java.io.IOException; 
import java.io.FileWriter; 
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Select an Option");
            System.out.println("Enter 1 to display all contacts");
            System.out.println("Enter 2 to add contact");
            System.out.println("Enter 3 to remove contact");
            System.out.println("Enter 4 to edit a contact");
            System.out.println("Enter 5 to load contacts from a text file.");
            System.out.println("Enter 6 to save contacts to the text file.");
            System.out.println("Enter 7 to exit from the program");

            choice = input.nextInt();

            switch(choice){
                case 1:
                    Methods.display();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    deleteContact()
                    break;
                case 4:
                    editContact()
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(a!=7);
    }

    private static void addContact() {
		System.out.println("Please enter name ");
		String name = scanner.nextLine();
		System.out.println("Please add phone number");
		String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        Methods.addContact(newContact);
    }


    private static void editContact() {
		System.out.println("Please enter name of the contact that you want to change: ");
		String name = scanner.nextLine();
        Contact upContact = Methods.checkContact(name);
        
		System.out.println("Please enter the new phone number");
		String newNumber = scanner.nextLine();
		
        Contact newContact = Contact.createContact(name, newNumber);
        
        Methods.editContact(upContact, newContact);

    }
    

    private static void deleteContact() {
		System.out.println("Please enter name of the contact that you want to delete");
		String name = scanner.nextLine();
		Contact extContact = Methods.removeContact(name);
	}

	
	public static void createFile(){
		try {
		      File myObj = new File("ContactList.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
   }
	public static void read() {
	 
	 try {
	      File myObj = new File("ContactList.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
 	}
	
   public static void  addContact(String name,String number){
	
	 System.out.println("Enter name");
	 Scanner add = new Scanner(System.in);
	 name = add.nextLine();
	
	 System.out.println("Enter number");
	 number = add.nextLine();
	 add.close();
	 
	 try {
	      FileWriter myWriter = new FileWriter("ContactList.txt");
	      myWriter.write(name+number);
	      myWriter.close();
	      System.out.println("Successfully add to contacts.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	 
   }
}
