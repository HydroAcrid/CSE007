public class ColorMethods {

    public static string findColor (String color) {
        String colorName = " ";
        switch(color) {
            case "000000": colorName = "Black"; break;
            case "FFFFFF": colorName = "White"; break;
        }
    }

    public static void removeGray (int red, int green, int blue) {
        if((red == green) && (red == blue)) {
            red = 0;
            green = 0;
        }
    }
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

    }
    
}
