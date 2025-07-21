import java.util.Scanner;

public class Problem4 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter your balance: ");
double balance = problem.nextDouble();

System.out.print("Enter intrest rate: ");
double intrest = problem.nextDouble();

double calculate = balance * (intrest/1200);

System.out.print("The intrest rate is: " + calculate);
}
}

