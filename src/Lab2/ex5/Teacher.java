package Lab2.ex5;

public class Teacher extends Person {
    private AcademicPosition academicPosition;

    public Teacher(String name,
                   AcademicPosition academicPosition) {
        super(name);
        this.academicPosition = academicPosition;
    }

    public void setAcademicPosition(AcademicPosition academicPosition) {
        this.academicPosition = academicPosition;
    }

    public AcademicPosition getAcademicPosition() {
        return academicPosition;
    }

}
