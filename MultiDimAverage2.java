import java.util.Scanner;
public class MultiDimAverage{
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int row = getLength(s);
  int col = getLength(s);
  char type = getType(s);
  switch(type){
     case 'i':
        int[][]arrI = new int[row][col];
        for(int i = 0; i<arrI.length; i++){
          for(int j = 0; j<arrI[i].length; j++){
             arrI[i][j] = (int)(Math.random()*100 +1);
        }
    }
  
        System.out.println("The average is: "+ findAverage(arrI));
        break;
    /* case 'd':
        double[][]arrD = new double[row][col];
        for(int i = 0; i<arrD.length; i++){
             arrD[i] = (Math.random()*100 +1);
         }           
        System.out.println(Arrays.toString(arrD));
        System.out.println("The average is: "+ findAverage(arrD));   
        break;
       }*/
    }
       s.close();
}
   public static double findAverage(int[][]list){
    double avg, sum=0;
    int count = 0;
    for(int j = 0; j < list.length; j++){
      for(int i = 0; i<list[j].length; i++){
        sum += list[j][i];
        count++;
    }
}
    avg = sum / list.length;
    return avg;
}
/*public static double findAverage(double[][]list){
    double avg, sum=0;
    for(int i = 0; i<list.length; i++){
        sum += list[i];
    }
    avg = sum / list.length;
    return avg;
}*/
public static char getType(Scanner scan){
    char type = '\u0000';
    boolean loopControl = true;
    do{
        System.out.println("enter an i or d");
        type = scan.nextLine().charAt(0);
        if(type == 'i' || type == 'd'){
            loopControl = false;
        } else {
            System.out.println("invalid type, try again");
        }
    }while(loopControl);
    return type;
}
public static int getLength(Scanner scan){
    int length = 0;
    boolean loopControl = true;
    do{
        System.out.println("Enter a number between 2 and 25");
        if(scan.hasNextInt()){
            length = scan.nextInt();
            scan.nextLine();
            if(length >=2 && length <=25){
                loopControl = false;
            } else{
                System.out.println("# outside of range");
            }
        } else {
            System.out.println("not an int");
            scan.nextLine();
        }
    } while (loopControl);
    return length;
}


}

