import java.sql.Date;

public class Student {
    private int studentNumber;
    private String major = "";
    private String firstName = "";
    private String lastName = "";
    private int credits = 0;
    private Date dateCreated;
    private String[] courses = new String[5];

    Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public void enroll(String course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                System.out.println(firstName + " " + lastName + " has been added to " + course);
                break;
            }
        }
    }

    public void unenroll(String course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == course) {
                courses[i] = null;
                System.out.println(firstName + " " + lastName + " Has been removed from " + course);
                break;
            }
        }
    }
}
