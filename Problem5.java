import java.util.Scanner;

public class Problem5 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter number (in-pounds): ");
double pounds = problem.nextDouble();

double calculate = pounds * 0.453;

System.out.print("Kilogram is: " + calculate);
}
}

/* formular for convertig pounds to kilogram is"Pounds * 0.453",
    if e nur later change in the future */