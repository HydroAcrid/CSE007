/*
Kevin Dotel
11/20/21
CSE 7: Activity
This is the Student program
*/

public class Student extends LehighPerson {

    private String major;
    private String anticipatedGradDate;
    private static int totalCSEnrollment = 0;

    public Student() {
        //Empty default call 
    }

    public Student(String lin, String email) {
        super(lin, email);
    }

    public Student(String name, String address, String birthdate, String lin, String email) {
        super(lin, email, name, address, birthdate);
    } 

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAnticipatedGradDate() {
        return anticipatedGradDate;
    }

    public void setAnticipatedGradDate(String anticipatedGradeDate) {
        this.anticipatedGradDate = anticipatedGradeDate;
    }

    public static int getTotalCSEEnrollment() {
        return totalCSEnrollment;
    }



    
}
