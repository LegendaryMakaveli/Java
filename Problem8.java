import java.util.Scanner;

public class Problem8 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter a number (in feet)");
double feet = problem.nextDouble();

double calculate = feet * 0.305;

System.out.print("Meter is: " + calculate);
}
}