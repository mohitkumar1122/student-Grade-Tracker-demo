import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

 class Student1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        // Input grades
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }
        
        // Calculate average
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numberOfStudents;
        
        // Find highest and lowest grade
        int highestGrade = Collections.max(grades);
        int lowestGrade = Collections.min(grades);
        
        // Output results
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
        
        scanner.close();
    }
}