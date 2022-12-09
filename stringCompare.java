import java.util.Arrays;
import java.util.Scanner;
public class stringCompare {
    public static void main(String[] args) {

        //int [] numbers = {100,15,-5,-3,1,90,0,30,};
        String [] names = {"Bob", "Sandy", "John", "Abe"};

        System.out.println(names[0].compareTo(names[2]));

        String currentElement;
        for (int i=1; i < names.length; i++) {
            currentElement = names[i];
            int j;
            for(j = i - 1; j >= 0 && names[j].compareTo(currentElement) > 0; j--) {
                names[j+1] = names[j];
            }
            names[j+1] = currentElement;
            System.out.println(Arrays.toString(names));
        }


    }
    
}
