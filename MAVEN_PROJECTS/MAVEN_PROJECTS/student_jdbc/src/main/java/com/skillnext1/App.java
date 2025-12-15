package com.skillnext1;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            try {
                switch (choice) {

                    case 1:
                        // ADD Student
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Semester: ");
                        int sem = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        Student stu = new Student(name, sem, dept);
                        dao.addStudent(stu);
                        System.out.println("Student added successfully!");
                        break;

                    case 2:
                        // VIEW Students
                        List<Student> list = dao.getAllStudents();
                        System.out.println("\n--- Student List ---");
                        for (Student s : list) {
                            System.out.println(s);
                        }
                        break;

                    case 3:
                        // UPDATE Student
                        System.out.print("Enter Student ID to Update: ");
                        int upId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter New Semester: ");
                        int newSem = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Department: ");
                        String newDept = sc.nextLine();

                        Student upStu = new Student(newName, newSem, newDept);
                        upStu.setId(upId);

                        dao.updateStudent(upStu);
                        System.out.println("Student updated!");
                        break;

                    case 4:
                        // DELETE Student
                        System.out.print("Enter Student ID to Delete: ");
                        int delId = sc.nextInt();
                        dao.deleteStudent(delId);
                        System.out.println("Student deleted!");
                        break;

                    case 5:
                        System.out.println("Exiting program...");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
