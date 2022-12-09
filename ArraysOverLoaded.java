/*
Kevin Dotel
10/28/21
CSE 7: Lab 8
This is the ArraysOverLoaded program. 
*/
import java.util.Arrays;
public class ArraysOverLoaded {
    public static void main(String[] args) {

        //Variables
        int [] list1 = {1,2,3,4};
        int [] list2 = {5,2,3,4};
        char [] list3 = {'a','b','c','d'};
        char [] list4 = {'e','f','g','h'};

        //Boolean equals section
        boolean intEquals = equals(list1, list2);
        System.out.println("public static int boolean equals: " + intEquals);
        boolean charEquals = equals(list3, list4);
        System.out.println("public static char boolean equals: " + charEquals);

        //Combination section 
        int [] combinedArray = join(list1, list2);
        char [] combinedCharArray = join(list3, list4);
        System.out.println(Arrays.toString(combinedArray));
        System.out.println(Arrays.toString(combinedCharArray));

        //Index section
        int index1 = indexOf(list1, 4);
        int index2 = indexOf(list3, 'd');
        System.out.println("Index 1: " + index1);
        System.out.println("Index 2: " + index2);

        //ElementAt section
        System.out.println ("Integer found at [3]: " + elementAt(list1, 3));
        System.out.println("Character found at [3]: " + elementAt(list3, 3));

        //System.out.println(elementAt(list3, 'a'));
        //index1 = 0; 
        //index2 = 0;

        //NewIndex section
        int newIndex1 = addElement(list1, index1, 3);
        int newIndex2 = addElement(list3, index2, 'f');
        System.out.println("New intIndex: " + newIndex1);
        System.out.println("New charIndex: " + newIndex2);

        // System.out.println(Arrays.toString(list5));
        // newIndex = addElement(list5, newIndex, 100);
        // System.out.println(Arrays.toString(list5));
        // index = 0;
        // System.out.println(list6, index, 'a');
        // System.out.println(Arrays.toSttring(list6));

    }

    //Int equals method
    public static boolean equals(int [] list1, int [] list2) {
        if(list1.length != list2.length) {
            return false;
        }
        for(int i = 0; i < list1.length; i++) {
            if(list1[i] != list2[i]) {
                return false;
            }
        }
        return true; 
    }

    //Char equals method
    public static boolean equals(char [] list3, char [] list4) {
        if(list3.length != list4.length) {
            return false;
        }
        for(int i = 0; i < list3.length; i++) {
            if(list3[i] != list4[i]) {
                return false;
            }
        }
        return true; 
    }

    //Combination int method
    public static int [] join(int [] list1, int [] list2) {
        int [] list3 = new int[list1.length + list2.length];
        int index = 0;
        for(index = 0; index < list1.length; index++) {
            list3[index] = list1[index];
        }
        for(int j = 0; j < list2.length; j++,index++) {
            list3[index] = list2[j];
        }
        return list3;
    }

    //Combination char method
    public static char [] join(char [] list3, char [] list4) {
        char [] list5 = new char[list3.length + list4.length];
        int index = 0;
        for(index = 0; index < list3.length; index++) {
            list5[index] = list3[index];
        }
        for(int j = 0; j < list4.length; j++,index++) {
            list5[index] = list4[j];
        }
        return list5;
    }

    //Int indexOf method 
    public static int indexOf(int [] list, int value) {
        int index = -1;
        for(int i = 0; i < list.length; i++) {
            if(list[i] == value) {
                return i; 
            }
            else {
                index = -1; 
            }
            
        }
        return index;
    }

    //Char indexOf method
    public static int indexOf(char [] list, char value) {
        int index = -1;
        for(int i = 0; i < list.length; i++) {
            if(list[i] == value) {
                return i; 
            }
            else {
                index = -1; 
            }
            
        }
        return index;
    }

    //int elementAt method
    public static int elementAt(int [] list, int index) {
            return list[index]; 

    }

    //char elementAt method 
    public static char elementAt(char [] list, int index) {
        return list[index]; 

    }

    //int addElement method
    public static int addElement(int [] list, int index, int value) {
        if(index >= list.length) {
            return index;
        }
        else {
            list[index] = value; 
            index++;
        }
        return index;
    }

    //char addElement method
    public static int addElement(char [] list, int index, char value) {
        if(index >= list.length) {
            return index;
        }
        else {
            list[index] = value; 
            index++;
        }
        return index;
    }
    
}
