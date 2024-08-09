package Exercise1;

import java.util.ArrayList;

public class StudentRepository {
    private final ArrayList<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student(1, "John Doe", 20));
        students.add(new Student(2, "Jane Smith", 22));
    }

    public ArrayList<Student> findAll() {
        return students;
    }

    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void save(Student student) {
        students.add(student);
    }

    public void update(Student student) {
        Student existingStudent = findById(student.getId());
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
        }
    }

    public void delete(int id) {
        Student studentToRemove = null;

        for (Student student : students) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            students.remove(studentToRemove);
        }
    }
}
