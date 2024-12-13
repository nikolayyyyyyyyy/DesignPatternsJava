package Lab2.ex5;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Exam {
    private final Discipline discipline;
    private final Random random;

    public Exam(Discipline discipline){
        this.discipline = discipline;
        this.random = new Random();
    }

    public Map<Set<Student>,Integer> run(){
        for (Student student :
                this.discipline.getStudents().keySet()) {
            this.discipline
                    .getStudents()
                    .put(student,
                            this.discipline.getStudents()
                                    .get(student) + random.nextInt(61));

        }
        Map<Set<Student>,Integer> res = new HashMap<>();
        res.put(this.discipline.getStudents().keySet(),
                this.discipline.getStudents().values().stream().mapToInt(Integer::intValue).sum());

        return res;
    }
}
