import java.util.Scanner;

public class Problem14 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter first integer");
int numberOne = problem.nextInt();

System.out.print("Enter second integer");
int numberTwo = problem.nextInt();

numberOne = numberOne + numberTwo;
numberTwo = numberOne - numberTwo; // this gives numberOne the value of numberTwo
numberOne = numberOne - numberTwo;

System.out.println("The value of first integer after swap is: " + numberOne);
System.out.println("The value of second integer after swap is: " + numberTwo);

}
}