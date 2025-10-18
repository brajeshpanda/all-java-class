
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class MaxMarks {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 90),
                new Student("Bob", 85),
                new Student("Charlie", 95),
                new Student("David", 88)
        );

        // Use Java Stream API to find the student with the maximum marks
        Student studentWithMaxMarks = students.stream().
        		sorted(Comparator.comparingInt(Student::getMarks).thenComparing(Student::getName).reversed())
                .findFirst()
                .orElse(null);

        if (studentWithMaxMarks != null) {
            System.out.println("Student with max marks: " + studentWithMaxMarks.getName() +
                    ", Marks: " + studentWithMaxMarks.getMarks());
        } else {
            System.out.println("No students in the list.");
        }
    }
}
