/*
Kevin Dotel
9/14/21
CSE 7: Lab 1
This is the BinaryConversion program.
*/

/*
a) A numbering system is a writing system for expressing numbers. 
b) Binary is an important numbering system as it simplifies the design of computers through its straightforward implementation. 
c) Two examples of number systems inlcude the decimal number system and the octal number system. The purpose of the decimal number system is to perform 
   arithmetic operations. The purpose of the octal number system is to convert large binary numbers into smaller groups of information. 
d)The biggest value an intger can hold is 2,147,483,647. Its binary value is 01111111111111111111111111111111.
*/

import java.util.Scanner; 

public class BinaryConversion {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        long decimal = 0;
        long bit; 
        long p = 1;
        long remainder;
        long newBit;
        
        System.out.println("Enter a binary number (must be 4 bits)");
        bit = scnr.nextLong();
        newBit = bit;

        while (bit != 0) 
        {
            remainder = bit % 10;
            decimal = decimal + remainder * p;
            p = p * 2;
            bit = bit / 10;
        }
            System.out.println("The decimal equivalent of the binary number " + newBit + " is: " + decimal);
        
        
    
    


        


    }




    
}
