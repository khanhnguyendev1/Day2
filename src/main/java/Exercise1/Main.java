package Exercise1;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext ("exercise1/beans.xml");

        StudentService studentService = applicationContext.getBean("studentService" ,StudentService.class);

        System.out.println("Initial students:");
        studentService.getAllStudents().forEach(System.out::println);

        Student newStudent = new Student(3, "Mark Johnson", 21);
        studentService.addStudent(newStudent);
        System.out.println("After adding new student:");
        studentService.getAllStudents().forEach(System.out::println);

        Student updatedStudent = new Student(3, "Mark Updated", 22);
        studentService.updateStudent(updatedStudent);
        System.out.println("After updating student:");
        studentService.getAllStudents().forEach(System.out::println);

        studentService.deleteStudent(1);
        System.out.println("After deleting student:");
        studentService.getAllStudents().forEach(System.out::println);
    }
}
