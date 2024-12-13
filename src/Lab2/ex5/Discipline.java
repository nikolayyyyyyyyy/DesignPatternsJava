package Lab2.ex5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Discipline {
    private final String name;
    private final Map<Student,Integer> students;
    private final Teacher lecturer;
    private final Set<Teacher> teachers;

    public Discipline(String name,
                      Teacher lecturer,
                      Set<Teacher> teachers){
        this.name = name;
        this.lecturer = lecturer;
        this.teachers = teachers;
        this.teachers.add(lecturer);
        this.students = new HashMap<>();
    }

    public Map<Student, Integer> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public Teacher getLecturer() {
        return lecturer;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void addStudent(Student student, int points){
        if(!this.students.containsKey(student)){

            if(points < 0 || points > 40){

                throw new SemestrialControlExeption("Invalid semestrial control");
            }

            this.students.put(student,points);
        }
    }
}
