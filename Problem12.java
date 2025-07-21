import java.util.Scanner;

public class Problem12 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter speed: ");
double speed = problem.nextDouble();

System.out.print("Enter acceeleration: ");
double acceleration = problem.nextDouble();

double length = Math.pow(speed, 2) / (2 * acceleration);

System.out.print("The minimun runway lenght is: " + length);


}
}