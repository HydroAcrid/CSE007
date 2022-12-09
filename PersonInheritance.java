/*
Kevin Dotel
11/20/21
CSE 7: Activity
This is the PersonInheritance program
*/

public class PersonInheritance {
    public static void main(String[] args) {

        //Variables
        Person p = new Person ("Wynn", "123 Main St", "19920703");
        Student[] roster = new Student[5];
        LehighPerson lp1 = new LehighPerson();

        enrollStudents(roster);

        lp1.setName("Kara"); //LP Invoking a P method

        LehighPerson lp2 = roster[1];
        System.out.println(roster[1].toString());
        System.out.println(lp2.toString());

        lp2.setName("Paulo");
        lp2.setBirthdate("20020123");
        display(lp2);
        display(roster[0]);

    }

    //Student list method 
    public static void enrollStudents(Student[]list) {
        list[0] = new Student("Alexandra James", "Campus Square", "20030220", "2131230", "Alj@lehigh.edu");
        list[1] = new Student("Tyler Roberts", "University Center", "20010415", "231140", "Tyr@lehigh.edu");
        list[2] = new Student();
        list[3] = new Student();
        list[4] = new Student();

    }

    public static void display(LehighPerson lp) {
        System.out.println("Lin " + lp.getLin() + "; email: " + lp.getEmail());

    }
    
}
