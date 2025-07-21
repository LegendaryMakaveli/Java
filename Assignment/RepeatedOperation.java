import java.util.Scanner;

public class RepeatedOperation {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int numberOne ;
int numberTwo;
int sum = 0;

do {
	System.out.println("Enter first number");
		numberOne = input.nextInt();

	System.out.println("Enter second number");
		numberTwo = input.nextInt();

		sum = numberOne + numberTwo;
System.out.println("The sum is " + sum);
	System.out.println("Do you wish to continue" + " " + "If No press 0 " );
} while (numberOne != 0 );
	sum = numberOne + numberTwo;
System.out.println("Thank you for coming");

}
}