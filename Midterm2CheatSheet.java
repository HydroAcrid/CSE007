public class Midterm2CheatSheet {
    public static void main(String[] args) {

        //Topics covered for this Exam
            //Arrays
            //Searching
                //Linear Searching - Searches for something one at a time; pretty slow.
    //             public static int search(int arr[], int x)
    // {
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++)
    //     {
    //         if (arr[i] == x)
    //             return i;
    //     }
    //     return -1;
    // }
 
    // // Driver code
    // public static void main(String args[])
    // {
    //     int arr[] = { 2, 3, 4, 10, 40 };
    //     int x = 10;
 
    //     // Function call
    //     int result = search(arr, x);
    //     if (result == -1)
    //         System.out.print(
    //             "Element is not present in array");
    //     else
    //         System.out.print("Element is present at index "
    //                          + result);
    // }

                //Binary Searching - The one actually used; repeatdedly divides the search in half to find it faster 
//                 int binarySearch(int arr[], int l, int r, int x)
//     {
//         if (r >= l) {
//             int mid = l + (r - l) / 2;
 
//             // If the element is present at the
//             // middle itself
//             if (arr[mid] == x)
//                 return mid;
 
//             // If element is smaller than mid, then
//             // it can only be present in left subarray
//             if (arr[mid] > x)
//                 return binarySearch(arr, l, mid - 1, x);
 
//             // Else the element can only be present
//             // in right subarray
//             return binarySearch(arr, mid + 1, r, x);
//         }
 
//         // We reach here when element is not present
//         // in array
//         return -1;
//     }
 
//     // Driver method to test above
//     public static void main(String args[])
//     {
//         BinarySearch ob = new BinarySearch();
//         int arr[] = { 2, 3, 4, 10, 40 };
//         int n = arr.length;
//         int x = 10;
//         int result = ob.binarySearch(arr, 0, n - 1, x);
//         if (result == -1)
//             System.out.println("Element not present");
//         else
//             System.out.println("Element found at index " + result);
//     }
// }

            //Insertion sort - choo choo train; number is compared to the number right infront of it. If larger, the numbers stay in place. If smaller, the number goes behind the int and goes through the other numbers until it is larger than the one behind it 
            //Selection sort - always finds the smallest integer and swaps with the integer its replacing
            //Overloading method - same method but different parameters (for example, a second method for doubles instead of ints)
            //multidimensional arrays - an array that holds multiple arrays. For example, (rows) and (columns)

            //Sort arrays in ascending order:
//             import java.util.Arrays;
  
// // Main class
// public class GFG {
  
//     // Main driver method
//     public static void main(String[] args)
//     {
//         // Custom input array
//         int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
  
//         // Applying sort() method over to above array
//         // by passing the array as an argument
//         Arrays.sort(arr);
  
//         // Printing the array after sorting
//         System.out.println("Modified arr[] : %s",
//                            Arrays.toString(arr));
//     }

            //Sort Arrays in descending order 
                // Arrays.sort(array, Collections.reverseOrder());



        
        //Input validation method for 2-25
//     public static int getInt(Scanner scnr) {
//         boolean buggin = false;
//         int intValue = 0;

//         do {
//             if(!scnr.hasNextInt()) {
//                 System.out.println("You did not enter an integer value");
//                 scnr.nextLine();
//             }
//             else {
//                 intValue = scnr.nextInt();
//                 if((intValue < 2) || (intValue > 25)) {
//                     System.out.println("You did not enter a valid selection. Please input a number between 2 and 25 .");
//                     scnr.nextLine();

//                 }
//                 else {
//                     buggin = true;
//                 }
                
//             }

//         }while(!buggin);

//         return intValue;
//    }


    }
    
}
