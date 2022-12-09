public class HW3 {
    public static void main(String[] args) {
        
        int bin = 1101;
        int dec = 0;
        int remainder = 0;
        for (int counter = 0;counter < 4; counter++){
            remainder = bin % 10;
            System.out.println("remainder is " + remainder);
            dec = dec + remainder * (int) Math.pow(2,counter);
            bin = bin / 10;
            System.out.println("bin is " + bin);
        }
        System.out.println(dec);




    }
    
}
