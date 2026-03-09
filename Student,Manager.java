import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public Student findStudentByRegistrationNumber(int regNo) {
        for (Student s : students) {
            if (s.getRegistrationNumber() == regNo) {
                return s;
            }
        }
        return null;
    }

    public void searchStudentByName(String name) {
        boolean found = false;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int regNo) {
        Student s = findStudentByRegistrationNumber(regNo);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
