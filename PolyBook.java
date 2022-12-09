/*
Kevin Dotel
12/4/21
CSE 7: Activity
This is the PolyBook program
*/
import java.util.*;
public class PolyBook {

    public Polybook() {
    }

    private static Book[] literature = new Polybook[10];
    private static Encyclopedia encyclopedia = new Polybook();
    private static Book1 book = new Book1();
    public static void main(String[] args) {
        
        //This is where the calls to the mmain function would be. I'm having difficulty figuring these out. It would be very similar to bookinformation

        Scanner scnr = new Scanner(System.in);

        boolean run = true;
        do {
            System.out.println("Type B to enter a Book, E to enter an Encyclopedia, or anything else to be done");
            char userChoice = Character.toUpperCase(scnr.nextLine().charAt(0));
            if (userChoice == 'B') {
                getBook(); // a method to read in user information in order to create a new Book object to
                           // be held in the books array
            } else if (userChoice == 'E') {
                getEncyclopedia(); // a method to read in user information in order to create a new Encyclopedia
                                   // object to be held in the encyclopedias array
            } else {
                run = false;
            }
        } while (run && (numBooks<10||numEncyclos<10));

        printInfoAll(); // a method to print information for the books objects then the encyclopedia
                    // objects.
    }


    
    
}
