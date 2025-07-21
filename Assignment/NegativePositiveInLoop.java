import java.util.Scanner;

public class NegativePositiveInLoop {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int number = 0;

int positive = 0;
int negative = 0;
int zero = 0;

while (number != -999) {
System.out.println("Enter a number or -999 to quit");
 number = input.nextInt();


if (number > 0) {
  positive++;
} else if (number < 0) {
  negative++;
} else {
  zero++;
}
}
System.out.println("Total positive is: " + positive);
System.out.println("Total of negative is: " + negative);
System.out.println("Total of zero is: " + zero);

}
}