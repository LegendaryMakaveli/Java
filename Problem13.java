import java.util.Scanner;

public class Problem13 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter a number between 0 and 1000: ");
int number = problem.nextInt();

int sum = 0;

sum += number / 100;
sum += (number / 10) % 10;
sum += number % 10;

System.out.print("The sum of digit is: " + sum);
}
}