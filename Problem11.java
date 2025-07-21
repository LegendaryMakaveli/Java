import java.util.Scanner;

public class Problem11 {

public static void main(String[] args){

Scanner problem = new Scanner(System.in);

System.out.print("Enter first integers: ");
int num1 = problem.nextInt();

System.out.print("Enter second integers: ");
int num2 = problem.nextInt();

System.out.print("Enter third integers: ");
int num3 = problem.nextInt();

System.out.print("Enter fourth integers: ");
int num4 = problem.nextInt();

int sumEven = 0;
int sumOdd = 0;

if(num1 % 2 == 0) sumEven += num1; else sumOdd += num1;
if(num2 % 2 == 0) sumEven += num2; else sumOdd += num2;
if(num3 % 2 == 0) sumEven += num3; else sumOdd += num3;
if(num4 % 2 == 0) sumEven += num4; else sumOdd += num4;


System.out.println("The sum of Even number is: " + sumEven);
System.out.println("The sum of Odd number is: " + sumOdd);

}
}