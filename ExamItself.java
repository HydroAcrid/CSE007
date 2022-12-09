import java.util.Arrays;
public class ExamItself {

    // public static void main(String[]args){
    //     int[][]numbers = new int[3][3];
    //     int counter = 0;
    //     for(int i = 0; i< numbers.length; i++){
    //         for(int j = 0; j<numbers[i].length; j++, counter++){
    //             numbers[i][j] = counter;
    //             }
    //         }
    //      System.out.println("Numbers before the call:\n" + Arrays.deepToString(numbers));
    //      numbers[0] = overload(numbers[1], numbers);        
    //      System.out.println("Numbers after the call:\n" + Arrays.deepToString(numbers));
    //     }

    // public static void main(String[]args){
    //     int[][]numbers = new int[3][3];
    //     int counter = 0;
    //     for(int i = 0; i< numbers.length; i++){
    //         for(int j = 0; j<numbers[i].length; j++, counter++){
    //             numbers[i][j] = counter;
    //             }
    //         }
    //      System.out.println("Numbers before the call:\n" + Arrays.deepToString(numbers));
    //      overload(numbers);      
    //      System.out.println("Numbers after the call:\n" + Arrays.deepToString(numbers));
    //     }

    public static void main(String[]args){
        int[][]numbers = new int[3][3];
        int counter = 0;
        for(int i = 0; i< numbers.length; i++){
            for(int j = 0; j<numbers[i].length; j++, counter++){
                numbers[i][j] = counter;
                }
            }
         System.out.println("Numbers before the call:\n" + Arrays.deepToString(numbers));
         overload(1, numbers[1], numbers);      
         System.out.println("Numbers after the call:\n" + Arrays.deepToString(numbers));}
        
    

    public static int[] overload(int[]array, int[]anotherOne){
        int [] third = new int [array.length];
        third = array;
        array = anotherOne;
        anotherOne = third;
        return third;
    }

    public static void overload(int[][]array){
        for(int i = 0, x = 1; i<array.length; i++,x++){
            array[i] = new int[x];
            for(int j=0; j<x; j++){
                array[i][j] = x*j;
            }
        }
        array = new int[100][100];
    }
    
    public static void overload(int num, int[] nums, int[][]nums2){
        int[]temp = nums;
        nums = nums2[num];
        nums2 = new int[num][num];
        nums2[0] = temp;
         }


}
