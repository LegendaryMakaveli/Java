import java.util.Scanner;

public class MultipleOfSix {

public static void main(String[] args) {
Scanner multiple  = new Scanner(System.in);

System.out.println("Enter a number: ");
int numberOne = multiple.nextInt();

if (numberOne % 6 == 0 || numberOne % 7 == 0) {
System.out.printf("%d is a multiple of 6 or 7",  numberOne);
} else {
 System.out.printf("%d is neither the multiple of 6 or 7", numberOne);
}
}
}