import java.util.Scanner;
 
public class StudentProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
 
        System.out.print("Student number: ");
        String studentNumber = scanner.nextLine();
 
        System.out.print("Program: ");
        String program = scanner.nextLine();
 
        System.out.print("Year level: ");
        int yearLevel = scanner.nextInt();
 
        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();
 
        System.out.println("Name: " + fullName + ", Student Number: " + studentNumber + ", Program: " + program + ", Year Level: " + yearLevel + ", GPA: " + gpa);
    }
}
