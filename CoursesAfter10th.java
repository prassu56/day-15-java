import java.util.Scanner;

public class CoursesAfter10th {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**Courses available after 10th standard:**");
        System.out.println("1. Science ");
        System.out.println("2. Commerce ");
        System.out.println("3. Arts ");
        System.out.println("4. Diploma in Engineering ");
        System.out.println("5. Diploma in Computer Science ");

        System.out.print("Enter the course number you are interested in: ");
        int courseNumber = scanner.nextInt();

        switch (courseNumber) {
            case 1:
                System.out.println("You have selected Science course.\n Duration is: 2 years");
                break;
            case 2:
                System.out.println("You have selected Commerce course.\n Duration is: 2 years");
                break;
            case 3:
                System.out.println("You have selected Arts course.\n Duration is: 2 years");
                break;
            case 4:
                System.out.println("You have selected Diploma in Engineering course.\n Duration is: 3 years");
                break;
            case 5:
                System.out.println("You have selected Diploma in Computer Science course.\n Duration: 3 years");
                break;
            default:
                System.out.println("Invalid course number.");
        }

        
    }
}