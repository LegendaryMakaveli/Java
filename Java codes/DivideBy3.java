import java.util.Scanner;

public class DivideBy3 {

public static void main(String[] args) {

Scanner divide = new Scanner(System.in);

System.out.print("Enter an integer");
int numberOne = divide.nextInt();

if(numberOne % 3 == 0) {
System.out.println("This number is divisible by 3");
} else {
System.out.println("This number is not divisible by 3" );
}
}
}