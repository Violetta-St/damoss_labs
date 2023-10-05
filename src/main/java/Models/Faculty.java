package Models;

public class Faculty {
    private int id;
    private int facultyNumber;
    private String facultyName;
    private String facultyShortName;
    private String phone;
    private facultyHead facultyHead;
    public static class facultyHead extends HeadOf{

        public facultyHead(String firstName, String lastName, String patronymic, HeadOf.academicDegree academicDegree) {
            super(firstName, lastName, patronymic, academicDegree);
        }
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getFacultyNumber() {return facultyNumber;}

    public void setFacultyNumber(int facultyNumber) {this.facultyNumber = facultyNumber;}

    public String getFacultyName() {return facultyName;}

    public void setFacultyName(String facultyName) {this.facultyName = facultyName;}

    public String getFacultyShortName() {return facultyShortName;}

    public void setFacultyShortName(String facultyShortName) {this.facultyShortName = facultyShortName;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public Faculty.facultyHead getFacultyHead() {return facultyHead;}

    public void setFacultyHead(Faculty.facultyHead facultyHead) {this.facultyHead = facultyHead;}

    public Faculty(int id, int facultyNumber, String facultyName, String facultyShortName, String phone, Faculty.facultyHead facultyHead) {
        this.id = id;
        this.facultyNumber = facultyNumber;
        this.facultyName = facultyName;
        this.facultyShortName = facultyShortName;
        this.phone = phone;
        this.facultyHead = facultyHead;
    }
}
