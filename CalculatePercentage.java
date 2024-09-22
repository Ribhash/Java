import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        System.out.print("Enter the total marks: ");
        double totalMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("The percentage is: " + percentage + "%");

        scanner.close();
    }
}
