import java.util.*;
public class TextGame {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int choice;
        System.out.println("Your execution date is later today!");
        System.out.println("1. what do you mean");
        System.out.println("2. no please dont i dont wanna die");
        choice = scnr.nextInt();
        String name;

        if(choice == 1) {
            System.out.println("Blasempous! You died!");
            System.out.println("Game over!");
        }
        else if(choice == 2){
            System.out.println("Okay fine you dont die anymore! anyway who are you?");
            scnr.nextLine();
            System.out.println("Input your name: ");
            name = scnr.nextLine();
            System.out.println("So your name is " + name + " huh? Thats pretty rad");


        }


    }


}
