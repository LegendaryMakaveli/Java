import java.util.Scanner;

public class MultipleOfOtherNumber {

public static void main(String... args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int numberOne = input.nextInt();

System.out.println("Enter another number");
int numberTwo = input.nextInt();

int result = 1;
for (result =1; numberTwo != 0; numberTwo--) {
result *= numberOne;
}
System.out.println("Raise to the power of " + numberOne + " " + "is" + " " + result);
}
}