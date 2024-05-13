package gitlearning;

import java.util.Scanner;

public class Student {
    private int marksSubject1;
    private int marksSubject2;
    private int marksSubject3;

    // Constructor to initialize student marks
    public Student(int marksSubject1, int marksSubject2, int marksSubject3) {
        this.marksSubject1 = marksSubject1;
        this.marksSubject2 = marksSubject2;
        this.marksSubject3 = marksSubject3;
    }

    // Method to calculate total marks
    public int calculateTotalMarks() {
        return marksSubject1 + marksSubject2 + marksSubject3;
    }

    // Method to find grade based on total marks
    public char findGrade() {
        int totalMarks = calculateTotalMarks();
        if (totalMarks >= 80) {
            return 'A';
        } else if (totalMarks >= 60) {
            return 'B';
        } else if (totalMarks >= 40) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get marks of student 1
        System.out.println("Enter marks for Student 1:");
        System.out.print("Subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int marks3 = scanner.nextInt();

        //student 1 object
        Student student1 = new Student(marks1, marks2, marks3);

        // Get marks of student 2
        System.out.println("Enter marks for Student 2:");
        System.out.print("Subject 1: ");
        marks1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        marks2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        marks3 = scanner.nextInt();

        // Create student 2 object
        Student student2 = new Student(marks1, marks2, marks3);

        // Find and print grade of each student
        System.out.println("Grade of Student 1: " + student1.findGrade());
        System.out.println("Grade of Student 2: " + student2.findGrade());

        scanner.close();
    }
}