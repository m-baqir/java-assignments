package Assignment4;

public abstract class AlgomaStudent {
    private String name;
    private java.util.Date enrollmentDate;

    AlgomaStudent() {
        this.name = "No Name";
    }

    AlgomaStudent(String name, java.util.Date enrollmentDate) {
        this.name = name;
        this.enrollmentDate = new java.util.Date();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(java.util.Date enrollmenDate) {
        this.enrollmentDate = enrollmenDate;
    }

    public abstract int coursesLeft();

}
