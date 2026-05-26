import java.util.ArrayList;

public class StudentService {

    // ArrayList to store students
    ArrayList<Student> students = new ArrayList<>();

    // CREATE
    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student Added Successfully!");
    }

    // READ
    public void viewStudents() {

        if (students.isEmpty()) {

            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {

            System.out.println(s);
        }
    }

    // UPDATE
    public void updateStudent(int id, String newName) {

        for (Student s : students) {

            if (s.id == id) {

                s.name = newName;

                System.out.println("Student Updated Successfully!");

                return;
            }
        }

        System.out.println("Student not found.");
    }

    // DELETE
    public void deleteStudent(int id) {

        for (Student s : students) {

            if (s.id == id) {

                students.remove(s);

                System.out.println("Student Deleted Successfully!");

                return;
            }
        }

        System.out.println("Student not found.");
    }
}