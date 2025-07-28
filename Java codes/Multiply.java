import java.util.Scanner;

public class Multiply {

public static void main(String[] args) {

Scanner multiply = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int firstNumber = multiply.nextInt();

System.out.print("Enter the second integer: ");
int secondNumber = multiply.nextInt();

firstNumber = firstNumber * 3;
secondNumber = secondNumber * 2;

if (secondNumber % firstNumber == 0){
System.out.print("firstNumber is a mutiple of secondNumber");
} else {
  System.out.println("firstNumber is not a multiple of secondNumber");
}
}
}