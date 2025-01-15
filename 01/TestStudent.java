
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith", 1234);
        student.enroll("Java1");
        student.enroll("Java2");
        student.enroll("Java3");
        student.enroll("Java4");
        student.enroll("Java5");
        student.unenroll("Java2");
    }
}
