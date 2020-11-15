package SEgragons.JuniorHack;
import java.util.*;

public class MainMenu {
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
                    break;
                case 6:
                    break;
            }
        }while(a!=7);
    }
}
