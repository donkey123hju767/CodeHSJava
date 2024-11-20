import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of students and their grades
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[] grades = new int[numStudents];

        System.out.println("Enter the grades for the students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Step 2: Calculate the average grade
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;

        // Step 3: Find the highest and lowest grades
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }

        // Step 4: Sort the grades
        Arrays.sort(grades);

        // Step 5: Display the results
        System.out.println("\nResults:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
        System.out.println("Grades in ascending order: " + Arrays.toString(grades));

        scanner.close();
    }
}

        return radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter() {return Math.PI * 2 * radius;}
}
