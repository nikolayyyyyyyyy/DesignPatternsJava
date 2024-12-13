package Lab2.ex5;

public class Student extends Person implements Comparable<Student>{
    private Course course;
    private final int facNumber;
    public Student(String name,
                   Course course,
                   int facNumber) {
        super(name);
        this.course = course;
        this.facNumber = facNumber;
    }

    public int getFacNumber() {
        return facNumber;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.facNumber,o.facNumber);
    }
}
