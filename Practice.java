import javax.lang.model.util.ElementScanner14;
import java.util.Scanner;

public class Practice{
public static void main(String[] args) {
    System.out.println("hello there person");
    int numPotato;
    numPotato = 5;
    System.out.println("welcome to Kevin's potato generator!");
    System.out.println("I have " + numPotato + " potatoes");
    System.out.println("How many would you have if you grew potatoes?");
    System.out.println("I don't think you could even grow a plentiful number of carrots though.");
  
    // This is for the potato generator //
    System.out.println("Anyways, I will now guess the number of potatoes you have");
    int number = (int)(Math.random()*100);
    System.out.println("Hmmm, it seems as if you have " + number  + " potatoes");
    
    
    if(number < 25)
    {
        System.out.println("Hmpf, such a small number of potatoes. Pathetic");
    }
    if(number > 25 && number < 50)
    {
        System.out.println("This is a reasonable number of potatoes, not great but could be worse");
    }
    if(number > 50 && number < 75)
    {
        System.out.println("Wow! That's actually pretty impressive");
    }
    if(number > 75)
    {
        System.out.println("OH MY GOD YOU'RE SO GOOD AT FARMING!!!!");
    }

        }
}

