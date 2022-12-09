/*Kevin Dotel
9/9/21
CSE 7: Lab 1 
This program is for the logical op demo. 
*/

public class LogicalOpDemo {
    public static void main(String[] args) {
        
    boolean boo11 = true;
    boolean boo12 = true;
    boolean boo13 = true;
    boolean boo14 = true;
    boolean boo15 = true;

    System.out.println( !boo11 && !boo12 || boo13);
    System.out.println( boo12 || boo14 ^ boo15);
    System.out.println( !(boo11 ^ !boo14) && boo12);
    System.out.println( boo13 || !(boo15 && boo12));
    System.out.println(boo11 && (boo14 && boo12) ^ boo15 && boo13);










    }
}
