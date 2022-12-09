import java.util.Scanner;
public class patternRecognition {
    public static void main(String[] args) {
        
        int triangleHeight = 5;
        int triangleChar = 1;

        for (int i = 1; i <= triangleHeight; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(triangleChar++);
            }
            System.out.println();
        }






    }
    
}
