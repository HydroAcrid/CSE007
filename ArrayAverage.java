/*
Kevin Dotel
9/30/21
CSE 7: Week 6 Participation
This is the ArrayAverage program.
*/
public class ArrayAverage {
    public static void main(String[] args) {
        
        int[] number = new int[10];
        int num = (int)(Math.random()*20+1);
        for(int index= 0; index < number.length; index++) {
            number[index] = (int)(Math.random()*20+1);
            System.out.println(number[index]);
        }

        //This finds the largest value in the array, we set the first value in the array to zero starting our loop 
        int largest = number[0];
        int largestIndex = 0;
        for(int index = 1; index < number.length; index++) {
            if(number[index] > largest) 
                largest = number[index];
                largestIndex = index;
        }
        System.out.println("Largest value is " + largest);

        //This finds the smallest value in the array.
        int smallest = number[0];
        int smallestIndex = 0;
        for(int index = 1; index < number.length; index++) {
            if(number[index] < smallest) //cycles through each integer until the code finds the smallest one
                smallest = number[index];
                smallestIndex = index;
        }
        System.out.println("Smallest value is " + smallest);

        //for loop to find the smallest using the example of largest but create a smallest variable and set to numer[0] 
        //then change the if statement to if(number[index] < smallest)
        int sumVal = number[0] + number[1] + number[2] + number[3] + number[4] + number[5] + number[6] + number[7] + number[8] + number[9];
        //for loop that gets the sum of all the integers in the array number 
        double average = (double) sumVal / number.length; //this is an integer divide unless i explicitly cast an integer to a double 
        System.out.println("The average is " + average);
        System.out.println("Have a great day!");








    }
    
}
