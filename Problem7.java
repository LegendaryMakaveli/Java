import java.util.Scanner;

public class Problem7 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter the amount of water in kilograms: ");
double water = problem.nextDouble();

System.out.print("Enter the initial temperature: ");
double initial = problem.nextDouble();

System.out.print("Enter the final temperature: ");
double finals = problem.nextDouble();

double result = water * (finals - initial) * 4184;

System.out.print("The energy needed is:" + result);
}
}

/* formular for this is "Q = M (FinalTemperature - initialTemperature) * 4184" */