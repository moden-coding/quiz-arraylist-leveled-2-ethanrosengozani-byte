
/**
    * You are going to write code to store a list of participant names for a 
    * local event. You will create an ArrayList for Strings, then accept user 
    * input to add names to that ArrayList. There will be additional modifications 
    * you can make:

    * B Level:
    * Accept input from users and add names to the ArrayList.

    * B+ Level:
    * Accept names from users and stop accepting input when the user enters "end". 
    * After this, the full list of names should be printed, one name per line.

    * A- Level:
    * Complete B and B+. Additionally, do not allow duplicates. If the user enters a 
    * name that already exists, tell them that the name has already been entered, but 
    * continue accepting new names.

    * A+ Level:
    * Complete B and B+. Modify A- so that when a duplicate name is entered, the user 
    * is asked whether they want to delete the existing name. If they enter "yes", the 
    * name is removed from the list. If they type anything else, the duplicate name is 
    * ignored, and no change is made to the list.
*/
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {// main method
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> participantNames = new ArrayList<>();// creates our array list

        while (true) {
            System.out.print("Enter a participant name (or end to finish): ");
            String name = scanner.nextLine().trim();
            if (name.equals("end")) {
                break;
            }

            if (participantNames.contains(name)) {// if it is in there
                System.out.print("This name already exist. Do you want to remove it? (yes/no): ");
                String response = scanner.nextLine().trim();// then checks to see if they want to remove it
                if (response.equalsIgnoreCase("yes")) {// yes then remove it
                    participantNames.remove(name);
                } else if (response.equalsIgnoreCase("no")) {// no then do not remove it
                    // ignore the duplicate one
                } else {
                    System.out.println("Please enter one of the 2 given options:");// making sure that only those 2 options
                                                                                   // are being entered
                }
            } else {
                participantNames.add(name);// adds our new name that we gave
            }
        }

        System.out.println("Participant Names:");
        for (String participantName : participantNames) {
            System.out.println(participantName);
        }

        scanner.close();
    }
}


