package Models;

public class HeadOf {
    private String firstName;
    private String lastName;
    private  String patronymic;
    private academicDegree academicDegree;

    public enum academicDegree {
        professor,
        docent,
        seniorTeacher,
        assistant
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public HeadOf.academicDegree getAcademicDegree() {return academicDegree;}

    public void setAcademicDegree(HeadOf.academicDegree academicDegree) {this.academicDegree = academicDegree;}

    public HeadOf(String firstName, String lastName, String patronymic, HeadOf.academicDegree academicDegree) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.academicDegree = academicDegree;
    }
}
