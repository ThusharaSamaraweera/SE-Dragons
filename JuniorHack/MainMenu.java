package SEgragons.JuniorHack;
import java.util.*;
import java.io.File; // Import file class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class MainMenu {
   //create file 
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
	//read file
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
	
	
	
	
	
	//add contact
	
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
          
    public static void main(String[] args) {
        int a;
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

            a = input.nextInt();

            switch(a){
                case 1:
			
                    break;
                case 2:
			
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
			    read();
                    break;
                case 6:
			    addContact(); // SaveContact is also in inside of add contact method   
                    break;
            }
        }while(a!=7);
    }
}
