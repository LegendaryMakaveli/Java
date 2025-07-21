import java.util.Scanner;

public class Problem1 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter starting velocity (m/s): ");
double startingVelocity = problem.nextDouble();

System.out.print("Enter second velocity (m/s): ");
double endingVelocity = problem.nextDouble();

System.out.print("Enter time span (s): ");
double timeSpan = problem.nextDouble();

double result = (endingVelocity - startingVelocity) / timeSpan;

System.out.print("The average acceleration is: " + result);

}
}