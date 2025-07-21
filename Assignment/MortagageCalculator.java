import java.util.Scanner;

public class MortagageCalculator {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter principal amount");
double principal = input.nextInt();

System.out.println("Enter annual interest rate");
double interest = input.nextFloat();

System.out.println("Enter loan duration");
double duration = input.nextInt();


double solveForAnnualRate = interest / 12;

double solveForAnnualRate2 = solveForAnnualRate / 100;

double solveForDuration = duration * 12;

double solveForNumerator = solveForAnnualRate2 * Math.pow(1 + solveForAnnualRate2, solveForDuration);

double solveForDenomerator =  Math.pow(1 + solveForAnnualRate2, solveForDuration) -1;

double solveTogether =  solveForNumerator / solveForDenomerator;

double montlyPayment = principal * solveTogether;

System.out.printf("Your montly payment is %.2f", montlyPayment);


}
}