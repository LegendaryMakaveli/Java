import java.util.Scanner;

public class Problem9 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter investment amount");
double investment = problem.nextDouble();

System.out.print("Enter annual interest rate in percentage");
double rate = problem.nextDouble();

System.out.print("Enter number of year");
double year = problem.nextDouble();

double montlyRate = rate / 12 / 100;

double result = investment * Math.pow(1 + montlyRate, year * 12);

System.out.print("Accumulated value is: " + result);
}
}

/* to solve this i have to divide the interest rate by 12 and by 100% */