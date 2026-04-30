package JavaConstructor;

public class StudentDetailsUsingArray {

    static class Student {
        String name;
        int marks;

        // Constructor to initialize student data
        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        // Method to print student details
        void printDetails() {
            System.out.println("Name: " + name + ", Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        // Create an array to hold 3 students
        Student[] students = new Student[3];

        // Initialize each student with name and marks
        students[0] = new Student("Likki", 99);
        students[1] = new Student("Rahul", 85);
        students[2] = new Student("Priya", 92);

        // Loop through the array and print each student's details
        for (int i = 0; i < students.length; i++) {
            students[i].printDetails();
        }
    }
}