public class FindMax {
    public static void main(String[] args) {
        int num1 = 3;
        System.out.println("The maximum of 3 and 4 is " + max(num1,4.5));
        System.out.println(num1);
    }

    public static int max(double num1, int num2) {
        num1 = 7;
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    
}
